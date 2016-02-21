/*
 * @author: Kartik Gupta
 * @version 2/20/2016
 * 
 * Project description: Skeleton of the calculator class. This class will be implemented
 * further in other parts.
 * 
 */
package cse360assign3;

public class Calculator {

	private int total;
	private String completeHistory = "0"; // String used to return the History.
	

	
	// Constructor for the calculator class.
	public Calculator ()
	{
		total = 0;  // not needed - included for clarity
	}
	
	// returns the total of the calculator
	public int getTotal () 
	{
		return total;
	}
	
	//Performs the add function of a calculator
	public void add (int value) 
	{
		total = total + value;
		completeHistory = completeHistory + " + " + value;
	}
	
	//performs the subtract function of a calculator
	public void subtract (int value) 
	{
		total = total - value;
		completeHistory = completeHistory + " - " + value;
	}
	
	//performs the multiply function of a calculator
	public void multiply (int value) 
	{
		total = total * value;
		completeHistory = completeHistory + " * " + value;
	}
	
	//performs the divide function of a calculator
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;	
			completeHistory = completeHistory + " / " + value;
		}
	}
	
	//Returns the history of the calculator
	public String getHistory () {
		return completeHistory;
	}
	
}
