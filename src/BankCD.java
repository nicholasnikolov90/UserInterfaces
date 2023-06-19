/**
 * Calculates the final value of investment using two methods for comparision:
 * returns the final investment with interest calculated yearly or interest calculated daily
 * 
 * @author Nick Nikolov
 *
 */

public class BankCD {
	
	double principal;
	double rate;
	double years;
	
	/**
	 * blank constructor used to initialize variables before user input is generated
	 */
	public BankCD() {
		principal = 1;
		rate = 1;
		years = 1;
	}
	
	/** constructor used to initialize variables for local use
	 * @param p: principal deposit
	 * @param r: interest rate
	 * @param y: years invested
	 */
	public BankCD(double p, double r, double y) {
		this.principal = p;
		this.rate = r;
		this.years = y;
	}
	
	
	/** calculates final value of the investment given user inputs, with interest calculated yearly
	 * @param p: principal deposit
	 * @param r: interest rate
	 * @param y - years invested
	 * @return final value of the investment, interest calculated yearly
	 */
	public double calcYearly(double p, double r, double y) {		
		return p * Math.pow(1 + (r/100), y);
	}
	
	/**calculates final value of the investment given user inputs, with interest calculated daily
	 * @param p: principal deposit
	 * @param r: interest rate
	 * @param y; years invested
	 * @return final value of the investment, interest calculated daily
	 */
	public double calcDaily(double p, double r, double y) {
		return p * Math.pow(1 + (r/36500), 365*y);
	}

}
