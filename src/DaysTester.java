
/**
 * A class to test the logic of the Days.java class
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @author Nick Nikolov
 *
 */
public class DaysTester {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 12; i++) {
			
			System.out.println("The " + i + " month has " + Days.howManyDaysInMonth(i) + " Days");
		}
	}
}
