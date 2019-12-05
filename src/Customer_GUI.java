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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeSinner = new JLabel("Select Item");
		lblWelcomeSinner.setForeground(Color.WHITE);
		lblWelcomeSinner.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblWelcomeSinner.setBounds(343, 97, 159, 73);
		contentPane.add(lblWelcomeSinner);
		
		JButton btnBackButton = new JButton("Logout");
		btnBackButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start st = new Start();
				st.setVisible(true);
				dispose();
			}
		});
		btnBackButton.setBackground(new Color(153, 102, 204));
		btnBackButton.setBounds(54, 44, 105, 25);
		contentPane.add(btnBackButton);
		
		JButton btnNewButton = new JButton("Breakfast");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(153, 102, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Breakfast_GUI bg = new Breakfast_GUI();
				bg.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(175, 272, 149, 68);
		contentPane.add(btnNewButton);
		
		JButton btnPasta = new JButton("Pasta");
		btnPasta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPasta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pasta_GUI pg = new Pasta_GUI();
				pg.setVisible(true);
				dispose();
			}
		});
		btnPasta.setBackground(new Color(153, 102, 204));
		btnPasta.setBounds(510, 272, 149, 68);
		contentPane.add(btnPasta);
	}
}
