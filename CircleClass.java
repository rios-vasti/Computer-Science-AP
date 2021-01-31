public class CircleClass
{
	private double radius;
	
	public CircleClass(double radius)
	{
		this.radius= radius;
	}
	
	public CircleClass()
	{
		radius= 0.0;
	}
	public void setRadius(double radius)
	{
		this.radius= radius;	
	}
	
	public double getRadius ()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * radius *radius;
	}
	public double getDiameter()
	{
		return radius * 2;
	}
	public double getCircumference()
	{
		return radius * 2 * Math.PI ;
	}

	public String toString ()
	{
		return "\nArea: "+ getArea() + "\n Diameter: " + getDiameter()+ "\n Circumference: "+getCircumference()  ;  
	}
	
}