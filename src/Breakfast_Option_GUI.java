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

public class Breakfast_Option_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast_Option_GUI frame = new Breakfast_Option_GUI("Egg");//Initalizations 
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
	public Breakfast_Option_GUI(String op) {//pulls Option from Breakfast_GUI 
		System.out.println(op);
		
		//Creates - Frame must always be first before any - buttons / labels / etc....
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 518);
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
		
		///---------------------------------
		
		
		//Button in Layers
		JLayeredPane LP1 = new JLayeredPane();
		LP1.setBounds(114, 143, 378, 105);
		contentPane.add(LP1);
		
		JPanel Quant = new JPanel();
		Quant.setBounds(42, 31, 291, 61);
		LP1.add(Quant);
		
		JPanel Select = new JPanel();
		LP1.setLayer(Select, 3);
		Select.setBounds(0, 13, 366, 67);
		LP1.add(Select);
		
		

		// Buttons Live Here. 
		JButton B1 = new JButton("New button");
		Select.add(B1);
		
		JButton B2 = new JButton("New button");
		Select.add(B2);
		
		JButton B3 = new JButton("New button");
		Select.add(B3);
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		if(op == "Egg")
		{
			System.out.println("Display Egg Options Only");
			Header.setText("Egg Options");
			L1.setText("Select Cook Style");
			B1.setText("Scrambled");
			B2.setText("Omlette");
			B3.setText("Fried");
		}
		else if(op == "Pancake")
		{
			Header.setText("Pancake Options");
			System.out.println("Display Bacon Option Only");
			L1.setText("Select Toppings");
		}
		else
		{
			System.out.println("Display Pancake Options Only");
		}
		
		
		
		JLayeredPane LP2 = new JLayeredPane();
		LP2.setBounds(109, 263, 421, 195);
		contentPane.add(LP2);
		
		JPanel P1 = new JPanel();
		LP2.setLayer(P1, 2);
		P1.setBounds(12, 13, 382, 152);
		LP2.add(P1);
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
		P2.setBounds(123, 27, 177, 127);
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
		lblNewLabel.setBounds(48, 13, 75, 16);
		P2.add(lblNewLabel);
		
		P2.setVisible(false);
		
		
	}
}
