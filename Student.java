public class Student 
{
	
	//atributes
	private String name;
	private int idNumber;
	private double gpa;
	
	private static String highSchoolName = "Westwood";
	{
		highSchoolName = name;
	}
	public Student ()
	{
		name = null;
		idNumber=0;
		gpa=0;
	}
	public Student (String n)
	{
		name = n;
		idNumber= 0;
		gpa=0;
	}
	public void setName (String n)
	{
		name = n;
	}
	public void setGpa (double g)
	{
		gpa = g;
	}
	public String toString ()
	{
		return name +" "+idNumber+" "+gpa+" "+highSchoolName;
	} 
	
}