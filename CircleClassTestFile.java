import java.util.Scanner;
public class CircleClassTestFile
{
	
	public static void main(String[] args)
   	{
   		CircleClass circle = new CircleClass();
   		Scanner scan = new Scanner(System.in);
   		double rad = 0.0;
   		
   		
   		System.out.print ("Enter the radius of a circle : ");
		rad = scan.nextDouble();
		
		circle.setRadius(rad);
		System.out.println(circle);
   	}
	
}

   	
   		
        
   			
   	