//A program that will give the sum of the digits in a whole number between 0 and 10,000
import javax.swing.JOptionPane;

public class SumOfNumbers {
	public static void main(String[] args) {
	//Dialog box prompting a number
	String wholeNumberString = JOptionPane.showInputDialog(
		"Enter a whole number between 0 and 10,000");
	int wholeNumber = Integer.parseInt(wholeNumberString);
	
	//Isolate each digit
	int anyThousands = wholeNumber / 1000;
	int remaining = wholeNumber % 1000;
	int anyHundreds = remaining / 100;
	int remainingHun = wholeNumber % 100;
	int anyTens = remainingHun / 10;
	int anyOnes = wholeNumber % 10;
	int sum = anyThousands + anyHundreds + anyTens + anyOnes;
	
	//Display amounts
	String output = "The sum of the digits in your number is " + sum; 
	JOptionPane.showMessageDialog(null, output);
	}
}
	
	
