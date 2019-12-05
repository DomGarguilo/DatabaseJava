import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ingr_Stat_GUI extends JFrame {

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
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// title
		JLabel lblIngredientStatus = new JLabel("Ingredient Status Page");
		lblIngredientStatus.setForeground(Color.WHITE);
		lblIngredientStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngredientStatus.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIngredientStatus.setBounds(233, 3, 416, 43);
		contentPane.add(lblIngredientStatus);

		// ingredient text box
		JLabel lblStatus = new JLabel("Ingredient");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(244, 59, 141, 25);
		contentPane.add(lblStatus);

		// stock status text box
		JLabel lblStockStatus = new JLabel("Stock Status");
		lblStockStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStockStatus.setForeground(Color.WHITE);
		lblStockStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStockStatus.setBounds(423, 60, 133, 25);
		contentPane.add(lblStockStatus);

		// alfredo box
		JCheckBox checkBoxAlfredo = new JCheckBox("Status");
		checkBoxAlfredo.setForeground(Color.WHITE);
		checkBoxAlfredo.setBackground(Color.DARK_GRAY);
		checkBoxAlfredo.setSelected(Tools.getIngredientStatus("Alfredo")); // Initializations Status based on Database
		checkBoxAlfredo.setBounds(423, 94, 82, 25);
		contentPane.add(checkBoxAlfredo);

		JLabel lblAlfredo = new JLabel("Alfredo");
		lblAlfredo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlfredo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlfredo.setForeground(new Color(255, 255, 255));
		lblAlfredo.setBounds(282, 92, 103, 25);
		contentPane.add(lblAlfredo);

		JCheckBox checkBoxBacon = new JCheckBox("Status");
		checkBoxBacon.setForeground(Color.WHITE);
		checkBoxBacon.setBackground(Color.DARK_GRAY);
		checkBoxBacon.setSelected(Tools.getIngredientStatus("Bacon")); // Initializations Status based on Database
		checkBoxBacon.setBounds(423, 120, 82, 25);
		contentPane.add(checkBoxBacon);

		JLabel lblBacon = new JLabel("Bacon");
		lblBacon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBacon.setForeground(Color.WHITE);
		lblBacon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBacon.setBounds(282, 118, 103, 25);
		contentPane.add(lblBacon);

		JLabel lblBowtie = new JLabel("Bowtie");
		lblBowtie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBowtie.setForeground(Color.WHITE);
		lblBowtie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBowtie.setBounds(282, 143, 103, 25);
		contentPane.add(lblBowtie);

		JCheckBox checkBoxBowtie = new JCheckBox("Status");
		checkBoxBowtie.setForeground(Color.WHITE);
		checkBoxBowtie.setBackground(Color.DARK_GRAY);
		checkBoxBowtie.setSelected(Tools.getIngredientStatus("Bowtie")); // Initializations Status based on Database
		checkBoxBowtie.setBounds(423, 145, 82, 25);
		contentPane.add(checkBoxBowtie);

		JLabel lblCajun = new JLabel("Cajun");
		lblCajun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCajun.setForeground(Color.WHITE);
		lblCajun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCajun.setBounds(282, 173, 103, 25);
		contentPane.add(lblCajun);

		JLabel lblCheese = new JLabel("Cheese");
		lblCheese.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCheese.setForeground(Color.WHITE);
		lblCheese.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCheese.setBounds(282, 203, 103, 25);
		contentPane.add(lblCheese);

		JLabel lblChicken = new JLabel("Chicken");
		lblChicken.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChicken.setForeground(Color.WHITE);
		lblChicken.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChicken.setBounds(282, 233, 103, 25);
		contentPane.add(lblChicken);

		JLabel lblEgg = new JLabel("Egg");
		lblEgg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEgg.setForeground(Color.WHITE);
		lblEgg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEgg.setBounds(282, 263, 103, 25);
		contentPane.add(lblEgg);

		JCheckBox checkBoxCajun = new JCheckBox("Status");
		checkBoxCajun.setForeground(Color.WHITE);
		checkBoxCajun.setBackground(Color.DARK_GRAY);
		checkBoxCajun.setSelected(Tools.getIngredientStatus("Cajun")); // Initializations Status based on Database
		checkBoxCajun.setBounds(423, 175, 82, 25);
		contentPane.add(checkBoxCajun);

		JCheckBox checkBoxCheese = new JCheckBox("Status");
		checkBoxCheese.setForeground(Color.WHITE);
		checkBoxCheese.setBackground(Color.DARK_GRAY);
		checkBoxCheese.setSelected(Tools.getIngredientStatus("Cheese")); // Initializations Status based on Database
		checkBoxCheese.setBounds(423, 205, 82, 25);
		contentPane.add(checkBoxCheese);

		JCheckBox checkBoxChicken = new JCheckBox("Status");
		checkBoxChicken.setForeground(Color.WHITE);
		checkBoxChicken.setBackground(Color.DARK_GRAY);
		checkBoxChicken.setSelected(Tools.getIngredientStatus("Chicken")); // Initializations Status based on Database
		checkBoxChicken.setBounds(423, 235, 82, 25);
		contentPane.add(checkBoxChicken);

		JCheckBox checkBoxEgg = new JCheckBox("Status");
		checkBoxEgg.setForeground(Color.WHITE);
		checkBoxEgg.setBackground(Color.DARK_GRAY);
		checkBoxEgg.setSelected(Tools.getIngredientStatus("Egg")); // Initializations Status based on Database
		checkBoxEgg.setBounds(423, 265, 82, 25);
		contentPane.add(checkBoxEgg);

		JLabel lblMarinara = new JLabel("Marinara");
		lblMarinara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarinara.setForeground(Color.WHITE);
		lblMarinara.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarinara.setBounds(282, 293, 103, 25);
		contentPane.add(lblMarinara);

		JLabel lblMeatball = new JLabel("Meatball");
		lblMeatball.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMeatball.setForeground(Color.WHITE);
		lblMeatball.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMeatball.setBounds(282, 323, 103, 25);
		contentPane.add(lblMeatball);

		JLabel lblOldBay = new JLabel("Old Bay");
		lblOldBay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOldBay.setForeground(Color.WHITE);
		lblOldBay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOldBay.setBounds(282, 377, 103, 25);
		contentPane.add(lblOldBay);

		JLabel lblOnion = new JLabel("Pancakes");
		lblOnion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOnion.setForeground(Color.WHITE);
		lblOnion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOnion.setBounds(282, 440, 103, 25);
		contentPane.add(lblOnion);

		JCheckBox checkBoxMarinara = new JCheckBox("Status");
		checkBoxMarinara.setForeground(Color.WHITE);
		checkBoxMarinara.setBackground(Color.DARK_GRAY);
		checkBoxMarinara.setSelected(Tools.getIngredientStatus("Marinara")); // Initializations Status based on Database
		checkBoxMarinara.setBounds(423, 295, 82, 25);
		contentPane.add(checkBoxMarinara);

		JCheckBox checkBoxMeatball = new JCheckBox("Status");
		checkBoxMeatball.setForeground(Color.WHITE);
		checkBoxMeatball.setBackground(Color.DARK_GRAY);
		checkBoxMeatball.setSelected(Tools.getIngredientStatus("Meatball")); // Initializations Status based on Database
		checkBoxMeatball.setBounds(423, 325, 82, 25);
		contentPane.add(checkBoxMeatball);

		JCheckBox checkBoxOldBay = new JCheckBox("Status");
		checkBoxOldBay.setForeground(Color.WHITE);
		checkBoxOldBay.setBackground(Color.DARK_GRAY);
		checkBoxOldBay.setSelected(Tools.getIngredientStatus("Old Bay")); // Initializations Status based on Database
		checkBoxOldBay.setBounds(423, 379, 82, 25);
		contentPane.add(checkBoxOldBay);

		JCheckBox checkBoxPancakes = new JCheckBox("Status");
		checkBoxPancakes.setForeground(Color.WHITE);
		checkBoxPancakes.setBackground(Color.DARK_GRAY);
		checkBoxPancakes.setSelected(Tools.getIngredientStatus("Pancakes")); // Initializations Status based on Database
		checkBoxPancakes.setBounds(423, 442, 82, 25);
		contentPane.add(checkBoxPancakes);

		JLabel lblPenne = new JLabel("Penne");
		lblPenne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPenne.setForeground(Color.WHITE);
		lblPenne.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPenne.setBounds(282, 472, 103, 25);
		contentPane.add(lblPenne);

		JLabel lblPesto = new JLabel("Pesto");
		lblPesto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesto.setForeground(Color.WHITE);
		lblPesto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPesto.setBounds(282, 507, 103, 25);
		contentPane.add(lblPesto);

		JLabel lblSalt = new JLabel("Salt");
		lblSalt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalt.setForeground(Color.WHITE);
		lblSalt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalt.setBounds(282, 536, 103, 25);
		contentPane.add(lblSalt);

		JCheckBox checkBoxPenne = new JCheckBox("Status");
		checkBoxPenne.setForeground(Color.WHITE);
		checkBoxPenne.setBackground(Color.DARK_GRAY);
		checkBoxPenne.setSelected(Tools.getIngredientStatus("Penne")); // Initializations Status based on Database
		checkBoxPenne.setBounds(423, 472, 82, 25);
		contentPane.add(checkBoxPenne);

		JCheckBox checkBoxPesto = new JCheckBox("Status");
		checkBoxPesto.setForeground(Color.WHITE);
		checkBoxPesto.setBackground(Color.DARK_GRAY);
		checkBoxPesto.setSelected(Tools.getIngredientStatus("Pesto")); // Initializations Status based on Database
		checkBoxPesto.setBounds(423, 509, 82, 25);
		contentPane.add(checkBoxPesto);

		JCheckBox checkBoxSalt = new JCheckBox("Status");
		checkBoxSalt.setForeground(Color.WHITE);
		checkBoxSalt.setBackground(Color.DARK_GRAY);
		checkBoxSalt.setSelected(Tools.getIngredientStatus("Salt")); // Initializations Status based on Database
		checkBoxSalt.setBounds(423, 538, 82, 25);
		contentPane.add(checkBoxSalt);

		JLabel lblSausage = new JLabel("Sausage");
		lblSausage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSausage.setForeground(Color.WHITE);
		lblSausage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSausage.setBounds(282, 566, 103, 25);
		contentPane.add(lblSausage);

		JCheckBox checkBoxSausage = new JCheckBox("Status");
		checkBoxSausage.setForeground(Color.WHITE);
		checkBoxSausage.setBackground(Color.DARK_GRAY);
		checkBoxSausage.setSelected(Tools.getIngredientStatus("Sausage")); // Initializations Status based on Database
		checkBoxSausage.setBounds(423, 568, 82, 25);
		contentPane.add(checkBoxSausage);
		
		JCheckBox checkBoxMushroom = new JCheckBox("Status");
		checkBoxMushroom.setSelected(false);
		checkBoxMushroom.setForeground(Color.WHITE);
		checkBoxMushroom.setBackground(Color.DARK_GRAY);
		checkBoxMushroom.setSelected(Tools.getIngredientStatus("Mushroom")); // Initializations Status based on Database
		checkBoxMushroom.setBounds(423, 353, 82, 25);
		contentPane.add(checkBoxMushroom);
		
		JCheckBox checkBoxOnion = new JCheckBox("Status");
		checkBoxOnion.setSelected(false);
		checkBoxOnion.setForeground(Color.WHITE);
		checkBoxOnion.setBackground(Color.DARK_GRAY);
		checkBoxOnion.setSelected(Tools.getIngredientStatus("Onion")); // Initializations Status based on Database
		checkBoxOnion.setBounds(423, 409, 82, 25);
		contentPane.add(checkBoxOnion);
		
		JCheckBox checkBoxGarlic = new JCheckBox("Status");
		checkBoxGarlic.setSelected(false);
		checkBoxGarlic.setForeground(Color.WHITE);
		checkBoxGarlic.setBackground(Color.DARK_GRAY);
		checkBoxGarlic.setSelected(Tools.getIngredientStatus("Garlic")); // Initializations Status based on Database
		checkBoxGarlic.setBounds(423, 593, 82, 25);
		contentPane.add(checkBoxGarlic);

		JButton btnBack = new JButton("Back");
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
		btnBack.setBounds(35, 20, 97, 25);
		contentPane.add(btnBack);

		JButton btnApplyChanges = new JButton("Apply Changes");
		btnApplyChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tools.setIngredientStatus("Alfredo", checkBoxAlfredo.isSelected());
				Tools.setIngredientStatus("Bacon", checkBoxBacon.isSelected());
				Tools.setIngredientStatus("Bowtie", checkBoxBowtie.isSelected());
				Tools.setIngredientStatus("Cajun", checkBoxCajun.isSelected());
				Tools.setIngredientStatus("Cheese", checkBoxCheese.isSelected());
				Tools.setIngredientStatus("Chicken", checkBoxChicken.isSelected());
				Tools.setIngredientStatus("Egg", checkBoxEgg.isSelected());
				Tools.setIngredientStatus("Marinara", checkBoxMarinara.isSelected());
				Tools.setIngredientStatus("Meatball", checkBoxMeatball.isSelected());
				Tools.setIngredientStatus("Mushroom", checkBoxMushroom.isSelected());
				Tools.setIngredientStatus("Old Bay", checkBoxOldBay.isSelected());
				Tools.setIngredientStatus("Onion", checkBoxOnion.isSelected());
				Tools.setIngredientStatus("Pancakes", checkBoxPancakes.isSelected());
				Tools.setIngredientStatus("Penne", checkBoxPenne.isSelected());
				Tools.setIngredientStatus("Pesto", checkBoxPesto.isSelected());
				Tools.setIngredientStatus("Salt", checkBoxSalt.isSelected());
				Tools.setIngredientStatus("Sausage", checkBoxSausage.isSelected());
				Tools.setIngredientStatus("Garlic", checkBoxGarlic.isSelected());
				
			}
		});
		btnApplyChanges.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnApplyChanges.setBounds(310, 627, 195, 33);
		contentPane.add(btnApplyChanges);
		
		JLabel lblMushroom = new JLabel("Mushroom");
		lblMushroom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMushroom.setForeground(Color.WHITE);
		lblMushroom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMushroom.setBounds(282, 351, 103, 25);
		contentPane.add(lblMushroom);
		
		JLabel lblOnion_1 = new JLabel("Onion");
		lblOnion_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOnion_1.setForeground(Color.WHITE);
		lblOnion_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOnion_1.setBounds(282, 407, 103, 25);
		contentPane.add(lblOnion_1);
		
		JLabel lblGarlic = new JLabel("Garlic");
		lblGarlic.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGarlic.setForeground(Color.WHITE);
		lblGarlic.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblGarlic.setBounds(282, 589, 103, 25);
		contentPane.add(lblGarlic);
	
	}
}
