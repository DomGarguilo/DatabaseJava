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
	private JTable table_1;

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
		setBounds(100, 100, 1564, 751);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewOrders = new JLabel("View Orders");
		lblViewOrders.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewOrders.setForeground(Color.WHITE);
		lblViewOrders.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblViewOrders.setBounds(687, 69, 162, 41);
		contentPane.add(lblViewOrders);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee_GUI egui = new Employee_GUI();
				egui.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(62, 35, 97, 25);
		contentPane.add(btnBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(413, 227, 742, 156);
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
		
		JLabel lblPastaOrders = new JLabel("Pasta Orders:");
		lblPastaOrders.setForeground(Color.WHITE);
		lblPastaOrders.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPastaOrders.setBounds(413, 173, 162, 41);
		contentPane.add(lblPastaOrders);
		
		JLabel lblBreakfastOrders = new JLabel("Breakfast Orders:");
		lblBreakfastOrders.setForeground(Color.WHITE);
		lblBreakfastOrders.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBreakfastOrders.setBounds(66, 421, 209, 41);
		contentPane.add(lblBreakfastOrders);
		
		textField = new JTextField();
		textField.setBounds(817, 187, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCompleteBreakfastOrder = new JButton("Complete This Breakfast Order");
		btnCompleteBreakfastOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(textField.getText());
				String q = "DELETE FROM dgargu1db.breakfast WHERE order_num="+ textField_1.getText() +";";
				QueryClass.update(q);
				View_Orders_GUI cg = new View_Orders_GUI();
				cg.setVisible(true);
				dispose();
			}
		});
		btnCompleteBreakfastOrder.setBounds(1238, 434, 227, 25);
		contentPane.add(btnCompleteBreakfastOrder);
		
		JButton btnCompletePastaOrder = new JButton("Complete This Pasta Order");
		btnCompletePastaOrder.setBounds(951, 184, 204, 25);
		contentPane.add(btnCompletePastaOrder);
		btnCompletePastaOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String q = "DELETE FROM dgargu1db.pasta WHERE order_num="+ textField.getText()  +";"; //textField_1.getText()
				QueryClass.update(q);
				View_Orders_GUI cg = new View_Orders_GUI();
				cg.setVisible(true);
				dispose();
			}
		});
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(1095, 435, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterOrderNumber = new JLabel("Enter Order Number:");
		lblEnterOrderNumber.setForeground(Color.WHITE);
		lblEnterOrderNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterOrderNumber.setBounds(640, 176, 165, 41);
		contentPane.add(lblEnterOrderNumber);
		
		
		JLabel label = new JLabel("Enter Order Number:");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(918, 424, 165, 41);
		contentPane.add(label);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(66, 475, 1399, 184);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Order_Num", "Customer_ID", "Pancake_Quantity", "Fried_Egg Quantity", "Omlette", "Scrambled_Eggs", "Ingredients", "Seasonings", "Bacon_Quantity", "Sausage_Quantity"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
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
		
		String q2 = "SELECT * FROM dgargu1db.breakfast";
		ResultSet rs2 = QueryClass.query(q2);
		DefaultTableModel model2 = (DefaultTableModel) table_1.getModel();//Model here

		System.out.println("Breakfast");
		try {
			while (rs2.next()) {
				String order = rs2.getString("order_num");
				String ID = rs2.getString("cust_ID");
				String pan = rs2.getString("pancake_quantity");
				String feq = rs2.getString("fried_egg_quantity");
				String om = rs2.getString("omlette");
				String se = rs2.getString("scrambled_eggs");
				String ing = rs2.getString("ingredients");
				String seas = rs2.getString("seasonings");
				String bq = rs2.getString("bacon_quantity");
				String sq = rs2.getString("sausage_quantity");

				System.out.println(order);
				model2.addRow(new String[]{order ,ID, pan,feq,om,se,ing,seas,bq,sq});
				
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
			System.out.println("oops");
		}
		System.out.println("Here");
		
	}
}
