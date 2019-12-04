import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Ingr_Stat_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ingr_Stat_GUI frame = new Ingr_Stat_GUI();
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
	public Ingr_Stat_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 719);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngredientStatus = new JLabel("Ingredient Status");
		lblIngredientStatus.setForeground(Color.WHITE);
		lblIngredientStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngredientStatus.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblIngredientStatus.setBounds(144, 13, 314, 29);
		contentPane.add(lblIngredientStatus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(83, 160, 288, 43);
		contentPane.add(comboBox);
		
		JButton btnChangeStatus = new JButton("Change Status");
		btnChangeStatus.setBounds(432, 169, 125, 25);
		contentPane.add(btnChangeStatus);
		
		JLabel lblStatus = new JLabel("Status: ");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(105, 101, 103, 16);
		contentPane.add(lblStatus);
	}
}
