/**
 * Matt Higgins
 * CMIS 242
 * Final Project
 * 4 May 2014
 * 
 * Write a Java application that effectively uses Java collections to store pairs of unique colors 
 * and their unique hexadecimal values. (For example, Red -> FF0000). Store up to 20 of these pairs. 
 * 
 * Then write a GUI that displays the hexadecimal values using radio buttons to select a value. 
 * When selected the background of the GUI should change to that color.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ColorDisplay extends JFrame {
	
	//create radio buttons
	private JRadioButton jrbRed = new JRadioButton("Red");
	private JRadioButton jrbGreen = new JRadioButton("Green");
	private JRadioButton jrbBlue = new JRadioButton("Blue");
	private JRadioButton jrbCyan = new JRadioButton("Cyan");
	private JRadioButton jrbDarkGray = new JRadioButton("Dark Gray");
	private JRadioButton jrbGray = new JRadioButton("Gray");
	private JRadioButton jrbLightGray = new JRadioButton("Light Gray");
	private JRadioButton jrbMagenta = new JRadioButton("Magenta");
	private JRadioButton jrbOrange = new JRadioButton("Orange");
	private JRadioButton jrbPink = new JRadioButton("Pink");
	private JRadioButton jrbWhite = new JRadioButton("White");
	private JRadioButton jrbYellow = new JRadioButton("Yellow");
	private JRadioButton jrbDarkBlue = new JRadioButton("Dark Blue");
	private JRadioButton jrbLightBlue = new JRadioButton("Light Blue");
	private JRadioButton jrbLightCyan = new JRadioButton("Light Cyan");
	private JRadioButton jrbLightGreen = new JRadioButton("Light Green");
	private JRadioButton jrbLime = new JRadioButton("Lime");
	private JRadioButton jrbOrangeRed = new JRadioButton("Orange Red");
	private JRadioButton jrbTan = new JRadioButton("Tan");
	private JRadioButton jrbViolet = new JRadioButton("Violet");
	
	private JTextArea jtaResults = new JTextArea(); 
	private JLabel jlInst = new JLabel("Choose a color to display its hexadecimal value.");
	
	
	public ColorDisplay() {
		
		//create collection with each index containing string "Color -> Hex"
		final ArrayList<String> colorArray = new ArrayList<String>();
		colorArray.add("Red -> #FF0000");
		colorArray.add("Green -> #008000");
		colorArray.add("Blue -> #0000FF");
		colorArray.add("Cyan -> #00FFFF");
		colorArray.add("Dark Gray -> #A9A9A9");
		colorArray.add("Gray -> #808080");
		colorArray.add("Light Gray -> #D3D3D3");
		colorArray.add("Magenta -> #FF00FF");
		colorArray.add("Orange -> #FFA500");
		colorArray.add("Pink -> #FFC0CB");
		colorArray.add("White -> #FFFFFF");
		colorArray.add("Yellow -> #FFFF00");
		colorArray.add("Dark Blue -> #00008B");
		colorArray.add("Light Blue -> #ADD8E6");
		colorArray.add("Light Cyan -> #E0FFFF");
		colorArray.add("Light Green -> #90EE90");
		colorArray.add("Lime -> #00FF00");
		colorArray.add("Orange Red -> #FF4500");
		colorArray.add("Tan -> #D2B48C");
		colorArray.add("Violet -> #EE82EE");
		
		//create undefined colors
		final Color darkBlue = Color.decode("#00008B");
		final Color lightBlue = Color.decode("#ADD8E6");
		final Color lightCyan = Color.decode("#E0FFFF");
		final Color lightGreen = Color.decode("#90EE90");
		final Color lime = Color.decode("#00FF00");
		final Color orangeRed = Color.decode("#FF4500");
		final Color tan = Color.decode("#D2B48C");
		final Color violet = Color.decode("#EE82EE");
		
		//create panels
		JPanel jpInst = new JPanel();
		jpInst.setLayout(new GridLayout(1, 1));
		jpInst.add(jlInst);
		
		JPanel jpUserOutput = new JPanel();
		jpUserOutput.setLayout(new GridLayout(1, 1));
		jpUserOutput.add(jtaResults);
		jtaResults.setEditable(false);
		jtaResults.setFont(jtaResults.getFont().deriveFont(30.0f));
		
		JPanel jpRadioButton = new JPanel();
		jpRadioButton.setLayout(new GridLayout(4, 5));
		ButtonGroup colorButtons = new ButtonGroup();
		colorButtons.add(jrbRed);
		jrbRed.setSelected(true);
		colorButtons.add(jrbGreen);
		colorButtons.add(jrbBlue);
		colorButtons.add(jrbCyan);
		colorButtons.add(jrbDarkGray);
		colorButtons.add(jrbGray);
		colorButtons.add(jrbLightGray);
		colorButtons.add(jrbMagenta);
		colorButtons.add(jrbOrange);
		colorButtons.add(jrbPink);
		colorButtons.add(jrbWhite);
		colorButtons.add(jrbYellow);
		colorButtons.add(jrbDarkBlue);
		colorButtons.add(jrbLightBlue);
		colorButtons.add(jrbLightCyan);
		colorButtons.add(jrbLightGreen);
		colorButtons.add(jrbLime);
		colorButtons.add(jrbOrangeRed);
		colorButtons.add(jrbTan);
		colorButtons.add(jrbViolet);
		jpRadioButton.add(jrbRed);
		jpRadioButton.add(jrbGreen);
		jpRadioButton.add(jrbBlue);
		jpRadioButton.add(jrbCyan);
		jpRadioButton.add(jrbDarkGray);
		jpRadioButton.add(jrbGray);
		jpRadioButton.add(jrbLightGray);
		jpRadioButton.add(jrbMagenta);
		jpRadioButton.add(jrbOrange);
		jpRadioButton.add(jrbPink);
		jpRadioButton.add(jrbWhite);
		jpRadioButton.add(jrbYellow);
		jpRadioButton.add(jrbDarkBlue);
		jpRadioButton.add(jrbLightBlue);
		jpRadioButton.add(jrbLightCyan);
		jpRadioButton.add(jrbLightGreen);
		jpRadioButton.add(jrbLime);
		jpRadioButton.add(jrbOrangeRed);
		jpRadioButton.add(jrbTan);
		jpRadioButton.add(jrbViolet);
		
		//add panels to frame
		add(jpInst, BorderLayout.NORTH);
		add(jpUserOutput, BorderLayout.CENTER);
		add(jpRadioButton, BorderLayout.SOUTH);
	
	
		//create actionListeners for each button that display the 
			//appropriate index and background color
		jrbRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(0));
				jtaResults.setBackground(Color.red);
			}
		}
	);
		jrbGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(1));
				jtaResults.setBackground(Color.green);
			}
		}
	);
		jrbBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(2));
				jtaResults.setBackground(Color.blue);
		}
	}
);
		jrbCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(3));
				jtaResults.setBackground(Color.cyan);
		}
	}
);
		jrbDarkGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(4));
				jtaResults.setBackground(Color.darkGray);
		}
	}
);
		jrbGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(5));
				jtaResults.setBackground(Color.gray);
		}
	}
);
		jrbLightGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(6));
				jtaResults.setBackground(Color.lightGray);
		}
	}
);
		jrbMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(7));
				jtaResults.setBackground(Color.magenta);
		}
	}
);
		jrbOrange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(8));
				jtaResults.setBackground(Color.orange);
		}
	}
);
		jrbPink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(9));
				jtaResults.setBackground(Color.pink);
		}
	}
);
		jrbWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(10));
				jtaResults.setBackground(Color.white);
		}
	}
);
		jrbYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(11));
				jtaResults.setBackground(Color.yellow);
		}
	}
);
		jrbDarkBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(12));
				jtaResults.setBackground(darkBlue);
		}
	}
);
		jrbLightBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(13));
				jtaResults.setBackground(lightBlue);
		}
	}
);
		jrbLightCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(14));
				jtaResults.setBackground(lightCyan);
		}
	}
);
		jrbLightGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(15));
				jtaResults.setBackground(lightGreen);
		}
	}
);
		jrbLime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(16));
				jtaResults.setBackground(lime);
		}
	}
);
		jrbOrangeRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(17));
				jtaResults.setBackground(orangeRed);
		}
	}
);
		jrbTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(18));
				jtaResults.setBackground(tan);
		}
	}
);
		jrbViolet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				jtaResults.setText("");
				jtaResults.setText(colorArray.get(19));
				jtaResults.setBackground(violet);
		}
	}
);
		
}	
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
