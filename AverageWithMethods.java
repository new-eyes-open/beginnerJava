/* Purpose: Generate an average based on user inputs.
 * Requirements: Input, calculations, and output must be separate methods using dialog boxes.
 */
  
import javax.swing.JOptionPane;
  
public class AverageWithMethods {
	
	public static void main(String [] args) {
		int howMany = 0;
		float sum = 0;
		float average = 0;
		
		//call howMany method for sentinel value
		howMany = howMany(howMany);
		
		//call userInputs method for collection and sum of user inputs
		sum = userInputs(sum, howMany);
		
		//call averageOfNumbers method for average of user inputs
		average = averageOfNumbers(sum, howMany);
		
		//issue warning if sum > 100
		if (sum > 100)
			JOptionPane.showMessageDialog(null, "Values have exceeded a sum 100");
		
		//output to user
		JOptionPane.showMessageDialog(null, "You entered " + howMany + " numbers." + 
					       	    "\nThe average of your inputs is " + average);
	}
	
	/** 
	 * howMany method for sentinel value
	 * @param howMany
	 * @return howMany
	 */	
	public static int howMany(int howMany) {
		String howManyString = JOptionPane.showInputDialog("How many numbers would you like to average?");
		howMany = Integer.parseInt(howManyString);
		return howMany;
	}
	
	/**
	 * userInputs method for input and sum of input
	 * @param sum
	 * @param howMany
	 * @return sum
	 */
	public static float userInputs(float sum, int howMany) {
		float userInputs;
		int numberOfInputs;
		//for statement that only allows howMany inputs
		for (numberOfInputs = 0; numberOfInputs < howMany; numberOfInputs++) {
			String userInputsString = JOptionPane.showInputDialog("Enter a number.");
		userInputs = Float.parseFloat(userInputsString);
		sum += userInputs;
		}
		return sum;
	}
	
	/**
	 * averageOfNumbers method of average of user input
	 * @param sum
	 * @param howMany
	 * @return average
	 */
	public static float averageOfNumbers(float sum, int howMany) {
		float average = sum / howMany;
		return average;
	}
}
