/**Don't forget about the header!!
  *Purpose: Generate an average based on user inputs.
  *Requirements: Input, calculations, and output must be separate methods using dialog boxes.
  */
  
import javax.swing.JOptionPane;
  
public class AverageWithMethods {
	
	public static void main(String [] args) {
		int howMany = 0;
		float sum = 0;
		float average = 0;
		
		//prompt the user for a sentinel value
		howMany = howMany(howMany);
		
		//add user inputs
		sum = userInputs(sum);
		
		//average user inputs with sum / howMany
		average = averageOfNumbers(sum, howMany);
		
		//inform the user if their sum > 100
		if (sum > 100)
			JOptionPane.showMessageDialog(null, "Values have exceeded a sum 100");
		
		//desired output
		JOptionPane.showMessageDialog(null, "You entered " + howMany + " numbers." + 
						    "\nThe average of your inputs is " + average);
	}
	
	//sentinel value method
	public static int howMany(int howMany) {
		String howManyString = JOptionPane.showInputDialog("How many numbers would you like to average?");
		howMany = Integer.parseInt(howManyString);
		return howMany;
	}
	
	//sum of inputs method
	public static float userInputs(float sum) {
		int howMany = 1;
		float userInputs = 1;
		while (userInputs != 0) {
		String userInputsString = JOptionPane.showInputDialog("Enter a number. When you are finished" + 
				  				      "\nentering numbers, enter 0");
		userInputs = Float.parseFloat(userInputsString);
		sum += userInputs;
		}
		return sum;
		
	}
	
	//average of inputs method
	public static float averageOfNumbers(float sum, int howMany) {
		sum = userInputs(sum);
		howMany = howMany(howMany);
		float average = sum / howMany;
		return average;
	}
}
