package cse360assignment02;

import java.util.Scanner;  // Import the Scanner class

public class AddingMachine 
{ 


	  private int total;
	  private String operation = "0";

	  public static void main(String[] args) 
	  {
		  int num;
		  char option;
		  boolean quit = false;
		  
		  AddingMachine am = new AddingMachine();
		  Scanner scan = new Scanner(System.in);
		  
		  while(quit == false)
		  {
			  System.out.println("What do you like to do?");
			  System.out.println("a - add");
			  System.out.println("c - clear memory");
			  System.out.println("s - subtract");
			  System.out.println("p - print");
			  System.out.println("q - quit");
			  option = scan.next().charAt(0);
			  option = Character.toLowerCase(option);
			  switch(option)
			  {
			  		case 'a':
			  			  System.out.println("Enter a number: ");
						  num = scan.nextInt();
						  am.add(num);
						  System.out.println("\ntotal: " + am.total + "\n");
						  am.operation = am.toString(num, true, am.operation);
			  			break;
			  			
			  		case 'c':
			  			  System.out.println("Memory clear!");
			  			  am.clear();
			  			break;
			  		case 's':
			  			  System.out.println("Enter a number: ");
						  num = scan.nextInt();
						  am.subtract(num);
						  System.out.println("\ntotal: " + am.total + "\n");
						  am.operation = am.toString(num, false, am.operation);
			  			break;
			  			
			  		case 'p':
			  			 System.out.println(am.operation + "\n");
			  			break;
			  			
			  		case 'q':
			  				quit = true;
			  			break;
			  }

		  }
	  }
	  
	  public AddingMachine () 
	  {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  public int getTotal () 
	  {
	    return total;
	  }
	  
	  public void add (int value) 
	  {
		  total = total + value;
	  }

	  public void subtract (int value) 
	  {
		  total = total - value;
	  }

	  public String toString (int value, boolean check, String list) 
	  {
		if(check == true)
		{
			list = list + " + " + value;
			return list;
		}
		list = list + " - " + value;
		return list;
	  }

	  public void clear() 
	  {
		  operation = "0";
		  total = 0;
	  }
}
