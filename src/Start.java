import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(51, 102, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton.setBounds(319, 354, 192, 64);

		contentPane.add(btnNewButton);
		
		JLabel lblUser = new JLabel("Enter ID:");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setForeground(Color.WHITE);
		lblUser.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblUser.setBounds(170, 193, 201, 44);
		contentPane.add(lblUser);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(406, 193, 208, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String t_id =textField.getText();
				System.out.println(t_id.charAt(0));
				//Call -> to Database to choose correct Page
				System.out.println(t_id);
				
				if(LoginPage.isCustomer(Integer.parseInt(t_id))) { //if its a customer ID
//					JOptionPane.showMessageDialog(rootPane, "Customer ID. Link to customer page here");
					Customer_GUI cst = new Customer_GUI();
					cst.setVisible(true);
					dispose();
					
					
					
				} else if(LoginPage.isEmployee(Integer.parseInt(t_id))) { //if its an employee ID
					Employee_GUI emp = new Employee_GUI();
					emp.setVisible(true);
					dispose();
					
				} else	{ //if its neither
					JOptionPane.showMessageDialog(rootPane, "ID not found");
						End emd = new End();
						emd.setVisible(true);
						dispose();
				}
					
				}
				//System.out.println("Fuck");
				
		});
}}
