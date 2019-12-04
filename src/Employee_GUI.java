import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_GUI frame = new Employee_GUI();
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
	public Employee_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Employee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(167, 31, 315, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnViewCurrentOrders = new JButton("View Current Orders");
		btnViewCurrentOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View_Orders_GUI view = new View_Orders_GUI();
				view.setVisible(true);
				dispose();
			}
		});
		btnViewCurrentOrders.setBounds(220, 242, 222, 25);
		contentPane.add(btnViewCurrentOrders);
		
		JButton btnViewIngredientStatus = new JButton("View Ingredient Status");
		btnViewIngredientStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ingr_Stat_GUI istat = new Ingr_Stat_GUI();
				istat.setVisible(true);
				dispose();
			}
		});
		btnViewIngredientStatus.setBounds(220, 142, 222, 25);
		contentPane.add(btnViewIngredientStatus);
	}
}
