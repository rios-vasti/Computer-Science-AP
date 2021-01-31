import java.util.Scanner; 
public class AreaHex
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double side= 0;
		double area = 0;
	
			
		System.out.print("Enter the lenghth of a side of a Hexagon: ");
		side = scan.nextDouble();
		
		area = findArea(side);
		
			
		System.out.println("The Arean is " + area  );
	
	
	
	}
	public static double findArea(double side)
	{
		
		return ((3*(Math.sqrt( 3 ) *(side*side))) /2);
	}
}	