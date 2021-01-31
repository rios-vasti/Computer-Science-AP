public class PayStub
{
  String name;
  private int hoursMonday;
  private int hoursTuesday;
  private int hoursWednesday;
  private int hoursThursday; 
  private int hoursFriday;
  private int payMonday;
  private int payTuesday;
  private int payWednesday;
  private int payThursday; 
  private int payFriday;
  private double payRate;
  
  public PayStub (String name, int hoursMonday	, int hoursTuesday, int hoursWednesday, int hoursThursday, int hoursFriday, double payRate )
  {
    this.name = name;
    this.hoursMonday= hoursMonday;
    this.hoursTuesday= hoursTuesday;
    this.hoursWednesday=hoursWednesday;
    this.hoursThursday= hoursThursday;
    this.hoursFriday= hoursFriday;
    this.payRate = payRate;
  }
  public PayStub ()
  {
    name = "";
    hoursMonday=0;
    hoursTuesday=0;
    hoursWednesday=0;
    hoursThursday=0;
    hoursFriday=0;
    payRate=0.0;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public void setHoursMonday (int hoursMonday)
  {
    this.hoursMonday= hoursMonday;
  }
  public void setHoursTuesday(int hoursTuesday)
  {
    this.hoursTuesday = hoursTuesday;
  }
  public void setHoursWednesday (int hoursWednesday)
  {
    this.hoursWednesday= hoursWednesday;
  }
  public void setHoursThursday(int hoursThursday)
  {
    this.hoursThursday = hoursThursday;
  }
  public void setHoursFriday(int hoursFriday)
  {
    this.hoursFriday=hoursFriday;
  }
  public void setPayRate(double payRate)
  {
    this.payRate = payRate;
  }
  
  public double getPayRate()
  {
	  
	  return payRate;
  }
    public String getName()
  {
    	
    	return name;
  }
  public int  getHoursMonday ()
  {
	  
	  return hoursMonday;
  }
  public int getHoursTuesday()
  {
	  
	  return hoursTuesday;
  }
  public int getHoursWednesday ()
  {
	  
	  return hoursWednesday;
  }
  public int getHoursThursday()
  {
	  
	  return hoursTuesday;
  }
  public int getHoursFriday()
  {
	  
	  return hoursFriday;
  }
  
    
    //aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
  public int  getPayMonday ()
  {
	  
	  return hoursMonday*payRate;
  }
  public int getPayTuesday()
  {
	  
	  return hoursTuesday*payRate;
  }
  public int getPayWednesday ()
  {
	  
	  return hoursWednesday*payRate;
  }
  public int getPayThursday()
  {
	  
	  return hoursThursday*payRate;
  }
  public int getPayFriday()
  {
	  
	  return hoursFriday*payRate;
  }
  
  public double totalPay()
  {
	  
	  return (hoursMonday*payRate+getPayTuesday()+ getPayThursday()+getPayFriday());
  }
}

