import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import java.awt.Panel;
import javax.swing.SwingConstants;

public class Breakfast_Option_GUI_E extends JFrame {
	
	int scramble = 0;
	int omlette = 0;
	int friedEgg = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast_Option_GUI_E frame = new Breakfast_Option_GUI_E(); //Initializations 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Breakfast_Option_GUI_E() {//pulls Option from Breakfast_GUI
						
		//Creates - Frame must always be first before any - buttons / labels / etc....
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Back Button 

		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Breakfast_GUI bk = new Breakfast_GUI();
				bk.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(35, 45, 104, 35);
		contentPane.add(btnNewButton);
		
		
		
		//Header  - 
		JLabel Header = new JLabel("Place Holder");
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setForeground(new Color(255, 255, 255));
		Header.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Header.setBounds(295, 35, 291, 50);
		contentPane.add(Header);
		
		//First Option prompt
		JLabel L1 = new JLabel("Place Holder");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setForeground(new Color(255, 255, 255));
		L1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		L1.setBounds(342, 98, 198, 41);
		contentPane.add(L1);
		
		JLayeredPane LP2 = new JLayeredPane();
		LP2.setBounds(230, 190, 421, 180);
		contentPane.add(LP2);
		
		JPanel P1 = new JPanel();
		P1.setBounds(12, 2, 397, 152);
		LP2.add(P1);
		P1.setBackground(new Color(47, 79, 79));
		LP2.setLayer(P1, 2);
		P1.setLayout(null);
		
		
		JCheckBox chckbxNewCheckBoxMushroom = new JCheckBox("Mushroom");
		chckbxNewCheckBoxMushroom.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBoxMushroom.setBounds(126, 28, 113, 25);
		P1.add(chckbxNewCheckBoxMushroom);
		
		JCheckBox chckbxNewCheckBoxOnion = new JCheckBox("Onion");
		chckbxNewCheckBoxOnion.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBoxOnion.setBounds(126, 58, 113, 25);
		P1.add(chckbxNewCheckBoxOnion);
		
		JCheckBox chckbxNewCheckBoxChicken = new JCheckBox("Chicken");
		chckbxNewCheckBoxChicken.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBoxChicken.setBounds(126, 88, 113, 25);
		P1.add(chckbxNewCheckBoxChicken);
		
		JCheckBox chckbxNewCheckBoxCheese = new JCheckBox("Cheese");
		chckbxNewCheckBoxCheese.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBoxCheese.setBounds(126, 118, 113, 25);
		P1.add(chckbxNewCheckBoxCheese);
				
		JPanel P2 = new JPanel();
		P2.setBackground(new Color(47, 79, 79));
		P2.setBounds(123, 24, 177, 130);
		LP2.add(P2);
		LP2.setLayer(P2, 1);
		P2.setLayout(null);
		
		JRadioButton Q1 = new JRadioButton("1");
		Q1.setBounds(8, 46, 35, 25);
		P2.add(Q1);
		
		JRadioButton Q2 = new JRadioButton("2");
		Q2.setBounds(48, 46, 35, 25);
		P2.add(Q2);
		JRadioButton Q3 = new JRadioButton("3");
		Q3.setBounds(88, 46, 35, 25);
		P2.add(Q3);
		JRadioButton Q4 = new JRadioButton("4");
		Q4.setBounds(128, 46, 35, 25);
		P2.add(Q4);
		
		ButtonGroup G3 = new ButtonGroup();
		G3.add(Q1);
		G3.add(Q2);
		G3.add(Q3);
		G3.add(Q4);
		
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setBounds(32, 0, 91, 29);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		P2.add(lblNewLabel);
		
		System.out.println("Display Egg Options Only");
			Header.setText("Egg Options");
			L1.setText("Select Cook Style");
		
		
			
			

			// Buttons Live Here. 
			
					
			JButton scrambledEggButton = new JButton("New button");
			scrambledEggButton.setBounds(213, 152, 147, 25);
			contentPane.add(scrambledEggButton);
			scrambledEggButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P2.setVisible(false);
					P1.setVisible(true);
					scramble = 1;
					omlette = 0;
					friedEgg = 0;
				}
			});
			scrambledEggButton.setText("Scrambled Eggs");
			
			JButton omletteButton = new JButton("New button");
			omletteButton.setBounds(393, 152, 96, 25);
			contentPane.add(omletteButton);
			omletteButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P2.setVisible(false);
					P1.setVisible(true);
					scramble = 0;
					omlette = 1;
					friedEgg = 0;
					Q1.setSelected(false);
					Q2.setSelected(false);
					Q3.setSelected(false);
					Q4.setSelected(false);
				}
			});
			omletteButton.setText("Omlette");
			
			JButton friedEggButton = new JButton("New button");
			friedEggButton.setBounds(517, 152, 93, 25);
			contentPane.add(friedEggButton);
			
			
			//Actions Must Live Below any Panels and Stuff
			friedEggButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P1.setVisible(false);
					P2.setVisible(true);
				}
			});
			friedEggButton.setText("Fried Eggs");
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(303, 409, 275, 164);
			contentPane.add(panel);
			
			JLabel label = new JLabel("Sausage Quantity");
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label.setBounds(38, 13, 199, 25);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Bacon Quantity");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_1.setBounds(38, 93, 199, 25);
			panel.add(label_1);
			
			ButtonGroup G1 = new ButtonGroup();
			ButtonGroup G2 = new ButtonGroup(); 
			
			JRadioButton radioButton1Sausage = new JRadioButton("1");
			radioButton1Sausage.setBounds(70, 47, 35, 25);
			panel.add(radioButton1Sausage);
			
			JRadioButton radioButton2Sausage = new JRadioButton("2");
			radioButton2Sausage.setBounds(110, 47, 35, 25);
			panel.add(radioButton2Sausage);
			
			JRadioButton radioButton3Sausage = new JRadioButton("3");
			radioButton3Sausage.setBounds(150, 47, 35, 25);
			panel.add(radioButton3Sausage);
			
			JRadioButton radioButton4Sausage = new JRadioButton("4");
			radioButton4Sausage.setBounds(190, 47, 35, 25);
			panel.add(radioButton4Sausage);
			
			JRadioButton radioButton0Sausage = new JRadioButton("0");
			radioButton0Sausage.setBounds(31, 47, 35, 25);
			panel.add(radioButton0Sausage);
			
			G1.add(radioButton0Sausage);
			G1.add(radioButton1Sausage);
			G1.add(radioButton2Sausage);
			G1.add(radioButton3Sausage);
			G1.add(radioButton4Sausage);
			
			JRadioButton radioButton4Bacon = new JRadioButton("4");
			radioButton4Bacon.setBounds(190, 127, 35, 25);
			panel.add(radioButton4Bacon);
			
			JRadioButton radioButton3Bacon = new JRadioButton("3");
			radioButton3Bacon.setBounds(150, 127, 35, 25);
			panel.add(radioButton3Bacon);
			
			JRadioButton radioButton2Bacon = new JRadioButton("2");
			radioButton2Bacon.setBounds(110, 127, 35, 25);
			panel.add(radioButton2Bacon);
			
			JRadioButton radioButton1Bacon = new JRadioButton("1");
			radioButton1Bacon.setBounds(70, 127, 35, 25);
			panel.add(radioButton1Bacon);
			
			JRadioButton radioButton0Bacon = new JRadioButton("0");
			radioButton0Bacon.setBounds(31, 127, 35, 25);
			panel.add(radioButton0Bacon);
			
			G2.add(radioButton0Bacon);
			G2.add(radioButton1Bacon);
			G2.add(radioButton2Bacon);
			G2.add(radioButton3Bacon);
			G2.add(radioButton4Bacon);
			
			JButton placeOrder = new JButton("Place Order");
			placeOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
			placeOrder.setBounds(357, 597, 168, 41);
			contentPane.add(placeOrder);
			
			JLabel label_2 = new JLabel("Add Sides:");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_2.setBounds(305, 383, 154, 25);
			contentPane.add(label_2);
			
			placeOrder.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//order num
					String q = "SELECT order_num FROM dgargu1db.breakfast ORDER BY order_num DESC LIMIT 1;";
					ResultSet rs = QueryClass.query(q);
					int orderNum = 0;
					try {
						rs.next();
						orderNum = Integer.parseInt(rs.getString("order_num")) + 1;
						System.out.println("here" + orderNum);
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					int friedEgg = 0;
					//fried egg
					if(Q1.isSelected()) {
			            friedEgg = 1;
			            scramble = 0;
			        	omlette = 0;
			        } else if(Q2.isSelected()) {
			        	friedEgg = 2;
			        	scramble = 0;
			        	omlette = 0;
			        } else if(Q3.isSelected()){
			        	friedEgg = 3;
			        	scramble = 0;
			        	omlette = 0;
			        } else if(Q4.isSelected()){
			        	friedEgg = 4;
			        	scramble = 0;
			        	omlette = 0;
			        } else {
			        	System.out.println("error in fried egg count");
			        }
			        
					
					//ingredients
					String ingredients = new String();
					if(chckbxNewCheckBoxMushroom.isSelected()) {
						ingredients += "Mushroom, ";
					}
					if(chckbxNewCheckBoxOnion.isSelected()) {
						ingredients += "Onion, ";
					}
					if(chckbxNewCheckBoxChicken.isSelected()) {
						ingredients += "Chicken, ";
					}
					if(chckbxNewCheckBoxCheese.isSelected()) {
						ingredients += "Cheese, ";
					}
					
					//bacon
					int bacon = 0;
					if(radioButton0Bacon.isSelected()) {
						bacon = 0;
			        } else if(radioButton1Bacon.isSelected()) {
			        	bacon = 1;
			        } else if(radioButton2Bacon.isSelected()){
			        	bacon = 2;
			        } else if(radioButton3Bacon.isSelected()){
			        	bacon = 3;
			        } else if(radioButton4Bacon.isSelected()){
			        	bacon = 4;
			        } else {
			        	System.out.println("error in fried egg count");
			        }
					
					//sausage
					int sausage = 0;
					if(radioButton0Sausage.isSelected()) {
						sausage = 0;
			        } else if(radioButton1Sausage.isSelected()) {
			        	sausage = 1;
			        } else if(radioButton2Sausage.isSelected()){
			        	sausage = 2;
			        } else if(radioButton3Sausage.isSelected()){
			        	sausage = 3;
			        } else if(radioButton4Sausage.isSelected()){
			        	sausage = 4;
			        } else {
			        	System.out.println("error in fried egg count");
			        }
			        
					
					
					
					BreakfastOrder order = new BreakfastOrder(orderNum,0,0,friedEgg,omlette,scramble,"none",ingredients,bacon,sausage);
					
					//order.setIngredients(ingredients);
					order.pushToDatabase();
					System.out.println(order.getIngredients());
					/*
					Breakfast_GUI bk = new Breakfast_GUI();
					bk.setVisible(true);
					dispose();
					*/
				}
			});
		
	}
}
