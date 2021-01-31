import java.util.Scanner;
public class RetailStore
{
   	public static void main(String[] args)
   	{
          	RetailItem jacket = new RetailItem("Jacket",  12 , 59.95);
          	RetailItem designerJeans  = new RetailItem("Designer Jeans",  40 , 34.95);
          	RetailItem shirt = new RetailItem("Shirt",  20 , 24.95);
          	int numJacketsRestocked = 0;
          	int numDesignerJeansRestocked = 0;
          	int numShirtsRestocked = 0;
          	
          	int choice = 0;
          	Scanner scan = new Scanner(System.in);
          	
          	while (choice != 8)
          	{
                 	System.out.println("1.  Show Inventory for all items");
                 	System.out.println("2.  Purchase Jacket");
                 	System.out.println("3.  Purchase Jeans");
                 	System.out.println("4.  Purchase shirt");
                 	System.out.println("5.  Restock Jackets");
                 	System.out.println("6.  Restock Jeans");
                 	System.out.println("7.  Restock Shirts");
                 	System.out.println("8.  Exit");
                 	System.out.print("Enter your menu choice:  ");
                 	choice = scan.nextInt();
                 	
                 	if (choice == 1)
                 	{  	//insert code to display the all attribute information
                       	//use toString
                    	System.out.println(jacket+"/n" +designerJeans+"/n" +shirt);
                 	}
                 	else if (choice == 2)
                 	{  	//insert the code to indicate that a jacket was purchased
                 		jacket.itemPurchased();
                 		System.out.println("Jacket was Purchased");
                 	}
                 	else if (choice == 3)
                 	{  	//insert the code to indicate that jeans were purchased
                 		designerJeans.itemPurchased();
                 		System.out.println("Designer Jeans were Purchased");
                 	}
                 	else if (choice == 4)
                 	{//insert the code to indicate that a shirt was purchased
                 		shirt.itemPurchased();
                 		System.out.println("Shirt was Purchased");
                 	}  	
                 		
                 	else if (choice == 5)
                 	{  	System.out.print ("Enter the number of Jackets that are restocked : ");
						numJacketsRestocked = scan.nextInt();
                 		jacket.restockItem(numJacketsRestocked);
                 	}
                 	else if (choice == 6)
                 	{                      	
                 		System.out.print ("Enter the number of Designer Jeans that are restocked : ");
						numDesignerJeansRestocked = scan.nextInt();
                 		designerJeans.restockItem(numDesignerJeansRestocked);
                 	}
                 	else if (choice == 7)
                 	{  	
                 		System.out.print ("Enter the number of Shirts that are restocked : ");
						numShirtsRestocked = scan.nextInt();
                 		shirt.restockItem(numShirtsRestocked);
                 	}
                 	else if (choice == 8)
                 	{         	System.out.println("Good bye");
                 	}                      	
          	}//end of the while loop
   	}//end of the main method
}//end of the file.

