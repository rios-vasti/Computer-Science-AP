import java.util.Scanner;  

public class InputExample1
{
public static void main (String [] args)
	{//vasriables
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0 ;
		int sum = 0 ;
	
	//Input 
		System.out.print ("Enter a number: ");
		num1 = scan.nextInt();
	
		System.out.print ("Enter a number: ");
		num2 = scan.nextInt();
		
	//math
		sum = add(num1,num2);
	//Output 
	System.out.print("The sum is "+ sum);
	System.out.println(" ");	
		
	
	}
	
	public static int add (int number1, int number2)
	{
		return number1 + number2;
	}


}