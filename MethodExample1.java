/**
 * @(#)MethodExample1.java
 *
 *
 * @author 
 * @version 1.00 2017/8/29
 */

public class MethodExample1 
{

    public static void main(String[] args) 
        
    {
    int firstNumber = 6;
    int secondNumber = 10;	
    int thirdNumber = 7;
    	
    System.out.println(firstNumber + "+" + secondNumber + "=" + add(firstNumber, secondNumber));	
    System.out.println(firstNumber + "+" + secondNumber + "+" + thirdNumber + "=" + add(firstNumber, secondNumber,thirdNumber));	
    System.out.println( "The surface area is" + surfaceArea(7,60));
    System.out.println( "The momentum is " + momentum (7,60));	
    	
    	
    	
    }

	public static int add (int num1, int num2)
	{
		return num1 + num2; 
	}
	
	public static int add (int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
	public static double surfaceArea (double radius,double height)
	{
		return 2*Math.PI * radius *height;
		
	}
	public static double momentum (double mass, double speed)
	{	return mass * speed;
	}
	
	public static double pythagoreanTheorem (double a, double b)
	{	double c = 0;
		(a*a)+(b*b)=c;
		return c*c ;
	}
}