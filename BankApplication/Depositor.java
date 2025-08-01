package nit.multithreading;
public class Depositor extends Thread
{
	private Account account;

	public Depositor(Account account) 
	{
		super();
		this.account = account;
	}
	@Override
	public void run()
	{
		int []deposits = {80,310,520,1000};
		for(int deposit:deposits)
		{
			account.deposit(deposit);
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
