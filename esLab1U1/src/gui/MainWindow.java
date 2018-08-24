package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import model.SoftwareTest;


public class MainWindow extends JFrame implements ActionListener{
	
	
//CONSTANTS
	
	public static final String BUTTON_TEST = "test";
	public static final String BUTTON_EXIT = "exit";
	
//ATTRIBUTES
	
	private JLabel lbImageBackground;
	private JButton btButtonTest;
	private JButton btExit;
	
//RELATIONS
	
	private OptionsWindow optionsWindow;
 
	private SoftwareTest SoftwareTest;
	
//BUILDER METHOD
	public MainWindow() {
		
		//SET UP RELATIONS
		
		optionsWindow = new OptionsWindow(this);
		SoftwareTest = new SoftwareTest();

		
		//SET UP ATTRIBUTES
		
		
		lbImageBackground = new JLabel("");
		ImageIcon imageBackGrn = new ImageIcon("images/imageBackground.png");
		lbImageBackground.setIcon(imageBackGrn );
		lbImageBackground.setBounds(0, 0, 500, 400);
		
		
		btButtonTest = new JButton("");
		btButtonTest.setActionCommand(BUTTON_TEST);
		btButtonTest.addActionListener(this);
		ImageIcon imageButtonTest = new ImageIcon("images/buttonTest.png");
		btButtonTest.setIcon(imageButtonTest);
		btButtonTest.setBorderPainted(false);
		btButtonTest.setBounds(160, 280, 160, 40);
		
		btExit = new JButton("");
		btExit.setActionCommand(BUTTON_EXIT);
		btExit.addActionListener(this);
		ImageIcon imageButtonExit = new ImageIcon("images/imageButtonExit2.png");
		btExit.setIcon(imageButtonExit);
		btExit.setBorderPainted(false);
		btExit.setBounds(160, 320, 160, 40);
		
		//WINDOW CONFIGURATION
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,400);
		setResizable(false);
		setTitle("Software-Test");
		setLayout(null);
		add(btButtonTest);
		add(btExit);
		add(lbImageBackground);

		
	}
	
	//GETTER AND SETTER METHODS
	
	public SoftwareTest getSoftwareTest() {
		return SoftwareTest;
	}

	public void setSoftwareTest(SoftwareTest softwareTest) {
		SoftwareTest = softwareTest;
	}

	//BUTTON METHODS
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
			if(command.equals(BUTTON_EXIT)) {
				System.exit(0);
			}else if (command.equals(BUTTON_TEST)) {
				this.dispose();
				optionsWindow.setVisible(true);
			}
		
		
	}
	
	//METHODS
	
	public void setUpRandomNumbers1(int amount, int rank1 , int rank2, int typeOrder, JTextArea x , int porcentage)  {
		
		SoftwareTest.fillListNumberWithoutRepetitionNumbers(amount, rank1, rank2);
		SoftwareTest.fillArray();
		
		if(typeOrder == 1) {
			SoftwareTest.heapSortAscendant(SoftwareTest.getListNumbers1());
			SoftwareTest.updateArray();
		}else if (typeOrder == 2) {
			SoftwareTest.heapSortDescendant(SoftwareTest.getArrayListNumbers1Copy(), SoftwareTest.getArrayListNumbers1Copy().length);
			SoftwareTest.updateArray();
		}else if (typeOrder ==3) {
			//SoftwareTest.porcentageDisordered( rank1, rank2, amount, porcentage);
		}
		paintNumbers1(x);
		SoftwareTest.getListNumbers0().clear();
		SoftwareTest.setListNumbers1(null);
	
		
	}
	
	public void setUpRandomNumbers2(int amount, int rank1 , int rank2, int typeOrder, JTextArea x, int porcentage) {
		SoftwareTest.fillListNumberWithRepetitionNumbers(amount, rank1, rank2);
		SoftwareTest.fillArray();

		if(typeOrder == 1) {
			SoftwareTest.heapSortAscendant(SoftwareTest.getListNumbers1());
			SoftwareTest.updateArray();
		}else if (typeOrder == 2) {
			SoftwareTest.heapSortDescendant(SoftwareTest.getArrayListNumbers1Copy(), SoftwareTest.getArrayListNumbers1Copy().length);
			SoftwareTest.updateArray();
		
		}else if (typeOrder ==3) {
		//SoftwareTest.porcentageDisordered( rank1, rank2, amount, porcentage);
		}//Se agrego nuevo
		paintNumbers1(x);
		SoftwareTest.getListNumbers0().clear();
		SoftwareTest.setListNumbers1(null);
		
	}
	
	public void setUpArrayByUser(String numbersData,int typeOrder ,JTextArea x) {
			SoftwareTest.fillArrayByUser(SoftwareTest.transformArray(numbersData));
		
		if(typeOrder == 1) {
			SoftwareTest.heapSortAscendant(SoftwareTest.getListNumbers1());
			SoftwareTest.updateArray();
			
		}else {
			SoftwareTest.heapSortDescendant(SoftwareTest.getArrayListNumbers1Copy(), SoftwareTest.getArrayListNumbers1Copy().length);
			SoftwareTest.updateArray();
		}

		paintNumbers1(x);
		SoftwareTest.setListNumbers1(null);
	}

	
	
	public void paintNumbers1(JTextArea x) {
		System.err.println("Basico");
		String numbers = "First Numbers:"+"\n";
		for (int i = 0; i < SoftwareTest.getListNumbers0Copy().size(); i++) { //en porcentaje no se pintan bien porque hay una copia en cero
			System.err.println(i);
			 numbers += "["+  SoftwareTest.getListNumbers0Copy().get(i)+ "]";
		}
		x.setText(numbers);
	}
	
	public void paintNumbers2(JTextArea x) {
		
		String numbers = "First Numbers:"+"\n" + SoftwareTest.firsNumbers()+ "\n"+ "Second Numbers"+ "\n";
		for (int i = 0; i < SoftwareTest.getArrayListNumbers1Copy().length; i++) {
			 numbers += "["+SoftwareTest.getArrayListNumbers1Copy()[i]+ "]";
		}
		x.setText(numbers+ "\n"+ SoftwareTest.getTime());
		SoftwareTest.setTime("");
	}
	
	
	public void algorithm1() {
	
		long firstTime = System.nanoTime();
		SoftwareTest.radixSort(SoftwareTest.getArrayListNumbers1Copy());
		SoftwareTest.calculeFinalTime(firstTime);


	}
	public void algorithm2() {
		long firstTime = System.nanoTime();
		SoftwareTest.heapSortAscendant(SoftwareTest.getArrayListNumbers1Copy());
		SoftwareTest.calculeFinalTime(firstTime);
		
	}
	public void algorithm3() {
		long firstTime = System.nanoTime();
		SoftwareTest.countingSort(SoftwareTest.getArrayListNumbers1Copy(), SoftwareTest.maxValue(SoftwareTest.getArrayListNumbers1Copy()));
		SoftwareTest.calculeFinalTime(firstTime);
		
		
	}


		//MAIN METHOD
		public static void main(String[] args) {
			MainWindow mainWindow = new MainWindow();
		
			mainWindow.setVisible(true);
		
		}


		


}
