/* 
Author: Balderas, Diana
Submitted: 2018/26/09
*/

import java.util.Scanner;
public class Salary 
{
	public static void main(String[] args)
	{
		int pennies; // pennies made every day
		int power = 1;
		int days; // user's input of days
		int penniesConverter; // converts pennies to dollars (measurement)
	        double totalAmount = 0; // dollars
		double decimal; // mathematical operation
		
		System.out.println("This programs displays the pennies you made each day, but every penny is doubled.");
		System.out.println("This will also convert pennies into dollars.");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many days do you want to see the amount of pennies you reached that specific duration: ");
		days = keyboard.nextInt();
		
		if (days == 0)
		{
			System.out.println("Error, does not accept a number less than 1 for the number of days worked. Enter a number greater than or equal to 1. Try again!");
			days = keyboard.nextInt();
			
		}
		
		decimal = 0.01;
		totalAmount = 0.00;

		System.out.println("Day        Pennies");
		System.out.println("-------------------");
		
		for (pennies = 1; pennies <= days; pennies++)
		{
			System.out.println(pennies + "\t\t" + power);
			power = 2 * power;
			
			
		}
			
			System.out.println("Hint Hint... use a calculator to add all numbers.");
			System.out.print("How many pennies are in total overall?: ");
			penniesConverter = keyboard.nextInt();
			totalAmount = penniesConverter * decimal;
			System.out.println("Your output is :$ " + totalAmount);
	}
}	

