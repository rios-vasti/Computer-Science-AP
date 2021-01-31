

import java.util.Scanner;
public class SchoolFundraiserTestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name = "";
			int numSmall = 0;
			int numMedium=0;
			int numLarge=0;
			int numXLarge=0;

		SchoolFundraiser student1 = new SchoolFundraiser();
       	
        Scanner scan = new Scanner(System.in);
       	
       	System.out.println("Name: ");
       	name = scan.nextLine();
       	student1.setName(name);
       	
       	System.out.println("Enter the number of small shirts:		");
       	numSmall= scan.nextInt();
       	student1.setNumSmall(numSmall);
       	
       	System.out.println("Enter the number of medium shirts:		");
       	numMedium = scan.nextInt();
       	student1.setNumMedium(numMedium);
       	
       	System.out.println("Enter the number of large shirts:		");
       	numLarge = scan.nextInt();
       	student1.setNumLarge(numLarge);
    	
       	System.out.println("Enter the number of Xlarge shirts:		");
       	numXLarge = scan.nextInt();
       	student1.setNumXLarge(numXLarge);
       	
       	System.out.println("**********************************************************************");
        System.out.println("Name: 			"+student1.getName());
   	
       	System.out.println("Small:        	" + student1.getNumSmall());
       	System.out.println("Medium:     	" + student1.getNumMedium());
       	System.out.println("Large:        	" + student1.getNumLarge());
       	System.out.println("Extra Large:	" + student1.getNumXLarge());
       	System.out.println("Amount of money deposited into junior class account:     	" +student1.moneyDeposited() );
       	System.out.println("Amount paid to t-shirt company:                     		" +student1.moneyPayed());
       	System.out.println("Amount of money earned (profit):                            " +student1.profit());

	}

}