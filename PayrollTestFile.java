import java.util.Scanner; 

public class PayrollTestFile
{



public static void main (String [] args)
	{
	Scanner scan = new Scanner(System.in);
		
	
	String name = " ";
	int idNum = 0;
	double hourlyPayRate= 0;
	double numberOfHoursWorked = 0;
	
	System.out.print ("Enter a Name: ");
	name = scan.nextLine();	
	
		
	System.out.print("Enter ID Number:");
	idNum= scan.nextInt();
	
	
	System.out.print("Enter Hourly Pay Rate:");
	hourlyPayRate= scan.nextInt();
	
	
	System.out.print("Enter Number of Hours Worked:");
	numberOfHoursWorked= scan.nextDouble();
	
	
	Payroll person1 = new  Payroll(name,idNum, hourlyPayRate, numberOfHoursWorked);
	System.out.print(person1);
	
	
	}
}
