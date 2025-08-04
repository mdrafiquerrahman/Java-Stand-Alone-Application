package nit.multithreading;

public class DoseBooking 
{
	private boolean booked=false;
	
//	public DoseBooking(boolean booked) 
//	{
//		super();
//		this.booked = booked;
//	}
	public void bookDose()
	{
		
		if(booked)
		{
			throw new RuntimeException("Dose already booked.");
		}
		booked=true;
	}
	public boolean isDoseBooked()
	{
		return booked;
	}
}
