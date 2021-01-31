public class TestScores
{
	private String name;
	private double test1;
	private double test2;
	private double test3;
	
	public TestScores()
	{
		name = " ";
		test1= 0;
		test2= 0;
		test3= 0;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	
	public void setTest1(double score1)
	{
		test1= score1;
	}
	
	public void setTest2(double score2)
	{
		test2= score2;
	}
	
	public void setTest3(double score3)
	{
		test3= score3;
	}
	
	public double getTest1()
	{
		return test1;
	}
	
	public double getTest2()
	{
		return test2;
	}
	
	public double getTest3()
	{
		return test3;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double average()
	{
		return  ((test1+test2+test3)/3);
	}
	
	public String toString ()
	{
		return "\nName "+ name + "\nTest1 Score: " +test1 + "\nTest2 Score: " +test2 + "\nTest3 Score: " +test3+"\nAverage: " + average(); 
	}
}