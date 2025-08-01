package nit.multithreading;

public class ATMMachine {

	public static void main(String[] args) 
	{
		Account ac = new Account();
		Drawer d=new Drawer(ac);
		Depositor de= new Depositor(ac);
		d.start();
		de.start();
	}

}
