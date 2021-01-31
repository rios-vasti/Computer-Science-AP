import java.util.Scanner; 
public class Rectangle
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		double length = 0;
		double width = 0;
		double area = 0;
		double perimeter = 0;
		double diagonal = 0;	
			
			
		System.out.print("Enter the length of a rectangle: ");
		length = scan.nextDouble();
		System.out.print("Enter the with of a rectangle: ");
		width = scan.nextDouble();
		
		area = findArea(length,width );
		perimeter = findPerimeter(length,width );
		diagonal = findDiagonal	(length,width );
			
		System.out.println("The area is " + area  );
		System.out.println("The perimeter is " + perimeter );
		System.out.println("The diagonal is " + diagonal );	
	
	
	
	}
	public static double findArea(double length,double width )
	{
		return length*width;
	}
	
	
	public static double findPerimeter(double length,double width )
	{
		return(2*length)+(2*width);
	}
	
	public static double findDiagonal(double length,double width )
	{
		double x = (width*width)+(length*length);
		return Math.sqrt( x );
	}
	
	
	
	
	
}