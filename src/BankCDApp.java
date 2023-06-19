import java.text.NumberFormat;
import java.util.Locale;

/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 *  
 * @author Nick Nikolov
 *
 */

public class BankCDApp {
	
	private BankCD bank;
	private InteractiveCLI cli;
	
	/** creates two new objects, used to call methods defined in InteractiveCLI.java and BankCD.java
	 * 
	 */
	public BankCDApp() {
	
		cli = new InteractiveCLI();
		bank = new BankCD();
	}
	
	/** prompts the user to enter principal, interest rate, and years invested
	 * takes user input from stdin, by using a cli object
	 * formats user input using numberFormatters
	 * stores user inputs using a bank object
	 * calculates the final investment value with interest calculated yearly and daily for comparison
	 * ouput final investment values to the user
	 * 
	 */
	public void run() {
		//TODO: add code here
		
		//define number formatters
		NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.CANADA);
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		percentFormatter.setMaximumFractionDigits(2);
			
		cli.display("************************ OUTPUT ********************");
		cli.display("Compare daily and annual compounding for a Bank CD.");
		cli.display("Input CD initial principal, e.g.  1000.55 > 2500");
		bank.principal = cli.getKeyboardDouble();	
		
		cli.display("Input CD interest rate, e.g.  6.5 > 7.8");
		bank.rate = cli.getKeyboardDouble();	
		
		cli.display("Input the number of years to maturity, e.g., 10.5 > 5");
		bank.years = cli.getKeyboardDouble();	
		
		cli.prompt("For Principal = " + moneyFormatter.format(bank.principal) + " , Rate = " + percentFormatter.format(bank.rate/100.0) + "," + " Years = " + bank.years);
		
		cli.display("");
		cli.display("The maturity value compounded yearly is " + moneyFormatter.format(bank.calcYearly(bank.principal, bank.rate, bank.years)));
		cli.display("The maturity value compounded yearly is " + moneyFormatter.format(bank.calcDaily(bank.principal, bank.rate, bank.years)));
		cli.display("************************ OUTPUT ********************");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankCDApp app = new BankCDApp();
		app.run();
	}
}
