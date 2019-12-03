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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(51, 0, 51));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 39));
		btnNewButton.setBounds(127, 155, 192, 64);

		contentPane.add(btnNewButton);
		
		JLabel lblUser = new JLabel("Enter ID:");
		lblUser.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblUser.setBounds(53, 71, 120, 44);
		contentPane.add(lblUser);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(178, 71, 208, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String t_id =textField.getText();
				System.out.println(t_id.charAt(0));
				//Call -> to Database to choose correct Page
				System.out.println(t_id);
				if(t_id =="fuck")
				{
					JOptionPane.showMessageDialog(rootPane, "wRoNg");
				}
				else
				{
					if(t_id.charAt(0) == '1')
					{
						Employee_GUI emp = new Employee_GUI();
						emp.setVisible(true);
						dispose();
					}
					else
					{
						End emd = new End();
						emd.setVisible(true);
						dispose();
					}
					
				}
				System.out.println("Fuck");
				
			}
		});
	}
}
