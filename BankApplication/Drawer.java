package nit.multithreading;
public class Drawer extends Thread
{
	private Account account;
	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}
	@Override
	public void run()
	{
		int []withdrawals = {100,300,500,1000};
		for(int withdraw:withdrawals)
		{
			account.withdraw(withdraw);
			try 
			{
				sleep(1000);
			} catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
}
