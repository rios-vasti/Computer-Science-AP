public class SchoolFundraiser {

	String name;
	int numSmall;
	int numMedium;
	int numLarge;
	int numXLarge;
	private static final double COST_SML = 8.45;
	private static final double COST_XL = 8.65;
	private static final double CHARGED_AMOUNT = 10.00;

	public SchoolFundraiser(String name,int numSmall, int numMedium, int numLarge, int numXLarge)
	{	
		this.name = name;
		this.numSmall= numSmall;
		this.numMedium = numMedium;
		this.numLarge = numLarge;
		this.numXLarge = numXLarge;
		
	}
	
	public SchoolFundraiser()
	{
		name = "";
		numSmall= 0;
		numMedium=0;
		numLarge=0;
		numXLarge=0;
		
	}
	
	public void setName(String name)
	  {
	    this.name = name;
	  }
	  public void setNumSmall (int numSmall)
	  {
	    this.numSmall= numSmall;
	  }
	  public void setNumMedium(int numMedium)
	  {
	    this.numMedium = numMedium;
	  }
	  public void setNumLarge (int numLarge)
	  {
	    this.numLarge= numLarge;
	  }
	  public void setNumXLarge(int numXLarge)
	  {
	    this.numXLarge= numXLarge;
	  }
	 
	  
	 
	    public String getName()
	  {
	    	return name;
	  }
	  public int  getNumSmall ()
	  {
		  return numSmall;
	  }
	
	  public int  getNumMedium ()
	  {
		  return numMedium;
	  }
	  public int  getNumLarge ()
	  {
		  return numLarge;
	  }
	  public int  getNumXLarge ()
	  {
		  return numXLarge;
	  }
	  
	  public double moneyDeposited()
	  {

		  return (((numSmall +numMedium+numLarge )* 10)+(10*numXLarge));
	  }	  
	  public double moneyPayed()
	  {	  
		  return ((numSmall +numMedium+numLarge )* COST_SML)+(COST_XL*numXLarge);
	  }
	  public double profit()
	  {
	  	return moneyDeposited()-moneyPayed();
	  }
		  
		  
	  
	}