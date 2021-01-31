import java.util.Scanner; 
public class AverageAcceleration
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double vInitial= 0;
		double vFinal = 0;
		double time = 0;
		double averageAcceleration = 0;
			
		System.out.print("Enter starting velocity in meters/seconds: ");
		vInitial = scan.nextDouble();
		System.out.print("Enter ending velocity in meters/seconds:");
		vFinal = scan.nextDouble();
		System.out.print("Enter time in seconds: ");
		time = scan.nextDouble();
		
		
		averageAcceleration = findAverageAcceleration(vInitial, vFinal, time );
		
			
		System.out.println("The Average Acceleration is " + averageAcceleration  );
	
	
	
	}
	public static double findAverageAcceleration(double v0, double v1,double t)
	{
		return ((v1-v0)/t);
	}
}	