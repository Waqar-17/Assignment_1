import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int choice;
		
		System.out.println("1.Add a new medicine");
		System.out.println("2.Update existing medicine details");
		System.out.println("3.Remove a medicine from the inventory");
		System.out.println("4.Sell a medicine (reduce quantity and calculate revenue)");
		System.out.println("5.Display all available medicines");
		System.out.println("6.Search for a medicine by ID or name");
		System.out.println("7.Print total revenue from sales");
		System.out.println("8.Identify and list expired medicines based on the current date");
		System.out.println("\nEnter Your choice");
		
		choice= sc.nextInt();
		switch (choice){
			

		}
		
		
		
		
		
		
		PharmacyShop ps1 = new PharmacyShop(new Person("person1","123"),new Address("street1","city1","postal1"),1);
		System.out.println("main running");
	}
}