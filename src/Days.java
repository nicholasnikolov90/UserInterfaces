
/**
 * Calculates the number of days for each month
 * 
 * @author Nick Nikolov
 *
 */


public final class Days {
		
	/** takes as input the number of the month and outputs
	 * the number of days in that month
	 * fails quietly by returning zero for incorrect inputs
	 * @param month
	 * @return integer number of days in the month
	 */
	public static int howManyDaysInMonth(int month) {
		
		//special case of february
		if (month == 2 && month > 0 && month < 13) return 28;
		
		if (month < 8 && month > 0 && month < 13) {
			if(month % 2 == 0 && month > 0 && month < 13) {
				return 30;
			} else return 31;
		} else if (month >= 8 && month > 0 && month < 13) {
			if(month % 2 == 0 && month > 0 && month < 13) return 31;
			else return 30;
		} else return 0;
	}
	
	/**
	 * Days cannot be instantiated, has static methods only.
	 */
	private Days() {}

}
