package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.javadoc.ThrowsTag;


public class OptionsWindow extends JDialog implements ActionListener{
	
	
//CONSTANS

	public static final String BUTTON_RANDOM_NUMBERS = "random";
	public static final String BUTTON_ENTER_NUMBERS = "enter";
	public static final String BUTTON_TEST = "testDo";
	public static final String BUTTON_SHOW_NUMBERS = "random";
	public static final String BUTTON_BACK = "back";
	private static final String BUTTON_GENERATE = "generate";
	private static final String BUTTON_ENTER = "enter";
	private static final String BUTTON_ALGORITHM1 = "algorithm1";
	private static final String BUTTON_ALGORITHM2 = "algorithm2";
	private static final String BUTTON_ALGORITHM3 ="algorithm3";
	
		
	
//ATTRIBUTES
	
	private JCheckBox repeitNumbers;
	private JCheckBox Orderednumbers;
	private JCheckBox inverselyOrderednumbers;
	private JCheckBox disorderedPorcentage;
	
	private JCheckBox randomNumbers;
	private JCheckBox enterNumbers;
	
	private JButton btRandomNumbers;
	private JButton btEnterNumbers;
	private JButton btTest;
	
	private JButton btAlgorithm1;
	private JButton btAlgorithm2;
	private JButton btAlgorithm3;
	
	private JButton btShowNumbers;
	private JButton btBack;
	
	private JComboBox<String> jPorcentages;
	
	private JLabel imageBackGroundOptionWindow;
	
	private JTextField rank1;
	private JTextField rank2;
	
	private JTextField  enter;
	
	private JTextField amount;
	private JTextField enterPorcentage;
	
//RELATIONS 
	
	private NumbersWindow numbersWindow;
	private MainWindow main;
	
	
	

//BUILDER METHOD
		public OptionsWindow(MainWindow c) {
			
			
		//SET UP ATTRIBUTES
			
		repeitNumbers = new JCheckBox("Repeit numbers");
		Orderednumbers = new JCheckBox("Ordered numbers");
		inverselyOrderednumbers = new JCheckBox("Inversely ordered numbers");
		disorderedPorcentage = new JCheckBox("Disordered porcentage");
		
		randomNumbers = new JCheckBox("random numbers");
		enterNumbers = new JCheckBox("Enter numbers");
		
		btRandomNumbers = new JButton("Generate");
		btRandomNumbers.addActionListener(this);
		btRandomNumbers.setActionCommand(BUTTON_GENERATE);
		btEnterNumbers = new JButton("Enter");
		btEnterNumbers.addActionListener(this);
		btEnterNumbers.setActionCommand(BUTTON_ENTER);
		
		btTest = new JButton("Test");
		
		btAlgorithm1 = new JButton("");
		btAlgorithm1.setActionCommand(BUTTON_ALGORITHM1);
		btAlgorithm1.addActionListener(this);
		btAlgorithm2 = new JButton("");
		btAlgorithm2.setActionCommand(BUTTON_ALGORITHM2);
		btAlgorithm2.addActionListener(this);
		btAlgorithm3 = new JButton("");
		btAlgorithm3.setActionCommand(BUTTON_ALGORITHM3);
		btAlgorithm3.addActionListener(this);
		
		btShowNumbers = new JButton("Show numbers");
		btShowNumbers.setActionCommand(BUTTON_SHOW_NUMBERS);
		btShowNumbers.addActionListener(this);
		
		ImageIcon imageBack = new ImageIcon("images/imageBack.png");
		btBack = new JButton("");
		btBack.setIcon(imageBack);
		btBack.setActionCommand(BUTTON_BACK);
		btBack.addActionListener(this);
		btBack.setBorderPainted(false);
		
		
		jPorcentages = new JComboBox<String>();
		
		rank1 = new JTextField();
		rank2 = new JTextField();
		enter = new JTextField();
		amount = new JTextField();
		enterPorcentage = new JTextField();
		
		
		
		
		
		//SET UP RELATIONS
		
		numbersWindow = new NumbersWindow();
		main = c;
		
		
		imageBackGroundOptionWindow = new JLabel("");
		ImageIcon imageBGOptionWindow = new ImageIcon("images/imageOptionsWindowBackG.png");
		imageBackGroundOptionWindow.setIcon(imageBGOptionWindow);
		
		
		//CONFIGURATION WINDOW
		
		setTitle("Options");
		setSize(500, 400);
		setVisible(false);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		repeitNumbers.setBounds(95, 190, 30,30);
		Orderednumbers.setBounds(25, 190, 30,30);
		inverselyOrderednumbers.setBounds(185, 190,30,30);
		disorderedPorcentage.setBounds(275, 190, 30,30);
		
		randomNumbers.setBounds(25,300, 30, 30);
		enterNumbers.setBounds(25, 270, 30, 30);
		
		btRandomNumbers.setBounds(100, 300, 90,20);
		btEnterNumbers.setBounds(170, 270, 50,20);
		btTest.setBounds(0, 0, 0,0);
		
		ImageIcon imageButtonSort = new ImageIcon("images/imageButtonSort.png");
		btAlgorithm1.setBounds(380, 60, 80,80);
		btAlgorithm1.setIcon(imageButtonSort);
		btAlgorithm1.setBorderPainted(false);
		btAlgorithm2.setBounds(380, 150, 80,80);
		btAlgorithm2.setIcon(imageButtonSort);
		btAlgorithm2.setBorderPainted(false);
		btAlgorithm3.setBounds(380, 245, 80,80);
		btAlgorithm3.setIcon(imageButtonSort);
		btAlgorithm3.setBorderPainted(false);
		
		btShowNumbers.setBounds(100,330, 150,35);
		
		btBack.setBounds(290,10, 40,40);
		
		
		jPorcentages.setBounds(0, 0, 0,0);
		
		rank1.setBounds(60, 170, 40,20);
		rank2.setBounds(140, 170, 40,20);
		
		enter.setBounds(100, 270, 100, 20);
		
		amount.setBounds(260, 170, 75, 20);
		enterPorcentage.setBounds(260, 270, 75, 20);
		
		
		imageBackGroundOptionWindow.setBounds(0, 0, 500, 400);
		
		//ADD ELEMENTS TO OPTION WINDOWS
		add(enterPorcentage);
		add(btBack);
		
		add(amount);
		
		add(btEnterNumbers);
		add(btRandomNumbers);
		add(enter);
		
		add(rank1);
		add(rank2);
		
		add(repeitNumbers);
		add(Orderednumbers);
		add(inverselyOrderednumbers);
		add(disorderedPorcentage);
		
		add(randomNumbers);
		add(enterNumbers);
		
		
		add(btAlgorithm1);
		add(btAlgorithm2);
		add(btAlgorithm3);
		
		add(btShowNumbers);
		
		add(imageBackGroundOptionWindow);
		
		//SET UP METHODS
		
		verificationLettersAmount(amount);
		verificationLettersRank1(rank1);
		verificationLettersRank2(rank2);
		
	
		
		}
		//GETTER AND SETTER METHODS
		
		public JCheckBox getRepeitNumbers() {
			return repeitNumbers;
		}


		public void setRepeitNumbers(JCheckBox repeitNumbers) {
			this.repeitNumbers = repeitNumbers;
		}

		public JCheckBox getOrderednumbers() {
			return Orderednumbers;
		}


		public void setOrderednumbers(JCheckBox orderednumbers) {
			Orderednumbers = orderednumbers;
		}


		public JCheckBox getInverselyOrderednumbers() {
			return inverselyOrderednumbers;
		}

		public void setInverselyOrderednumbers(JCheckBox inverselyOrderednumbers) {
			this.inverselyOrderednumbers = inverselyOrderednumbers;
		}

		public JCheckBox getDisorderedPorcentage() {
			return disorderedPorcentage;
		}


		public void setDisorderedPorcentage(JCheckBox disorderedPorcentage) {
			this.disorderedPorcentage = disorderedPorcentage;
		}


		public JButton getBtRandomNumbers() {
			return btRandomNumbers;
		}

		public void setBtRandomNumbers(JButton btRandomNumbers) {
			this.btRandomNumbers = btRandomNumbers;
		}


		public JButton getBtEnterNumbers() {
			return btEnterNumbers;
		}



		public void setBtEnterNumbers(JButton btEnterNumbers) {
			this.btEnterNumbers = btEnterNumbers;
		}

		public JButton getBtTest() {
			return btTest;
		}



		public void setBtTest(JButton btTest) {
			this.btTest = btTest;
		}

		public JButton getBtAlgorithm1() {
			return btAlgorithm1;
		}


		public void setBtAlgorithm1(JButton btAlgorithm1) {
			this.btAlgorithm1 = btAlgorithm1;
		}



		public JButton getBtAlgorithm2() {
			return btAlgorithm2;
		}



		public void setBtAlgorithm2(JButton btAlgorithm2) {
			this.btAlgorithm2 = btAlgorithm2;
		}



		public JButton getBtAlgorithm3() {
			return btAlgorithm3;
		}





		public void setBtAlgorithm3(JButton btAlgorithm3) {
			this.btAlgorithm3 = btAlgorithm3;
		}


		public JButton getBtShowNumbers() {
			return btShowNumbers;
		}


		public void setBtShowNumbers(JButton btShowNumbers) {
			this.btShowNumbers = btShowNumbers;
		}


		public JComboBox<String> getjPorcentages() {
			return jPorcentages;
		}



		public void setjPorcentages(JComboBox<String> jPorcentages) {
			this.jPorcentages = jPorcentages;
		}


	
	//ACTION LISTENER METHOS
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
			if(command.equals(BUTTON_SHOW_NUMBERS)) {
				//this.dispose();
				numbersWindow.setVisible(true);
			}else if (command.equals(BUTTON_BACK)) {
				this.dispose();
				main.setVisible(true);
				
			}else if (command.equals(BUTTON_GENERATE)){
				if(verificationTypeOfNumbers() && verificationOptions() ) {
					
					int porcentage = 0;
					if(randomNumbers.isSelected()) {
						
						if(disorderedPorcentage.isSelected()) {
							try {
								porcentage = Integer.parseInt(enterPorcentage.getText());
							} catch (Exception e2) {
								JOptionPane.showMessageDialog(null, "The porcentage is empty");
															}
							
						}
						
				
				int rank01 = 0;
				int rank02 = 0;
				int amount01 =0;
				
				try {
					 rank01 = Integer.parseInt(rank1.getText());
					 rank02 = Integer.parseInt(rank2.getText());
					 
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "The ranges are empty");
				}
				
				try {
					amount01 = Integer.parseInt(amount.getText());
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "The amount is empty");
				}

				int typeOrder = 0;
				
				
				if(Orderednumbers.isSelected()) {
					typeOrder= 1;
				}else if (inverselyOrderednumbers.isSelected()) {
					typeOrder = 2;
				}else if (disorderedPorcentage.isSelected()) {
					typeOrder =3;
				}
	
				if(repeitNumbers.isSelected()) {
					main.setUpRandomNumbers2(amount01, rank01, rank02, typeOrder, numbersWindow.getTextArea(), porcentage);
				}else {
					main.setUpRandomNumbers1(amount01, rank01, rank02, typeOrder, numbersWindow.getTextArea(), porcentage);
				}
					
				
					}else {
						System.out.println("Not allowed");
					}
				}else {
					System.out.println("Not allowed");
				}
			

			}else if (command.equals(BUTTON_ENTER)){
				if(verificationTypeOfNumbers() )  {
					if(enterNumbers.isSelected()) {
						System.out.println("Allowed");
						
						int typeOrder = 3;
						if(Orderednumbers.isSelected()) {
							typeOrder= 1;
						}else if (inverselyOrderednumbers.isSelected()) {
							typeOrder = 2;
						}
						try {
							main.setUpArrayByUser(enter.getText(), typeOrder, numbersWindow.getTextArea());
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Enter numbers!");
						}
						
						
					}else {
						System.out.println("Not allowed");
					}
				}else {
					System.out.println("Not allowed");
				}
				
			}else if (command.equals(BUTTON_ALGORITHM1)) {
				
					main.algorithm1();
					main.paintNumbers2(numbersWindow.getTextArea());
				
				
			}else if (command.equals(BUTTON_ALGORITHM2)) {
					main.algorithm2();
					main.paintNumbers2(numbersWindow.getTextArea());
				
			}else if (command.equals(BUTTON_ALGORITHM3)) {
					main.algorithm3();
					main.paintNumbers2(numbersWindow.getTextArea());
				
				
			}
	
		
	}
	
	public boolean verficationRank1Empty() {
		boolean isEmpty = false;
		if(rank1.equals(""))
			isEmpty = true;
		return isEmpty;
	}
	
	public boolean verficationRank2Empty() {
		boolean isEmpty = false;
		if(rank2.equals(""))
			isEmpty = true;
		return isEmpty;
	}
	
	public boolean verificatonRanks(int rank1, int rank2) {
		boolean allowedInterval = false;
		rank1 = Integer.parseInt(this.rank1.getText());
		rank2 = Integer.parseInt(this.rank2.getText());
			if(rank2 >= rank1) 
				allowedInterval = true;
		return allowedInterval;
			
	}
	
	public boolean verficationAmountEmpty() {
		boolean isEmpty = false;
		if(amount.equals(""))
			isEmpty = true;
		return isEmpty;
	}
	
	public boolean verificationIsPositiveAmount() {
		boolean isPositive = false;
			int amountVerification = Integer.parseInt(amount.getText());
				if(amountVerification > 0)
					isPositive = true;
				return isPositive;
				}
	
	public void verificationLettersAmount(JTextField x) {
			x.addKeyListener(new KeyAdapter() {
				public void keyTyped(java.awt.event.KeyEvent e) {
					char c = e.getKeyChar();
					if(!Character.isDigit(c)) {
						e.consume();
					}
				}
			});
	}
	public void verificationLettersRank1(JTextField x) {
		x.addKeyListener(new KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	}
	public void verificationLettersRank2(JTextField x) {
		x.addKeyListener(new KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	}
	
	public boolean verificationTypeOfNumbers() {
			boolean allowed = true;
				if(randomNumbers.isSelected() && enterNumbers.isSelected()) 
					allowed = false;
				return allowed;			
	}
	
	public boolean verificationOptions() {
		boolean allowed = false;
		boolean condition1 = Orderednumbers.isSelected() && (inverselyOrderednumbers.isSelected() || disorderedPorcentage.isSelected());
		boolean condition2 = inverselyOrderednumbers.isSelected() && (Orderednumbers.isSelected() || disorderedPorcentage.isSelected());
		boolean condition3 = disorderedPorcentage.isSelected() && (inverselyOrderednumbers.isSelected() || Orderednumbers.isSelected());
			if(!(condition1 || condition2 ||condition3)) 
				allowed = true;
		return allowed;
		
	}
	
	
	}
		


