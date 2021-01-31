import java.util.Scanner;
public class PayStubTestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			double payRate=0.0;
		 	int hoursMonday = 0;
	        int hoursTuesday=0;
	        int hoursWednesday=0;
	        int hoursThursday=0;
	        int hoursFriday=0;
       	PayStub employer1 = new PayStub();
       	
         Scanner scan = new Scanner(System.in);
       	
       	System.out.println("Name: ");
       	name = scan.nextLine();
       	employer1.setName(name);
       	
       	System.out.println("Pay Rate: ");
       	payRate = scan.nextInt();
       	employer1.setPayRate(payRate);
       	
       	System.out.println("Hours Worked Monday: ");
       	hoursMonday = scan.nextInt();
       	employer1.setHoursMonday(hoursMonday);
       	
       	System.out.println("Hours Worked Tuesday: ");
       	hoursTuesday = scan.nextInt();
       	employer1.setHoursTuesday(hoursTuesday);
       	
       	System.out.println("Hours Worked Wednesday: ");
       	hoursWednesday = scan.nextInt();
       	employer1.setHoursWednesday(hoursWednesday);
       	
       	System.out.println("Hours Worked Thursday: ");
       	hoursThursday = scan.nextInt();
       	employer1.setHoursThursday(hoursThursday);
       	
       	System.out.println("Hours Worked Friday: ");
       	hoursFriday = scan.nextInt();
       	employer1.setHoursFriday(hoursFriday);
       	
       	
       	System.out.println("Name: " + employer1.name);
       	System.out.println("Pay Rate:	$" + employer1.payRate);
       	
       	System.out.println("              	Hours         	Pay");
       	
       	System.out.println("Monday        	"+employer1.hoursMonday()+ "             	"+employer1.getPayMonday());
       	System.out.println("Tuesday       	" +employer1.hoursTuesday()+ "             	"+employer1.getPayTuesday());
       	System.out.println("Wednesday     	" +employer1.hoursWednesday()+"             	"+employer1.getPayWednesday()));
       	System.out.println("Thursday      	" +employer1.hoursThursday()+"             	"+employer1.getPayThursday());
       	System.out.println("Friday        	" +employer1.hoursFriday()+"             	"+employer1.getPayFriday());
       	System.out.println("-----------------------------------");
	  System.out.println("Overall Pay                  	" +employer1.totalPay();
       	
	}

}
