/* a 3-D geometric shape 
 * a constructor and appropriate data fields
 * methods to return the volume, surface area, any other methods that make sense
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Higginshw4 {
	
	public static void main(String[] args) {
		
		//call GUI methods, create panels, create and display window
		JPanel spherePanel = SphereDimensionsGUI.spherePanel();
		JFrame sphereWindow = SphereDimensionsGUI.sphereWindow();
		sphereWindow.add(spherePanel);
		JButton buttonOK = SphereDimensionsGUI.buttonOK();
		
		buttonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JTextField radiusText = SphereDimensionsGUI.radiusText();
				double radius = Double.parseDouble(radiusText.getText());
				double volume = sphereVolume(radius);
				double diameter = sphereDiameter(radius);
				double circumference = sphereCircumference(radius);
				double surface = surfaceArea(radius);
				JOptionPane.showMessageDialog(null, "Your sphere's diameter is " + diameter +
						"\nIts circumference is " + circumference +
						"\nIts surface area is " + surface +
						"\nIts volume is " + volume);
			}
		});
	}

	/** dimension methods
	 * @param radius
	 * @return sphereVolume, surfaceArea, sphereDiameter, sphereCircumference
	 */
		
	public static double sphereVolume(double radius) {
		double sphereVolume = (4 * Math.pow(radius, 3) * Math.PI) / 3;
		return sphereVolume;
	}
	
	public static double surfaceArea(double radius) {
		double surfaceArea = 4 * Math.pow(radius, 2) * Math.PI;
		return surfaceArea;
	}
		
	public static double sphereDiameter(double radius) {
		double sphereDiameter = radius * 2;
		return sphereDiameter;
	}
		
	public static double sphereCircumference(double radius) {
		double sphereCircumference = 2 * Math.PI * radius;
		return sphereCircumference;
	}
	
	/** GUI methods
	 * @return radiusLabel, radiusText, buttonOK, spherePanel, sphereWindow
	 */
	
	public static JLabel radiusLabel() {
		JLabel radiusLabel = new JLabel("Radius: ");
		return radiusLabel;
	}
	
	public static JTextField radiusText() {
		JTextField radiusText = new JTextField(5);
		return radiusText;
	}
	
	public static JButton buttonOK() {
		JButton buttonOK = new JButton("OK");
		return buttonOK;
	}
	
	public static JPanel spherePanel() {
		JLabel radiusLabel = SphereDimensionsGUI.radiusLabel();
		JTextField radiusText = SphereDimensionsGUI.radiusText();
		JButton buttonOK = SphereDimensionsGUI.buttonOK();
		JPanel spherePanel = new JPanel();
		spherePanel.add(radiusLabel);
		spherePanel.add(radiusText);
		spherePanel.add(buttonOK);
		return spherePanel;
	}
	
	public static JFrame sphereWindow() {
		JFrame sphereWindow = new JFrame();
		sphereWindow.setTitle("Enter the radius of your sphere below.");
		sphereWindow.setSize(360, 80);
		sphereWindow.setLocation(200, 100);
		sphereWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sphereWindow.setVisible(true);
		return sphereWindow;
		}
}
