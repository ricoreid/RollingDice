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

public class SimulationTest
{

	public static void main(String[] args)
	{
		Simulation mySimulation = new Simulation();
		
		mySimulation.rollDice();

	}

}
