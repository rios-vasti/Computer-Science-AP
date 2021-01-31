import java.util.Scanner;
 
public class DetermineHours

{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double years = 0;
		double days = 0;
		double weeks = 0;
	
		
		System.out.print("Enter the number of years you have been alive: ");
		years = scan.nextDouble();
		days = yearsToDays(years);
		weeks= yearsToWeeks(years);
		
		System.out.println("You have lived " + days + " days");
		System.out.println("You have lived " + weeks + " weeks");
	}
	
	public static double yearsToDays ( double years)
	{
		return years * 365;
	}
	
	public static double yearsToWeeks (double years)
	{
		return years * 52.1429;
	}
}