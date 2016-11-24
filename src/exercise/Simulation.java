/*
 * (Dice Rolling) Write an application to simulate the rolling of two dice. The application
 * should use an object of class Random once to roll the first die and again to roll the second die. The
 * sum of the two values should then be calculated. Each die can show an integer value from 1 to 6, so
 * the sum of the values will vary from 2 to 12, with 7 being the most frequent sum, and 2 and 12 the
 * least frequent. Figure 7.30 shows the 36 possible combinations of the two dice. Your application
 * should roll the dice 36,000 times. Use a one-dimensional array to tally the number of times each
 * possible sum appears. Display the results in tabular format. Determine whether the totals are
 * reasonable (e.g., there are six ways to roll a 7, so approximately one-sixth of the rolls should be 7).
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


package exercise;

import java.util.Random;

public class Simulation 
{
	
	Random randomNumber = new Random(); // creates a random object to get random numbers
	int array[] = new int[13];
	int DICE_ROLLS = 360;
	
	// simulates rolling dice
	void rollDice()
	{
		int die1 = 0;
		int die2 = 0;
		
		// rolls the dice 360 times
		for(int i = 0; i <= DICE_ROLLS; i++)
		{
			// gets random numbers in each roll
			die1 = 1 + randomNumber.nextInt(6); 
			die2 = 1 + randomNumber.nextInt(6);
			
			int sum = die1 + die2;
			
			tallyResult(sum); // pass the sum of the dice to method tallyResult
			
		} // end for loop
		
		tabularDisplay(); // display results
		reasonable(array[7]);
	} // end method rollDice
	
	void tallyResult(int num)
	{
		++array[num]; // increment the correct number in the array
	} // end method tallyResult
	
	void tabularDisplay()
	{
		System.out.printf("%s\t%s\n", "Possible Sums", "Number of Appearance"); // prints headings
		
		for(int num = 2; num < array.length; num++)
		{
			System.out.printf("%13d\t",num); // prints the current number being tallied.
			
			// display the amount of stars based on the number in the array
			for(int stars = 0; stars < array[num]; stars++)
			{
				System.out.print("*");
			} // end inner for loop
			System.out.println(); // creates a newline
		} // end for loop
	} // end method tabularDisplay
	
	void reasonable(int num)
	{
		if(num > 55 && num < 65)
		{
			System.out.println("\nReasonable");
		}
		else
		{
			System.out.println("\nNot reasonable");
		}
	} // end method reasonable
}
