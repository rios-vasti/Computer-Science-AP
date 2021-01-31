import java.util.Scanner;
public class TemperatureTestFile
{
	
	public static void main(String[] args)
   	{
   		Temperature temp1 = new Temperature();
   		Scanner scan = new Scanner(System.in);
   		double temperature = 0.0;
   		
   		
   		System.out.print ("Enter the temperature in Fahrenheit: ");
		temperature = scan.nextDouble();
		temp1.setFahrenheit(temperature);
		System.out.println(temp1);
   	}
	
}
