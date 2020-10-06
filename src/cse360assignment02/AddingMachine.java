package cse360assignment02;

import java.util.Scanner;  // Import the Scanner class

public class AddingMachine 
{ 


	  private int total;
	  private String operation = "0";	// variable to store all operations

	  public static void main(String[] args) 
	  {
		  // initialize variables
		  int num;
		  char option;
		  boolean quit = false;
		  
		  // initialize object and scanner
		  AddingMachine am = new AddingMachine();
		  Scanner scan = new Scanner(System.in);
		  
		  // loop until is quit
		  while(quit == false)
		  {
			  //print menu
			  System.out.println("What do you like to do?");
			  System.out.println("a - add");
			  System.out.println("c - clear memory");
			  System.out.println("s - subtract");
			  System.out.println("p - print");
			  System.out.println("q - quit");
			  
			  option = scan.next().charAt(0);	//take a char
			  option = Character.toLowerCase(option);	//make it lower case
			  
			  switch(option) // check which character is entered;
			  {
			  		case 'a':	// adding
			  			  System.out.println("Enter a number: ");
						  num = scan.nextInt();
						  am.add(num);
						  System.out.println("\ntotal: " + am.total + "\n");
						  am.operation = am.toString(num, true, am.operation);
			  			break;
			  			
			  		case 'c':	//clear
			  			  System.out.println("Memory clear!");
			  			  am.clear();
			  			break;
			  		case 's':	//subtract
			  			  System.out.println("Enter a number: ");
						  num = scan.nextInt();
						  am.subtract(num);
						  System.out.println("\ntotal: " + am.total + "\n");
						  am.operation = am.toString(num, false, am.operation);
			  			break;
			  			
			  		case 'p'://print
			  			 System.out.println(am.operation + "\n");
			  			break;
			  			
			  		case 'q':	// quit
			  				quit = true;
			  			break;
			  		default: // defualt
			  			System.out.println("Unrecognize action!");
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
	  
	  public void add (int value) //add function
	  {
		  total = total + value;
	  }

	  public void subtract (int value) //subtract function
	  {
		  total = total - value;
	  }

	  public String toString (int value, boolean check, String list) //add operation to variable
	  {
		if(check == true)	// check if it is adding
		{
			list = list + " + " + value;
			return list;
		}
		list = list + " - " + value;
		return list;
	  }

	  public void clear() //clear the memory
	  {
		  operation = "0";
		  total = 0;
	  }
}
