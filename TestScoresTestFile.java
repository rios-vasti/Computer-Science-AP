import java.util.Scanner;
public class TestScoresTestFile
{
	public static void main(String[] args)
   	{
   		TestScores student1 = new TestScores(); 
   			
   		String name = " ";
   		double test1 = 0.0;
   		double test2 = 0.0;
   		double test3 = 0.0;	
   		
   		Scanner scan = new Scanner(System.in);
   		
   		System.out.print ("Enter Name : ");
		name = scan.nextLine();
        student1.setName(name);
        
        System.out.print ("Enter Test 1 Score  : ");
		test1 = scan.nextDouble();
		student1.setTest1(test1);
		
		System.out.print ("Enter Test 1 Score  : ");
		test2 = scan.nextDouble();
		student1.setTest2(test2);
		
		System.out.print ("Enter Test 1 Score  : ");
		test3 = scan.nextDouble();
		student1.setTest3(test3);
		
   		System.out.print (student1);	
   	}
   	
}