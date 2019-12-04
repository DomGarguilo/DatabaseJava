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

public class Breakfast_Option_GUI_P extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast_Option_GUI_P frame = new Breakfast_Option_GUI_P();//Initalizations 
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
	public Breakfast_Option_GUI_P() {//pulls Option from Breakfast_GUI 
		System.out.println();
		
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
		JLabel Header = new JLabel("Pancake Option");
		Header.setForeground(new Color(255, 255, 255));
		Header.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Header.setBounds(224, 35, 291, 50);
		contentPane.add(Header);
		
		//First Option prompt
		JLabel L1 = new JLabel("Select Quantity");
		L1.setForeground(new Color(255, 255, 255));
		L1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		L1.setBounds(224, 98, 198, 41);
		contentPane.add(L1);
		
		JPanel P2 = new JPanel();
		P2.setBounds(215, 137, 177, 50);
		contentPane.add(P2);
		P2.setLayout(null);
		
		JRadioButton Q1 = new JRadioButton("1");
		Q1.setBounds(8, 9, 35, 25);
		P2.add(Q1);
		
		JRadioButton Q2 = new JRadioButton("2");
		Q2.setBounds(48, 9, 35, 25);
		P2.add(Q2);
		JRadioButton Q3 = new JRadioButton("3");
		Q3.setBounds(88, 9, 35, 25);
		P2.add(Q3);
		JRadioButton Q4 = new JRadioButton("4");
		Q4.setBounds(128, 9, 35, 25);
		P2.add(Q4);
		
		
			
			JPanel panel = new JPanel();
			panel.setBounds(171, 240, 275, 164);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lsuasage = new JLabel("Suasage Quantity");
			lsuasage.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lsuasage.setBounds(49, 13, 199, 25);
			panel.add(lsuasage);
			
			JLabel lbacon = new JLabel("Bacon Quantity");
			lbacon.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbacon.setBounds(49, 93, 199, 25);
			panel.add(lbacon);
			
			JRadioButton srb1 = new JRadioButton("1");
			srb1.setBounds(47, 47, 35, 25);
			panel.add(srb1);
			
			JRadioButton srb2 = new JRadioButton("2");
			srb2.setBounds(87, 47, 35, 25);
			panel.add(srb2);
			
			JRadioButton srb3 = new JRadioButton("3");
			srb3.setBounds(127, 47, 35, 25);
			panel.add(srb3);
			
			JRadioButton srb4 = new JRadioButton("4");
			srb4.setBounds(167, 47, 35, 25);
			panel.add(srb4);
			
			JRadioButton brb1 = new JRadioButton("1");
			brb1.setBounds(49, 130, 35, 25);
			panel.add(brb1);
			
			JRadioButton brb2 = new JRadioButton("2");
			brb2.setBounds(89, 130, 35, 25);
			panel.add(brb2);
			
			JRadioButton brb3 = new JRadioButton("3");
			brb3.setBounds(129, 130, 35, 25);
			panel.add(brb3);
			
			JRadioButton brb4 = new JRadioButton("4");
			brb4.setBounds(169, 130, 35, 25);
			panel.add(brb4);
			
			JButton btnPlaceOrder = new JButton("Place Order");
			btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnPlaceOrder.setBounds(224, 417, 168, 41);
			contentPane.add(btnPlaceOrder);
			
			JLabel lsides = new JLabel("Add Sides:");
			lsides.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lsides.setForeground(new Color(255, 255, 255));
			lsides.setBounds(238, 208, 154, 25);
			contentPane.add(lsides);
		
		
	}
}
