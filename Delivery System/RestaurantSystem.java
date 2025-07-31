package nit.multithreading;

import java.util.Scanner;

public class RestaurantSystem 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Restaurant name: ");
		String name= sc.nextLine();
		System.out.print("Enter order name: ");
		String order=sc.nextLine();
		Restaurant r= new Restaurant(name);
		System.out.println("Welcome to "+r.getRestaurantName());
		Waiter w= new Waiter(r);
		w.acceptOrder(order);
		Chef c= new Chef(r);
		w.start();
		c.start();
		sc.close();
	}

}
