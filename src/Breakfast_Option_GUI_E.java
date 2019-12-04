import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import java.awt.Panel;

public class Breakfast_Option_GUI_E extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast_Option_GUI_E frame = new Breakfast_Option_GUI_E();//Initalizations 
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
		System.out.println();
		
		//Creates - Frame must always be first before any - buttons / labels / etc....
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 715);
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
		Header.setForeground(new Color(255, 255, 255));
		Header.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Header.setBounds(224, 35, 291, 50);
		contentPane.add(Header);
		
		//First Option prompt
		JLabel L1 = new JLabel("Place Holder");
		L1.setForeground(new Color(255, 255, 255));
		L1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		L1.setBounds(224, 98, 198, 41);
		contentPane.add(L1);
		
		JLayeredPane LP2 = new JLayeredPane();
		LP2.setBounds(106, 190, 421, 180);
		contentPane.add(LP2);
		
		JPanel P1 = new JPanel();
		P1.setBounds(0, 0, 296, 152);
		LP2.add(P1);
		P1.setBackground(new Color(47, 79, 79));
		LP2.setLayer(P1, 2);
		P1.setLayout(null);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mushroom");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(126, 28, 113, 25);
		P1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Onion");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_1.setBounds(126, 58, 113, 25);
		P1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Spinach");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_2.setBounds(126, 88, 113, 25);
		P1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Cheese");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_3.setBounds(126, 118, 113, 25);
		P1.add(chckbxNewCheckBox_3);
		
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
		
		JLabel lblNewLabel = new JLabel("Quantity");
		lblNewLabel.setBounds(32, 0, 91, 29);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		P2.add(lblNewLabel);
		
		System.out.println("Display Egg Options Only");
			Header.setText("Egg Options");
			L1.setText("Select Cook Style");
		
		
			
			

			// Buttons Live Here. 
			JButton B1 = new JButton("New button");
			B1.setBounds(170, 152, 104, 25);
			contentPane.add(B1);
			B1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P2.setVisible(false);
					P1.setVisible(true);
				}
			});
			B1.setText("Scrambled");
			
			JButton B2 = new JButton("New button");
			B2.setBounds(279, 152, 96, 25);
			contentPane.add(B2);
			B2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P2.setVisible(false);
					P1.setVisible(true);
				}
			});
			B2.setText("Omlette");
			
			JButton B3 = new JButton("New button");
			B3.setBounds(387, 152, 93, 25);
			contentPane.add(B3);
			
			
			//Actions Must Live Below any Panels and Stuff
			B3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					P1.setVisible(false);
					P2.setVisible(true);
				}
			});
			B3.setText("Fried");
			
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBounds(154, 409, 275, 164);
			contentPane.add(panel);
			
			JLabel label = new JLabel("Suasage Quantity");
			label.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label.setBounds(49, 13, 199, 25);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Bacon Quantity");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_1.setBounds(49, 93, 199, 25);
			panel.add(label_1);
			
			JRadioButton radioButton = new JRadioButton("1");
			radioButton.setBounds(47, 47, 35, 25);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("2");
			radioButton_1.setBounds(87, 47, 35, 25);
			panel.add(radioButton_1);
			
			JRadioButton radioButton_2 = new JRadioButton("3");
			radioButton_2.setBounds(127, 47, 35, 25);
			panel.add(radioButton_2);
			
			JRadioButton radioButton_3 = new JRadioButton("4");
			radioButton_3.setBounds(167, 47, 35, 25);
			panel.add(radioButton_3);
			
			JRadioButton radioButton_4 = new JRadioButton("1");
			radioButton_4.setBounds(49, 130, 35, 25);
			panel.add(radioButton_4);
			
			JRadioButton radioButton_5 = new JRadioButton("2");
			radioButton_5.setBounds(89, 130, 35, 25);
			panel.add(radioButton_5);
			
			JRadioButton radioButton_6 = new JRadioButton("3");
			radioButton_6.setBounds(129, 130, 35, 25);
			panel.add(radioButton_6);
			
			JRadioButton radioButton_7 = new JRadioButton("4");
			radioButton_7.setBounds(169, 130, 35, 25);
			panel.add(radioButton_7);
			
			JButton button = new JButton("Place Order");
			button.setFont(new Font("Tahoma", Font.BOLD, 20));
			button.setBounds(206, 597, 168, 41);
			contentPane.add(button);
			
			JLabel label_2 = new JLabel("Add Sides:");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			label_2.setBounds(241, 383, 154, 25);
			contentPane.add(label_2);
		
		
	}
}
