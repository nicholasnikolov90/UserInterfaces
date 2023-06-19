import java.awt.*;
import java .awt. event .*;
import javax.swing.*; 

/** Enables reading user input from a GUI using an actionlistener
 * displaying final calculated days to a 
 * @author Nick Nikolov
 *
 */
public class MonthGUI implements ActionListener{
	
	private JTextField inputField; 
	private JTextArea display;

	/**Creates a GUI to allow for user to enter the number of the month
	 * Also displays the calculated number of days in the month entered
	 * @param title
	 */
	public MonthGUI(String title)  {
	
		JFrame jfrm = new JFrame(title);
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(450, 100 );  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JLabel prompt = new JLabel("Input a month between 1 and 12 and press return:");
		jfrm.add(prompt);
		
		inputField = new JTextField(2); 
		inputField.setText("0");
		inputField.addActionListener( this ); 
		jfrm.add(inputField);
		
		display = new JTextArea (1 ,30);
		jfrm.add(display);
		
		jfrm.setVisible(true);
		
	}
	
	/** reads from GUI JTextField and displays the user input 
	 * and calculated days in month to the JTextArea
	 * accepts user input using an ActionListener
	 *
	 */
	public void actionPerformed(ActionEvent ae)  { 
		if (ae.getSource() == inputField) { 
			//TODO: convert user input to an integer
			int month = Integer.parseInt( inputField.getText() );
			
			//TODO: update display with number chosen and days calculated
			this.display.append("In month " + month + ", there are " + Days.howManyDaysInMonth(month) + " days \n");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		//Starting the GUI application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MonthGUI("Days of Months");
			}
		});

	}

}
