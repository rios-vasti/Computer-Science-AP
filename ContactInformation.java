public class ContactInformation
{
	private String name;
	private String address; 
	private int age;
	private String phoneNumber;
	
	public ContactInformation(String name, String address,int age,String phoneNumber)
	{
	this.name = name;
	this.address= address;
	this.age= age;
	this.phoneNumber = phoneNumber;
	}
	
	
	public ContactInformation()
	{name = "";
	address= "";
	age= 0;
	phoneNumber = "";
	}
	
	public void incrementAge()
	{
	 age += 1;	
	}
	
	
	public String getName()
	{
	return name;
	}
	
	public String getAddress()
	{
	return address;
	}
	
	public int getAge()
	{
	return age;
	}
	
	public String getPhoneNumber()
	{
	return phoneNumber;
	}
	
	public void setName (String name )
	{
		this.name= name; 
	}
	
	public void setAddress (String address )
	{
		this.address= address; 
	}
	
	public void setAge (int age )
	{
		this.age= age; 
	}
	
	public void setPhoneNumber (String phoneNumber  )
	{
		this.phoneNumber = phoneNumber ; 
	}
	
	public String toString ()
	{
		return name + "\t" +address + "\t" + age + "\t" + phoneNumber;  
	}
}

