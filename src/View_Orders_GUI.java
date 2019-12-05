import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
public class View_Orders_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Orders_GUI frame = new View_Orders_GUI();
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
	public View_Orders_GUI() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 958);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewOrders = new JLabel("View Orders");
		lblViewOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewOrders.setForeground(Color.WHITE);
		lblViewOrders.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblViewOrders.setBounds(337, 74, 162, 41);
		contentPane.add(lblViewOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_GUI egui = new Employee_GUI();
				// Optional - Alert Message informing Employee about any Unsaved Changes to
				// Status.
				// "Unsaved Changes made - Continue or Correct"
				egui.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(62, 35, 97, 25);
		contentPane.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 228, 742, 264);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Order_Num", "Customer_ID", "Pasta_Type", "Ingredients", "Seasonings"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(62, 608, 742, 264);
		contentPane.add(scrollPane_1);
		
		JLabel lblPastaOrders = new JLabel("Pasta Orders:");
		lblPastaOrders.setForeground(Color.WHITE);
		lblPastaOrders.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPastaOrders.setBounds(62, 171, 162, 41);
		contentPane.add(lblPastaOrders);
		
		JLabel lblBreakfastOrders = new JLabel("Breakfast Orders:");
		lblBreakfastOrders.setForeground(Color.WHITE);
		lblBreakfastOrders.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBreakfastOrders.setBounds(62, 554, 209, 41);
		contentPane.add(lblBreakfastOrders);
		
		JButton btnCompleteBreakfastOrder = new JButton("Complete Breakfast Order");
		btnCompleteBreakfastOrder.setBounds(623, 567, 181, 25);
		contentPane.add(btnCompleteBreakfastOrder);
		
		JButton btnCompletePastaOrder = new JButton("Complete Pasta Order");
		btnCompletePastaOrder.setBounds(623, 184, 181, 25);
		contentPane.add(btnCompletePastaOrder);
		
		textField = new JTextField();
		textField.setBounds(494, 185, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(495, 568, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterOrderNumber = new JLabel("Enter Order Number:");
		lblEnterOrderNumber.setForeground(Color.WHITE);
		lblEnterOrderNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterOrderNumber.setBounds(317, 174, 165, 41);
		contentPane.add(lblEnterOrderNumber);
		
		JLabel label = new JLabel("Enter Order Number:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(317, 557, 165, 41);
		contentPane.add(label);
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();//Model here

		
		String q = "SELECT * FROM dgargu1db.pasta";
		String arr [][] = null;
		ResultSet rs = QueryClass.query(q);
		
		try {
			while (rs.next()) {
				String order = rs.getString("order_num");
				String ID = rs.getString("cust_ID");
				String pasta = rs.getString("pasta_type");
				String sauce = rs.getString("sauce_type");
				String ingr = rs.getString("ingredients");
				String seas = rs.getString("seasonings");

				System.out.println(order + ", " + ID + ", " + pasta + ", " + sauce + ", " + ingr + ", " + seas);
				
				model.addRow(new String[]{order ,ID, pasta , sauce, ingr , seas});
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			System.out.println("oops");
		}
		System.out.println("Here");
//		model.addRow(new String[] {"This","Table","is","nice","ok"});
		//for(String i: arr) {System.out.println(i);}
		//table
	}
}
