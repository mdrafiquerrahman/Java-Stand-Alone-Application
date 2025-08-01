package nit.multithreading;
public class Account 
{
  private int balance = 0;
  public synchronized void withdraw(int amount)
  {
	  while(this.balance<amount)
	  {
		  try
		  {
			wait();
		  } 
		  catch (InterruptedException e) 
		  {
			
			e.printStackTrace();
		  }
	  }
	  if(this.balance>amount)
	  {
		  this.balance=this.balance-amount;
		  System.out.println("Updated balance: "+this.balance);
	  }
  }
  public synchronized void deposit(int amount) 
  {
	this.balance=this.balance+amount;
	System.out.println("Upadted balance: "+this.balance);
	notify();
  }
}
