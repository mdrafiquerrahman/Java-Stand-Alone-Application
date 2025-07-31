package nit.multithreading;
public class Restaurant 
{
private String name;
private String order;
private boolean isOrderReady=false;
public Restaurant(String name) 
{
	super();
	this.name = name;
}
public synchronized void placeOrder(String order)
{
	this.order=order;
	System.out.println("Waiter: Placed order for "+this.order);
	try 
	{
		while(!isOrderReady)
		{	
		wait();
		}
		if(isOrderReady)
		{
			System.out.println(this.order+" is ready!");
		}
	} catch (InterruptedException e) 
	{
		System.out.println("Order get interrrupted");
	}
	System.out.println("Waiter: Serving the "+this.order);
}
public synchronized void prepareOrder() 
{
	System.out.println("Chef: Preparing "+this.order);
	try 
	{
		Thread.sleep(1000);
	} catch (InterruptedException e) 
	{
		e.printStackTrace();
	}
	this.isOrderReady=true;
	notify();
}
public String getRestaurantName()
{
	return this.name;
}
}
