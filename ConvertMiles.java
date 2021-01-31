
import java.util.Scanner; 
public class ConvertMiles
{

	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double miles = 0;
		double yards = 0;
		double feet = 0;
		double inches = 0;
			
			
			
		System.out.print("Enter the number of miles you walked: ");
		miles = scan.nextDouble();
			
		yards = milesToYards(miles);
			
		feet = milesToFeet(miles);
			
		inches = feetToInches(feet);
			System.out.println("You walked " + yards + " yards");
			System.out.println("You walked " + feet + " feet");
			System.out.println("You walked " + inches + " inches");
		
	}



	public static double milesToYards(double miles)
	{
		return 1760*miles;
	}
	
	public static double milesToFeet( double miles)
	{
		return 5280*miles;
	}
	
	public static double feetToInches(double feet)
	{
		return feet * 12;
	}
}
