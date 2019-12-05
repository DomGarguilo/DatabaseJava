import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Breakfast_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Breakfast_GUI frame = new Breakfast_GUI();
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
	public Breakfast_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Food");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(354, 49, 145, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnHomeButton = new JButton("Logout");
		btnHomeButton.setBackground(new Color(0, 128, 128));
		btnHomeButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Start st  = new Start();
				st.setVisible(true);
				dispose();
			}
		});
		btnHomeButton.setBounds(700, 54, 112, 35);
		contentPane.add(btnHomeButton);
		
		JButton btnBackButton = new JButton("Back");
		btnBackButton.setBackground(new Color(0, 128, 128));
		btnBackButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_GUI cg = new Customer_GUI();
				cg.setVisible(true);
				dispose();
			}
		});
		btnBackButton.setBounds(55, 53, 123, 36);
		contentPane.add(btnBackButton);
		
		JButton btnNewButton = new JButton("Eggs");
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Breakfast_Option_GUI_E op = new Breakfast_Option_GUI_E();
				op.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(211, 268, 139, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pancakes");
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(510, 268, 139, 45);
		contentPane.add(btnNewButton_1);
	}
}
