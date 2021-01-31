public class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//constructors
	public Employee ()
	{
		name=" ";
		idNumber= 0;
		department = " ";
		position=" ";
		
	}
	public Employee( String name, int idNumber)
	{
		this.name = name;
		this.idNumber= idNumber;
		department ="";
		position="";
	}
	public Employee(String name, int idNumber, String department, String position)
	{
		this(name, idNumber); // calls method above 
		this.department= department;
		this.position =position;
	}
	
	//getters
	public String getName ()
	{
		return name;
	}
	public int getIdNumber ()
	{
		return idNumber;
	}
	
	public String getDepartment ()
	{
		return department;
	}
		public String getPosition ()
	{
		return position;
	}
	//setters
	public void setName (String name)
	{
		this.name= name;
	}
	
	public void setIdNumber (int idNumber)
	{
		this.idNumber= idNumber;
	}
	
	public void setDepartment (String department)
	{
		this.department= department;
	}
	
	public void setPosition (String position)
	{
		this.position= position;
	}
	//helper methods
	
	public String toString ()
	{
		return name + "\t" +idNumber + "\t" + department + "\t" + position;  
	}
}