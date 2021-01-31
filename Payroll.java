import java.util.Scanner;  
public class Payroll 

{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;
	
	public Payroll(String name,int idNumber,double hourlyPayRate, double numberOfHoursWorked )
	{
		this.name = name;
		this.idNumber= idNumber;
		this.hourlyPayRate=hourlyPayRate;
		this.numberOfHoursWorked=numberOfHoursWorked;
	}
	
	public String getName()
	{
		return name;
	}
	public int getIdNumber()
	{
		return idNumber;
	}
	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}
	public double getNumberOfHoursWorked()
	{
		return numberOfHoursWorked;
	}
	
	public void setName (String name )
	{
		this.name= name; 
	}
	
	public void setIdNumber (int idNumber )
	{
		this.idNumber= idNumber; 
	}
	public void setHourlyPayRate (double hourlyPayRate )
	{
		this.hourlyPayRate= hourlyPayRate; 
	}
	
	public void setNumberOfHoursWorked (double numberOfHoursWorked )
	{
		this.numberOfHoursWorked= numberOfHoursWorked; 
	}
	public double returnGrossPay( )
	{
		double grossPay = numberOfHoursWorked*hourlyPayRate;
		return grossPay;
	}
	
	public String toString ()
	{
		return "Name: "+ name + " ID Number: " +idNumber + " Hourly Pay Rate: "+ hourlyPayRate + " Number of Hours Worked "+ numberOfHoursWorked +" Gross Pay "+ returnGrossPay();  
	}
}           