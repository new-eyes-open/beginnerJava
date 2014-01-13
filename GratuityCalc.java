import javax.swing.JOptionPane;

public class GratuityCalc {
  public static void main(String[] args) {
	
	//Dialog box prompting bill amount and input conversion to double
	String subTotalString = JOptionPane.showInputDialog(
		"Enter bill subtotal, for example, 12.50");
	double subTotal = Double.parseDouble(subTotalString);
	
	//Dialog box prompting tip rate and input conversion to double
	String tipPercentString = JOptionPane.showInputDialog(
		"Enter the percent you intend to tip, for example, 15");
	double tipPercent = Double.parseDouble(tipPercentString);
	
	//Convert tip to decimal
	tipPercent = tipPercent / 100;
	
	//Calculate gratuity and total bill
	double gratuityAmount = subTotal * tipPercent;
	double totalBill = subTotal + gratuityAmount;
	
	//Display amounts
	String output = "The tip should be $" + gratuityAmount + " which makes the total $" +
		totalBill;
	JOptionPane.showMessageDialog(null, output);
	}
}
