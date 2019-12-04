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

public class Customer_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_GUI frame = new Customer_GUI();
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
	public Customer_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeSinner = new JLabel("Select Item");
		lblWelcomeSinner.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWelcomeSinner.setBounds(138, 59, 159, 73);
		contentPane.add(lblWelcomeSinner);
		
		JButton btnBackButton = new JButton("Home Button");
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start st = new Start();
				st.setVisible(true);
				dispose();
			}
		});
		btnBackButton.setBackground(new Color(153, 102, 204));
		btnBackButton.setBounds(12, 23, 136, 25);
		contentPane.add(btnBackButton);
		
		JButton btnNewButton = new JButton("Breakfast");
		btnNewButton.setBackground(new Color(153, 102, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Breakfast_GUI bg = new Breakfast_GUI();
				bg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(51, 159, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnPasta = new JButton("Pasta");
		btnPasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pasta_GUI pg = new Pasta_GUI();
				pg.setVisible(true);
				dispose();
			}
		});
		btnPasta.setBackground(new Color(153, 102, 204));
		btnPasta.setBounds(256, 159, 97, 25);
		contentPane.add(btnPasta);
	}
}
