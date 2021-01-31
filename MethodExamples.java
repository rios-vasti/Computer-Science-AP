public class MethodExamples
{
	public static void main (String [] args)
	{
		double surfaceArea = surfaceArea(5.25, 9.25);
		System.out.println("The surfaceArea is " +surfaceArea );
		
		double mass = 10.25;
		double speed= 2.25;
		System.out.println("The momentum is "+momentum(mass, speed));
		System.out.println("C squared is "+cSquared(3, 4));
		System.out.println("The temperature in celsius is "+temperatureConversion(90));
		
	}	
		
		public static double surfaceArea ( double radius, double height)
		{
			 return 2*Math.PI * radius * height;
			
		}
		
		public static double momentum (double mass, double speed)
		{
			return mass * speed;
			
		}
		
		
		public static double cSquared (double a, double b)
		{
			return Math.pow(b,2) + Math.pow(a,2)	;
	
		}
		
		public static double temperatureConversion (double f)
		{
			return (f-32) * (5.0/9.0);
			
		}
				
	
	
	
	
	
	
	
}