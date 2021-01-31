import java.util.Scanner; 
public class SumDigits
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		int num = 0;	
		
		int sum = 0;	
			
		System.out.print("Enter a 2 digit number: ");
		num = scan.nextInt();
		
		sum = add(num);
		System.out.println("The sum is " + sum  );
	}
	
	public static int add(int num )
	{ 
		int num1 = num/10;
		int num2 = num % 10;
		return num1 + num2;	
	}
	
	
	
}		