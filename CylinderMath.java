import java.util.Scanner; 


public class CylinderMath
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double radius= 0;
		double length = 0;
		double area= 0;
		double volume = 0;
			
		System.out.print("Enter the radius of a cylinder: ");
		radius = scan.nextDouble();
		
		System.out.print("Enter the lenghth of a cylinder: ");
		length = scan.nextDouble();
		
		area = areaCylinder(radius);
			
		volume = volumeCylinder (area, length);
			
		System.out.println("The Arean is " + area  );
	
		System.out.println("The volume is " + volume  );
	
	}
	
	//determines and returns the area of a cylinder
	public static double areaCylinder(double radius)
	{
	return Math.pow(radius, 2) * Math.PI;	

	}
	
	//determines and returns the volume of a cylinder
	public static double volumeCylinder(double area,  double length)
	{
		return area * length;
	}
}	