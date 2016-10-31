package CarMenu;
import java.io.*;
import java.util.Arrays;

public class Member extends Menu{
	
	String ids[] = new String[100];
	String upper_id;
	

	public void sign_up() throws IOException
	{
		String id;
		String pass;
		String repass;
		String fname;
		String lname;
		String email;
			
		System.out.println("Please input user id ");
		id = in.next();
		
		System.out.println("Please input password ");
		pass = in.next();
		
		System.out.println("Please input password again ");
		repass = in.next();
		

		if(pass.equals(repass))
		{		
		System.out.println("Please input your first name ");
		fname = in.next();
	
		System.out.println("Please input your last name ");
		lname = in.next();
	
		System.out.println("Please input your email ");
		email = in.next();

		System.out.println("Thank you for your sign up!");
		write_member(id,pass,fname,lname,email);
		write_id(id,pass);
		start_menu();
		}
		else
		{
			System.out.println("The passwords do not match.\n");
			start_menu();
		}

	}
	

	public void log_in() throws IOException
	{
		String id;
		String pass;
		String c;
		String admin = "adminadminpass";
		read_ids();
			
		System.out.println(Arrays.toString(ids));
		System.out.print("Please input your user id: ");
		id = in.next();
		System.out.print("Please input password: ");
		pass = in.next();
		c = id+pass;
		
		if(Arrays.asList(ids).contains(c))
		{
			member_menu(id);
		}
		else if(c.equals(admin))
		{
			admin_menu();
		}
		else
		{
			System.out.println("Sorry your id and/or password are incorrect");
			System.out.println(" please be sure you have signed up prior to loggin in.");
		}
	}
	

	public void write_member(String a, String b, String c, String d, String e) throws IOException
	{
		FileWriter fw = new FileWriter("Members.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(a + " " + b + " " + c + " " + d + " " + e);
		
		pw.close();		
	}
	

	public void write_id(String a, String b) throws IOException
	{
		FileWriter fw = new FileWriter("Ids.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(a+b);
		pw.close();
		
	}
	

	public void read_ids() throws FileNotFoundException
	{
		int index = 0;
		String fileName = "Ids.txt";
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				ids[index] = line;
				index++;
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file " + fileName);
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file " + fileName);
		}		
	}
	
}
