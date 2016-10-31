package CarMenu;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Car 
{
	Car[] car_list = new Car[100];
	String[] cars = new String[100];
	
	String vin;
	String brand;
	String model;
	String year;
	String mileage;
	String price;
	String color;
	
	public void get_car_info() throws IOException
	{
		String vin;
		String brand;
		String model;
		int year;
		int mileage;
		int price;
		String color; 
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("VIN: ");
		vin = in.next();
		System.out.print("Brand: ");
		brand = in.next();
		System.out.print("Model: ");
		model = in.next();
		System.out.print("Year: ");
		year = in.nextInt();
		System.out.print("Mileage: ");
		mileage = in.nextInt();
		System.out.print("Price: ");
		price = in.nextInt();
		System.out.print("Color: ");
		color = in.next();
		
		write_car(vin,brand,model,year,mileage,price,color);
		
	}
	
	public void show_cars() throws FileNotFoundException
	{
		read_cars();
		System.out.println(car_list[0].vin);
		
	}
	
	
	public void read_cars() throws FileNotFoundException
	{
		String  a;
		String  b;
		String  c;
		String  d;
		String  e;
		String  f;
		String  g;
		
		int index = 0;
		String fileName = "Cars.txt";
		String line = null;
		try
		{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null)
			{
				cars[index] = line;
					StringTokenizer st = new StringTokenizer(cars[index]);
			     	while (st.hasMoreTokens()) 
			     	{			     		
			    	 	a = st.nextToken();	
			    	 	System.out.print(a+" ");
			    	 	b = st.nextToken();
			    	 	System.out.print(b+" ");
			    	 	c = st.nextToken();
			    	 	System.out.print(c+" ");
			    	 	d = st.nextToken();
			    	 	System.out.print(d+" ");
			    	 	e = st.nextToken();
			    	 	System.out.print(e+" ");
			    	 	f = st.nextToken();
			    	 	System.out.print(f+" ");
			    	 	g = st.nextToken();
			    	 	System.out.print(g);
			    	 	System.out.println("");
			    	 	
			    	 	car_list[index] = set_car(a,b,c,d,e,f,g);
			     	}
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
	
	public Car set_car(String a, String b, String c, String d, String e, String f, String g)
	{
		Car gen = new Car();
		
		vin = a;
		brand = b;
		model = c;
		year = d;
		mileage = e;
		price = f;
		color = g;
		
		return gen;
		
	}
	
	
	
	public void write_car(String a, String b, String c, int d, int e, int f, String g) throws IOException
	{
		
		FileWriter fw = new FileWriter("Cars.txt",true);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
		pw.close();
	}

}
