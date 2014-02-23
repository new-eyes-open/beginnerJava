/* File: GUIExample.java
 * This is simply an example of a graphical interface. 
 * The data entered is not stored and does not actually do anyting and this program exists only
 * so I have a template to build upon for an upcoming assignment.
 * Date: 02-23-2014
 * Purpose: Create your own Graphical User Interface (GUI) in Java. 
 * Requirements: Use at least 4 different GUI components.
 * Enter name, select gender, check married yes/no, select OK
 */

import javax.swing.*;

public class GUIExample {

	public static void main(String[] args) {
		
		//Calling all the methods for features of the GUI
		JLabel nameLabel = GUIExample.nameLabel();
		JTextField nameText = GUIExample.nameText();
		JLabel genderLabel = GUIExample.genderLabel();
		JComboBox genderCombo = GUIExample.genderCombo();
		JLabel marriedLabel = GUIExample.marriedLabel();
		JCheckBox yesMarried = GUIExample.yesMarried();
		JCheckBox noMarried = GUIExample.noMarried();
		JButton buttonOK = GUIExample.buttonOK();
		JPanel panel = new JPanel();
		
		//Appending the panels to the window
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(genderLabel);
		panel.add(genderCombo);
		panel.add(marriedLabel);
		panel.add(yesMarried);
		panel.add(noMarried);
		panel.add(buttonOK);
		
		//Create and open the window
		JFrame newWindow = new JFrame();
		newWindow.add(panel);
		newWindow.setTitle("Please fill in the information below.");
		newWindow.setSize(500, 100);
		newWindow.setLocation(200, 100);
		newWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newWindow.setVisible(true);
	}	
	
	/**
	 * @return nameLabel
	 */
	public static JLabel nameLabel() {
		JLabel nameLabel = new JLabel("Name: ");
		return nameLabel;
	}
	
	/**
	 * @return nameText
	 */
	public static JTextField nameText() {
		JTextField nameText = new JTextField("                           ");
		return nameText;
	}
	
	/**
	 * @return genderLabel
	 */
	public static JLabel genderLabel() {
		JLabel genderLabel = new JLabel("Select gender:");
		return genderLabel;
	}
		
	/**
	 * @return genderCombo
	 */
	public static JComboBox genderCombo() {
		JComboBox genderCombo = new JComboBox(new String[]{"Male", "Female"});
		return genderCombo;
	}
	
	/**
	 * @return marriedLabel
	 */
	public static JLabel marriedLabel() {
		JLabel marriedLabel = new JLabel("Married?");
		return marriedLabel;
	}
		
	/**
	 * @return yesMarried
	 */
	public static JCheckBox yesMarried() {
		JCheckBox yesMarried = new JCheckBox("Yes");
		return yesMarried;
	}
	
	/**
	 * @return noMarried
	 */
	public static JCheckBox noMarried() {
		JCheckBox noMarried = new JCheckBox("No");
		return noMarried;
	}
	
	/**
	 * @return buttonOK
	 */
	public static JButton buttonOK() {
		JButton buttonOK = new JButton("OK");
		return buttonOK;
	}
}
