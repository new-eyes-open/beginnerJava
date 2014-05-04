/**
 * Write a Java application that effectively uses Java collections to store pairs of unique colors 
 * and their unique hexadecimal values. (For example, Red -> FF0000). Store up to 20 of these pairs. 
 * 
 * Then write a GUI that displays the hexadecimal values using radio buttons to select a value. 
 * When selected the background of the GUI should change to that color.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ColorDisplay extends JFrame {
	
	//create radio buttons
	private JRadioButton jrbRed = new JRadioButton("Red");
	private JRadioButton jrbGreen = new JRadioButton("Green");
	private JRadioButton jrbBlue = new JRadioButton("Blue");
	private JRadioButton jrbBlack = new JRadioButton("Black");
	private JRadioButton jrbCyan = new JRadioButton("Cyan");
	private JRadioButton jrbDarkGray = new JRadioButton("Dark Gray");
	private JRadioButton jrbGray = new JRadioButton("Gray");
	private JRadioButton jrbLightGray = new JRadioButton("Light Gray");
	private JRadioButton jrbMagenta = new JRadioButton("Magenta");
	private JRadioButton jrbOrange = new JRadioButton("Orange");
	private JRadioButton jrbPink = new JRadioButton("Pink");
	private JRadioButton jrbWhite = new JRadioButton("White");
	private JRadioButton jrbYellow = new JRadioButton("Yellow");
	private JTextArea jtaResults = new JTextArea(); 
	private JLabel jlInst = new JLabel("Choose a color to display its hexadecimal value.");
	
	
	public ColorDisplay() {
		
		//create collection with each index containing string "Color -> Hex"
		final ArrayList<String> colorArray = new ArrayList<String>();
		colorArray.add("Red -> FF0000");
		colorArray.add("Green -> 008000");
		colorArray.add("Blue -> 0000FF");
		colorArray.add("Black -> 000000");
		colorArray.add("Cyan -> 00FFFF");
		colorArray.add("Dark Gray -> A9A9A9");
		colorArray.add("Gray -> 808080");
		colorArray.add("Light Gray -> D3D3D3");
		colorArray.add("Magenta -> FF00FF");
		colorArray.add("Orange -> FFA500");
		colorArray.add("Pink -> FFC0CB");
		colorArray.add("White -> FFFFFF");
		colorArray.add("Yellow -> FFFF00");
		
		//create panels
		JPanel jpInst = new JPanel();
		jpInst.setLayout(new GridLayout(1, 1));
		jpInst.add(jlInst);
		
		JPanel jpUserOutput = new JPanel();
		jpUserOutput.setLayout(new GridLayout(1, 1));
		jpUserOutput.add(jtaResults);
		jtaResults.setEditable(false);
		
		JPanel jpRadioButton = new JPanel();
		jpRadioButton.setLayout(new GridLayout(4, 5));
		jpRadioButton.add(jrbRed);
		jpRadioButton.add(jrbGreen);
		jpRadioButton.add(jrbBlue);
		jpRadioButton.add(jrbBlack);
		jpRadioButton.add(jrbCyan);
		jpRadioButton.add(jrbDarkGray);
		jpRadioButton.add(jrbGray);
		jpRadioButton.add(jrbLightGray);
		jpRadioButton.add(jrbMagenta);
		jpRadioButton.add(jrbOrange);
		jpRadioButton.add(jrbPink);
		jpRadioButton.add(jrbWhite);
		jpRadioButton.add(jrbYellow);
				
		add(jpInst, BorderLayout.NORTH);
		add(jpUserOutput, BorderLayout.CENTER);
		add(jpRadioButton, BorderLayout.SOUTH);
	
	
		//create actionListeners for each button that displays the 
			//appropriate index and background color
		jrbRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.append(colorArray[0]);
				jtaResults.setBackground(Color.RED);
			}
		}
	);
		
	
	//construct frame
	public static void main(String[] args) {
		Higginsfp frame = new Higginsfp();
		frame.setTitle("Colors!");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	
}
