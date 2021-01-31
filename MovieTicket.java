public class MovieTicket
{
	private String movieTitle;
	private int numAdultTickets;
	private int numChildTickets;

	private final static double COST_CHILD_TICKET= 8.0;
	private final static double COST_ADULT_TICKET=12.00;

	public MovieTicket (String title, int numA, int numC)
	{
		movieTitle= title;
		numAdultTickets= numA;
		numChildTickets=numC;
	}
	
	public void setMovieTitle(String t)
	{
		movieTitle=t;	
	}
	
	public void setNumAdultTickets(int numA)
	{
		numAdultTickets= numA;
	}
	
	public void setNumChildTickets(int numC)
	{
		numChildTickets= numC;
	}
		
	public String getMovieTitle()
	{
		return movieTitle;
	}
	
	public int getNumAdultTickets()
	{
		return numAdultTickets;
	}
	
	public int getNumChildTickets()
	{
		return numChildTickets;
	}
	public double determineCost()
	{
		return numAdultTickets*(COST_CHILD_TICKET)	+ numChildTickets*(COST_ADULT_TICKET);
	}
	
	public String toString ()
	{
		return movieTitle +  " " +numAdultTickets+" "+numChildTickets+" "+determineCost();
		
	}
}

