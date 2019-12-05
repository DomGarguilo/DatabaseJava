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
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Breakfast_Option_GUI_P extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int pancake = 0;
	int bacon = 0;
	int sausage = 0;

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
		
		ButtonGroup G1 = new ButtonGroup();
		ButtonGroup G2 = new ButtonGroup(); 
		ButtonGroup G3 = new ButtonGroup();
		
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
		JLabel Header = new JLabel("Pancake Option");
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setForeground(new Color(255, 255, 255));
		Header.setFont(new Font("Tahoma", Font.PLAIN, 26));
		Header.setBounds(295, 35, 291, 50);
		contentPane.add(Header);
		
		//First Option prompt
		JLabel L1 = new JLabel("Select Pancake Quantity");
		L1.setHorizontalAlignment(SwingConstants.CENTER);
		L1.setForeground(new Color(255, 255, 255));
		L1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		L1.setBounds(295, 98, 291, 41);
		contentPane.add(L1);
		
		JPanel P2 = new JPanel();
		P2.setBounds(352, 137, 177, 50);
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
		
		
		G1.add(Q1);
		G1.add(Q2);
		G1.add(Q3);
		G1.add(Q4);
		
		
		
		
			
			JPanel panel = new JPanel();
			panel.setBounds(303, 240, 275, 164);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel lsuasage = new JLabel("Suasage Quantity");
			lsuasage.setHorizontalAlignment(SwingConstants.CENTER);
			lsuasage.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lsuasage.setBounds(38, 13, 199, 25);
			panel.add(lsuasage);
			
			JLabel lbacon = new JLabel("Bacon Quantity");
			lbacon.setHorizontalAlignment(SwingConstants.CENTER);
			lbacon.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lbacon.setBounds(38, 93, 199, 25);
			panel.add(lbacon);
			
			JRadioButton S1 = new JRadioButton("1");
			S1.setBounds(74, 47, 35, 25);
			panel.add(S1);
			
			JRadioButton S2 = new JRadioButton("2");
			S2.setBounds(114, 47, 35, 25);
			panel.add(S2);
			
			JRadioButton S3 = new JRadioButton("3");
			S3.setBounds(154, 47, 35, 25);
			panel.add(S3);
			
			JRadioButton S4 = new JRadioButton("4");
			S4.setBounds(194, 47, 35, 25);
			panel.add(S4);
			
			JRadioButton B1 = new JRadioButton("1");
			B1.setBounds(76, 127, 35, 25);
			panel.add(B1);
			
			JRadioButton B2 = new JRadioButton("2");
			B2.setBounds(116, 127, 35, 25);
			panel.add(B2);
			
			JRadioButton B3 = new JRadioButton("3");
			B3.setBounds(156, 127, 35, 25);
			panel.add(B3);
			
			JRadioButton B4 = new JRadioButton("4");
			B4.setBounds(196, 127, 35, 25);
			panel.add(B4);
			
			JRadioButton S0 = new JRadioButton("0");
			S0.setBounds(35, 47, 35, 25);
			panel.add(S0);
			
			JRadioButton B0 = new JRadioButton("0");
			B0.setBounds(35, 127, 35, 25);
			panel.add(B0);
			
			G2.add(S0);
			G2.add(S1);
			G2.add(S2);
			G2.add(S3);
			G2.add(S4);
			
			G3.add(B0);
			G3.add(B1);
			G3.add(B2);
			G3.add(B3);
			G3.add(B4);
			
			
			
			
			JButton btnPlaceOrder = new JButton("Place Order");
			btnPlaceOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
			btnPlaceOrder.setBounds(357, 474, 168, 41);
			contentPane.add(btnPlaceOrder);
			
			JLabel lsides = new JLabel("Add Sides:");
			lsides.setHorizontalAlignment(SwingConstants.CENTER);
			lsides.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lsides.setForeground(new Color(255, 255, 255));
			lsides.setBounds(364, 208, 154, 25);
			contentPane.add(lsides);
			
			btnPlaceOrder.addActionListener(new ActionListener() {
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
						orderNum = 4423;
						e1.printStackTrace();
					} catch (SQLException e1) {
						orderNum = 4423;
						e1.printStackTrace();
					}
										
					//bacon
					int bacon = 0;
					if(B0.isSelected()) {
						bacon = 0;
			        } else if(B1.isSelected()) {
			        	bacon = 1;
			        } else if(B2.isSelected()){
			        	bacon = 2;
			        } else if(B3.isSelected()){
			        	bacon = 3;
			        } else if(B4.isSelected()){
			        	bacon = 4;
			        } else {
			        	System.out.println("error in bacon count");
			        }
					
					//sausage
					int sausage = 0;
					if(S0.isSelected()) {
						sausage = 0;
			        } else if(S1.isSelected()) {
			        	sausage = 1;
			        } else if(S2.isSelected()){
			        	sausage = 2;
			        } else if(S3.isSelected()){
			        	sausage = 3;
			        } else if(S4.isSelected()){
			        	sausage = 4;
			        } else {
			        	System.out.println("error in sausage count");
			        }
					
					//pancake
					if(Q1.isSelected()) {
						pancake = 1;
					} else if (Q2.isSelected()) {
						pancake = 2;
					} else if (Q3.isSelected()) {
						pancake = 3;
					} else if (Q4.isSelected()) {
						pancake = 4;
					} else {
						System.out.println("Error in pancake select");
					}
			        
					BreakfastOrder order = new BreakfastOrder(orderNum,0,pancake,0,0,0,"none","none",bacon,sausage);
					
					order.pushToDatabase();
					
					End bk = new End();
					bk.setVisible(true);
					dispose();
				}
			});
		
		
	}
}
