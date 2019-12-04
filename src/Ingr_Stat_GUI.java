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
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 900, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JCheckBox checkBoxAlfredo = new JCheckBox("Status");
		checkBoxAlfredo.setForeground(Color.WHITE);
		checkBoxAlfredo.setBackground(Color.DARK_GRAY);
		checkBoxAlfredo.setSelected(Tools.getIngredientStatus("Alfredo")); // Initializations Status based on Database
		checkBoxAlfredo.setBounds(428, 119, 82, 25);
		contentPane.add(checkBoxAlfredo);

		JButton btnApplyChanges = new JButton("Apply Changes");
		btnApplyChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(Tools.getIngredientStatus("Alfredo") + " Status");
				Tools.setIngredientStatus("Alfredo", checkBoxAlfredo.isSelected());
				System.out.println(checkBoxAlfredo.isSelected());
				System.out.println("Apply changes went thru");
			}
		});
		btnApplyChanges.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnApplyChanges.setBounds(287, 627, 195, 33);
		contentPane.add(btnApplyChanges);

		JLabel lblAlfredo = new JLabel("Alfredo");
		lblAlfredo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlfredo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAlfredo.setForeground(new Color(255, 255, 255));
		lblAlfredo.setBounds(277, 119, 103, 25);
		contentPane.add(lblAlfredo);

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

		// title
		JLabel lblIngredientStatus = new JLabel("Ingredient Status Page");
		lblIngredientStatus.setForeground(Color.WHITE);
		lblIngredientStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngredientStatus.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblIngredientStatus.setBounds(229, 20, 416, 43);
		contentPane.add(lblIngredientStatus);
		
		//ingredient text box
		JLabel lblStatus = new JLabel("Ingredient");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblStatus.setForeground(Color.WHITE);
		lblStatus.setBounds(239, 86, 141, 25);
		contentPane.add(lblStatus);
		
		//stock status text box
		JLabel lblStockStatus = new JLabel("Stock Status");
		lblStockStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStockStatus.setForeground(Color.WHITE);
		lblStockStatus.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblStockStatus.setBounds(418, 87, 133, 25);
		contentPane.add(lblStockStatus);

		JCheckBox checkBoxBacon = new JCheckBox("Status");
		checkBoxBacon.setForeground(Color.WHITE);
		checkBoxBacon.setBackground(Color.DARK_GRAY);
		checkBoxBacon.setSelected(true);
		checkBoxBacon.setBounds(428, 145, 82, 25);
		contentPane.add(checkBoxBacon);

		JLabel lblBacon = new JLabel("Bacon");
		lblBacon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBacon.setForeground(Color.WHITE);
		lblBacon.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBacon.setBounds(277, 145, 103, 25);
		contentPane.add(lblBacon);

		JLabel lblBowtie = new JLabel("Bowtie");
		lblBowtie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBowtie.setForeground(Color.WHITE);
		lblBowtie.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBowtie.setBounds(277, 171, 103, 25);
		contentPane.add(lblBowtie);

		JLabel lblBrocolli = new JLabel("Brocolli");
		lblBrocolli.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBrocolli.setForeground(Color.WHITE);
		lblBrocolli.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBrocolli.setBounds(277, 197, 103, 25);
		contentPane.add(lblBrocolli);

		JCheckBox checkBoxBrocolli = new JCheckBox("Status");
		checkBoxBrocolli.setForeground(Color.WHITE);
		checkBoxBrocolli.setBackground(Color.DARK_GRAY);
		checkBoxBrocolli.setSelected(true);
		checkBoxBrocolli.setBounds(428, 197, 82, 25);
		contentPane.add(checkBoxBrocolli);

		JCheckBox checkBoxBowtie = new JCheckBox("Status");
		checkBoxBowtie.setForeground(Color.WHITE);
		checkBoxBowtie.setBackground(Color.DARK_GRAY);
		checkBoxBowtie.setSelected(true);
		checkBoxBowtie.setBounds(428, 171, 82, 25);
		contentPane.add(checkBoxBowtie);

		JLabel lblCajun = new JLabel("Cajun");
		lblCajun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCajun.setForeground(Color.WHITE);
		lblCajun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCajun.setBounds(277, 223, 103, 25);
		contentPane.add(lblCajun);

		JLabel lblCheese = new JLabel("Cheese");
		lblCheese.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCheese.setForeground(Color.WHITE);
		lblCheese.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCheese.setBounds(277, 249, 103, 25);
		contentPane.add(lblCheese);

		JLabel lblChicken = new JLabel("Chicken");
		lblChicken.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChicken.setForeground(Color.WHITE);
		lblChicken.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblChicken.setBounds(277, 275, 103, 25);
		contentPane.add(lblChicken);

		JLabel lblEgg = new JLabel("Egg");
		lblEgg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEgg.setForeground(Color.WHITE);
		lblEgg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEgg.setBounds(277, 301, 103, 25);
		contentPane.add(lblEgg);

		JCheckBox checkBoxCajun = new JCheckBox("Status");
		checkBoxCajun.setForeground(Color.WHITE);
		checkBoxCajun.setBackground(Color.DARK_GRAY);
		checkBoxCajun.setSelected(true);
		checkBoxCajun.setBounds(428, 223, 82, 25);
		contentPane.add(checkBoxCajun);

		JCheckBox checkBoxCheese = new JCheckBox("Status");
		checkBoxCheese.setForeground(Color.WHITE);
		checkBoxCheese.setBackground(Color.DARK_GRAY);
		checkBoxCheese.setSelected(true);
		checkBoxCheese.setBounds(428, 249, 82, 25);
		contentPane.add(checkBoxCheese);

		JCheckBox checkBoxChicken = new JCheckBox("Status");
		checkBoxChicken.setForeground(Color.WHITE);
		checkBoxChicken.setBackground(Color.DARK_GRAY);
		checkBoxChicken.setSelected(true);
		checkBoxChicken.setBounds(428, 275, 82, 25);
		contentPane.add(checkBoxChicken);

		JCheckBox checkBoxEgg = new JCheckBox("Status");
		checkBoxEgg.setForeground(Color.WHITE);
		checkBoxEgg.setBackground(Color.DARK_GRAY);
		checkBoxEgg.setSelected(true);
		checkBoxEgg.setBounds(428, 301, 82, 25);
		contentPane.add(checkBoxEgg);

		JLabel lblMarinara = new JLabel("Marinara");
		lblMarinara.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMarinara.setForeground(Color.WHITE);
		lblMarinara.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMarinara.setBounds(277, 327, 103, 25);
		contentPane.add(lblMarinara);

		JLabel lblMeatball = new JLabel("Meatball");
		lblMeatball.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMeatball.setForeground(Color.WHITE);
		lblMeatball.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMeatball.setBounds(277, 353, 103, 25);
		contentPane.add(lblMeatball);

		JLabel lblOldBay = new JLabel("Old Bay");
		lblOldBay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOldBay.setForeground(Color.WHITE);
		lblOldBay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOldBay.setBounds(277, 379, 103, 25);
		contentPane.add(lblOldBay);

		JLabel lblOnion = new JLabel("Pancakes");
		lblOnion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOnion.setForeground(Color.WHITE);
		lblOnion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOnion.setBounds(277, 405, 103, 25);
		contentPane.add(lblOnion);

		JCheckBox checkBoxMarinara = new JCheckBox("Status");
		checkBoxMarinara.setForeground(Color.WHITE);
		checkBoxMarinara.setBackground(Color.DARK_GRAY);
		checkBoxMarinara.setSelected(true);
		checkBoxMarinara.setBounds(428, 327, 82, 25);
		contentPane.add(checkBoxMarinara);

		JCheckBox checkBoxMeatball = new JCheckBox("Status");
		checkBoxMeatball.setForeground(Color.WHITE);
		checkBoxMeatball.setBackground(Color.DARK_GRAY);
		checkBoxMeatball.setSelected(true);
		checkBoxMeatball.setBounds(428, 353, 82, 25);
		contentPane.add(checkBoxMeatball);

		JCheckBox checkBoxOldBay = new JCheckBox("Status");
		checkBoxOldBay.setForeground(Color.WHITE);
		checkBoxOldBay.setBackground(Color.DARK_GRAY);
		checkBoxOldBay.setSelected(true);
		checkBoxOldBay.setBounds(428, 379, 82, 25);
		contentPane.add(checkBoxOldBay);

		JCheckBox checkBoxPancakes = new JCheckBox("Status");
		checkBoxPancakes.setForeground(Color.WHITE);
		checkBoxPancakes.setBackground(Color.DARK_GRAY);
		checkBoxPancakes.setSelected(true);
		checkBoxPancakes.setBounds(428, 405, 82, 25);
		contentPane.add(checkBoxPancakes);

		JLabel lblPenne = new JLabel("Penne");
		lblPenne.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPenne.setForeground(Color.WHITE);
		lblPenne.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPenne.setBounds(277, 431, 103, 25);
		contentPane.add(lblPenne);

		JLabel lblPepper = new JLabel("Pepper");
		lblPepper.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPepper.setForeground(Color.WHITE);
		lblPepper.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPepper.setBounds(277, 457, 103, 25);
		contentPane.add(lblPepper);

		JLabel lblPesto = new JLabel("Pesto");
		lblPesto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesto.setForeground(Color.WHITE);
		lblPesto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPesto.setBounds(277, 483, 103, 25);
		contentPane.add(lblPesto);

		JLabel lblSalt = new JLabel("Salt");
		lblSalt.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSalt.setForeground(Color.WHITE);
		lblSalt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSalt.setBounds(277, 509, 103, 25);
		contentPane.add(lblSalt);

		JCheckBox checkBoxPenne = new JCheckBox("Status");
		checkBoxPenne.setForeground(Color.WHITE);
		checkBoxPenne.setBackground(Color.DARK_GRAY);
		checkBoxPenne.setSelected(true);
		checkBoxPenne.setBounds(428, 431, 82, 25);
		contentPane.add(checkBoxPenne);

		JCheckBox checkBoxPepper = new JCheckBox("Status");
		checkBoxPepper.setForeground(Color.WHITE);
		checkBoxPepper.setBackground(Color.DARK_GRAY);
		checkBoxPepper.setSelected(true);
		checkBoxPepper.setBounds(428, 457, 82, 25);
		contentPane.add(checkBoxPepper);

		JCheckBox checkBoxPesto = new JCheckBox("Status");
		checkBoxPesto.setForeground(Color.WHITE);
		checkBoxPesto.setBackground(Color.DARK_GRAY);
		checkBoxPesto.setSelected(true);
		checkBoxPesto.setBounds(428, 483, 82, 25);
		contentPane.add(checkBoxPesto);

		JCheckBox checkBoxSalt = new JCheckBox("Status");
		checkBoxSalt.setForeground(Color.WHITE);
		checkBoxSalt.setBackground(Color.DARK_GRAY);
		checkBoxSalt.setSelected(true);
		checkBoxSalt.setBounds(428, 509, 82, 25);
		contentPane.add(checkBoxSalt);

		JLabel lblVeganChicken = new JLabel("Vegan Chicken");
		lblVeganChicken.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeganChicken.setForeground(Color.WHITE);
		lblVeganChicken.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVeganChicken.setBounds(277, 587, 103, 25);
		contentPane.add(lblVeganChicken);

		JLabel lblSpinach = new JLabel("Spinach");
		lblSpinach.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSpinach.setForeground(Color.WHITE);
		lblSpinach.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSpinach.setBounds(277, 561, 103, 25);
		contentPane.add(lblSpinach);

		JLabel lblSausage = new JLabel("Sausage");
		lblSausage.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSausage.setForeground(Color.WHITE);
		lblSausage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSausage.setBounds(277, 535, 103, 25);
		contentPane.add(lblSausage);

		JCheckBox checkBoxSausage = new JCheckBox("Status");
		checkBoxSausage.setForeground(Color.WHITE);
		checkBoxSausage.setBackground(Color.DARK_GRAY);
		checkBoxSausage.setSelected(true);
		checkBoxSausage.setBounds(428, 535, 82, 25);
		contentPane.add(checkBoxSausage);

		JCheckBox checkBoxSpinach = new JCheckBox("Status");
		checkBoxSpinach.setForeground(Color.WHITE);
		checkBoxSpinach.setBackground(Color.DARK_GRAY);
		checkBoxSpinach.setSelected(true);
		checkBoxSpinach.setBounds(428, 561, 82, 25);
		contentPane.add(checkBoxSpinach);

		JCheckBox checkBoxVeganChicken = new JCheckBox("Status");
		checkBoxVeganChicken.setForeground(Color.WHITE);
		checkBoxVeganChicken.setBackground(Color.DARK_GRAY);
		checkBoxVeganChicken.setSelected(true);
		checkBoxVeganChicken.setBounds(428, 587, 82, 25);
		contentPane.add(checkBoxVeganChicken);
	}
}
