package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NumbersWindow  extends JDialog implements ActionListener{
	
	
//CONSTANTS
	
//ATTRUBUTES
	
	private JTextArea textArea;
	private JButton exit;
	private JScrollPane scroll;
	
//RELATIONS
	
//BUILDER METHOD
	
	public NumbersWindow() {
		
	//SET UP RELATIONS
		
	//SET UP ATTRIBUTES
	textArea = new JTextArea();
	textArea.setEditable(true);
	scroll = new JScrollPane(textArea);
	
	
	//WINDOW CONFIGURATION 
	setSize(300, 300);
	setTitle("Numbers");
	setResizable(false);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(null);
	setVisible(false);
	setBackground(Color.BLACK);
	
	
	scroll.setBounds(0, 0,300, 250);
	
	//ADD ELEMENTS
	add(scroll);
	
	
	
	
		
		
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
