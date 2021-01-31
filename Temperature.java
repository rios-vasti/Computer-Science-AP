public class Temperature
{
	private double fahrenheit;
	
	public Temperature()
	{
		fahrenheit= 0.0;
	}
	public void setFahrenheit(double fahrenheit)
	{
		this.fahrenheit= fahrenheit;
	}
	public double getFahrenheit()
	{
		return fahrenheit;
	}
	
	public double getCelsius()
	{
		return (fahrenheit-32)/1.8;
	}
	
	public double getKelvin()
	{
		return ((getCelsius()) + 273);
	}
	
	
	public String toString ()
	{
		return "\nFahrenheit: "+ getFahrenheit() + "\n Kelvin: " + getKelvin()+ "\nCelsius: "+getCelsius()  ;  
	}
	
}