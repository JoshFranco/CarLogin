package CarMenu;
import java.io.IOException;
import java.util.Scanner;

public class Menu{
	
	Scanner in = new Scanner(System.in);
	
	public void start_menu() throws IOException
	{
		Member jack = new Member();
		int choice = 0;
		
		System.out.println("Welcome to Carmax!\n");
		System.out.println("1. Log in ");
		System.out.println("2. Sign up ");
		System.out.println("3. Forgot Password ");
		System.out.println("4. Exit \n");
		System.out.print("Please input your choice: ");
		
		choice = in.nextInt();
		System.out.println("");

		if(choice == 1)
		{
			jack.log_in();
		}
		if(choice == 2)
		{
			jack.sign_up();
		}
		if(choice == 3)
		{
			System.out.println("Forgot Pass");
		}
		if(choice == 4)
		{
			System.out.println("Exit");
		}
		
		in.close();
	}
	
	public void member_menu(String id) throws IOException
	{
		int choice = 0;
		Car jill = new Car();
		System.out.println("Welcome back " + id + "!\n");
		System.out.println("1. Display Inventory ");
		System.out.println("2. Sort Cars ");
		System.out.println("3. Reserve a Car ");
		System.out.println("4. Display all reserved cars ");
		System.out.println("5. Log Out ");
		System.out.print("Please input your choice: \n");
		
		choice = in.nextInt();
		System.out.println("");
		if(choice == 1)
		{
			System.out.println("display inventory");
			jill.read_cars();
			member_menu(id);
		}
		if(choice == 2)
		{
			System.out.println("sort cars");
			member_menu(id);
		}
		if(choice == 3)
		{
			System.out.println("Reserve a car");
			member_menu(id);
		}
		if(choice == 4)
		{
			System.out.println("Display reserved cars");
			member_menu(id);
		}
		if(choice == 5)
		{
			System.out.println("Exit");
			start_menu();
		}
	}
	
	public void sort_menu()
	{
		int choice = 0;
		
		System.out.println("1. Sort by VIN ");
		System.out.println("2. Sort by Brand ");
		System.out.println("3. Sort by Model ");
		System.out.println("4. Sort by Year ");
		System.out.println("5. Sort by Mileage ");
		System.out.println("6. Sort by Price ");
		System.out.println("7. Sort by Color \n");
		System.out.print("Please input your choice: \n");
		
		choice = in.nextInt();
		System.out.println("");
		
		if(choice == 1)
		{
			System.out.println("VIN sort");
		}
		if(choice == 2)
		{
			System.out.println("Brand sort");
		}
		if(choice == 3)
		{
			System.out.println("Model sort");
		}
		if(choice == 4)
		{
			System.out.println("year sort");
		}
		if(choice == 5)
		{
			System.out.println("Mileage sort");
		}
		if(choice == 6)
		{
			System.out.println("price sort");
		}
		if(choice == 7)
		{
			System.out.println("color sort");
		}
	}
	
	public void admin_menu() throws IOException
	{
		Car Basic_Car = new Car();
		int choice = 0;
		System.out.println("Welcome Back Boss!\n");
		
		System.out.println("1. Display Inventory ");
		System.out.println("2. Add Car ");
		System.out.println("3. Delete Car ");
		System.out.println("4. Update Car ");
		System.out.println("5. Display Users ");
		System.out.println("6. Add User ");
		System.out.println("7. Delete User ");
		System.out.println("8. Update User ");
		System.out.println("9. Logout \n");
		System.out.print("Please input: ");
		
		choice = in.nextInt();
		System.out.println("");

		if(choice == 1)
		{
			Basic_Car.show_cars();
			admin_menu();
		}
		if(choice == 2)
		{
			Basic_Car.get_car_info();
			admin_menu();
		}
		if(choice == 3)
		{
			System.out.println("Delete Car");
			admin_menu();
		}
		if(choice == 4)
		{
			System.out.println("Update Car");
			admin_menu();
		}
		if(choice == 5)
		{
			System.out.println("Display Users");
			admin_menu();
		}
		if(choice == 6)
		{
			System.out.println("Add Users");
			admin_menu();
		}
		if(choice == 7)
		{
			System.out.println("Delete User");
			admin_menu();
		}
		if(choice == 8)
		{
			System.out.println("Update User");
			admin_menu();
		}
		if(choice == 9)
		{
			System.out.println("Logout");
			start_menu();
		}
		
	}

}
