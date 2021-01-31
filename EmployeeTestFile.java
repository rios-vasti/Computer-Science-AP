public class EmployeeTestFile
{
	public static void main (String [] args)
	{
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Mark Jones",39119);
		Employee employee3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");
		employee1.setName("Susan Meyers" );
		employee1.setIdNumber(47899 );
		employee1.setDepartment("Accounting");       	
		employee1.setPosition("Vice President");
		
		employee2.setDepartment("IT");       	
		employee2.setPosition("Programmer");
		
		System.out.println("Employee 1");
		System.out.println("Name:             " +employee1.getName());
		System.out.println("Id Number:        " +employee1.getIdNumber());
		System.out.println("Department:       " +employee1.getDepartment());
		System.out.println("Position:         " +employee1.getPosition());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Employee 2");
		System.out.println("Name:             " +employee2.getName());
		System.out.println("Id Number:        " +employee2.getIdNumber());
		System.out.println("Department:       " +employee2.getDepartment());
		System.out.println("Position:         " +employee2.getPosition());
		System.out.println("");
		System.out.println("");
		
		System.out.println("Employee 3");
		System.out.println("Name:             " +employee3.getName());
		System.out.println("Id Number:        " +employee3.getIdNumber());
		System.out.println("Department:       " +employee3.getDepartment());
		System.out.println("Position:         " +employee3.getPosition());
		System.out.println("");
		System.out.println("");
		
		System.out.println(employee1);
		System.out.println("");
		System.out.println("");
		
		System.out.println(employee2);
		System.out.println("");
		System.out.println("");
		
		System.out.println(employee3);
		System.out.println("");
		System.out.println("");
		
	}
}

