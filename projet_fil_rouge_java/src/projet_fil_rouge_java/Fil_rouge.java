package projet_fil_rouge_java;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class Fil_rouge extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4862798308073302717L;
	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButtonTest = new JButton("Cliquez-moi");
	private JPanel productPan = new JPanel();
	private JLabel lblNewLabel = new JLabel("Test");
	private JTable condUniTable;
	private JTextField textField_1;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//look window
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					//start window
					Fil_rouge window = new Fil_rouge();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fil_rouge() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel contentPane=(JPanel)frame.getContentPane();
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		/*Product Frame*/
		tabbedPane.addTab("Product", null, productPan, null);
		JPanel inContentPane = new JPanel();
		productPan.add(inContentPane);
		/*inContentPane.setLayout(new BorderLayout());*/
		
		JPanel leftPan = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
		leftPan.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		leftPan.setPreferredSize(new Dimension(170, 600));
		/*productPan.add(leftPan, BorderLayout.WEST);*/
		
		JLabel lblNewLabel_1 = new JLabel("Test Titre");
		leftPan.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Création");
		leftPan.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Suppréssion");
		leftPan.add(btnNewButton_1);
		
		
		
		
		/*Anonimous class//inner class*/
		
		/*btnNewButtonTest.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnTestListener(e);
			}
		});
		
		/*Lambda si 1 seule methode abstraite*/
		//btnNewButtonTest.addActionListener((e)->btnTestListener(e));
		
		/*Référence sur methode. Possible que si methode utilisée*/
		btnNewButtonTest.addActionListener(this::btnTestListener);
		
		textField = new JTextField();
		
		
		JPanel centerPan = new JPanel(new FlowLayout(FlowLayout.CENTER, 300, 100));
		centerPan.setBorder(new LineBorder(new Color(0, 0, 0)));
		centerPan.setPreferredSize(new Dimension(400, 600));
		/*productPan.add(centerPan);*/
		
		centerPan.add(lblNewLabel);
		
		centerPan.add(btnNewButtonTest);
		
		centerPan.add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		centerPan.add(lblNewLabel_2);
		
		JPanel rightPan = new JPanel(new FlowLayout());
		rightPan.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightPan.setPreferredSize(new Dimension(400, 600));
	
		/*productPan.add(rightPan, BorderLayout.EAST);*/
		inContentPane.add(leftPan, BorderLayout.WEST);
		inContentPane.add(centerPan);
		inContentPane.add(rightPan, BorderLayout.EAST);
		
		JLabel lblNewLabel_3 = new JLabel("Recherche");
		rightPan.add(lblNewLabel_3);
		
		JPanel surchPan = new JPanel();
		surchPan.setPreferredSize(new Dimension(400, 50));
		rightPan.add(surchPan);
		
		textField_1 = new JTextField();
		surchPan.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Ok");
		
		surchPan.add(btnNewButton_2);
		
		JTabbedPane bddPan = new JTabbedPane(JTabbedPane.TOP);
		rightPan.add(bddPan);
		
		
		
		/*Fournisseur Frame*/
		JPanel supplierPan = new JPanel();
		tabbedPane.addTab("Fournisseur", null, supplierPan, null);
		
		/*Commande Frame*/
		JPanel packagePan = new JPanel();
		tabbedPane.addTab("Commande", null, packagePan, null);
		
		/*Stock Frame*/
		JPanel stockPan = new JPanel();
		tabbedPane.addTab("Stock", null, stockPan, null);
		
		/*Côté bdd*/
		/*Page Condition/Unité*/
		JPanel condUniPan = new JPanel();
		condUniPan.setPreferredSize(new Dimension(400, 500));
		bddPan.addTab("Condition/Unit", null, condUniPan, null);
		
		/*Section Table*/
		JPanel tablePan = new JPanel();
		tablePan.setPreferredSize(new Dimension(380, 350));
		condUniPan.add(tablePan);
		/*Table Model*/
		DefaultTableModel model = new DefaultTableModel(30,5);
		condUniTable = new JTable(model);
		/*Columns name*/
		String col[] = {"Product","Nom","Fournisseur","Prix","Date Ajout"}; 
		for(int i=0;i<condUniTable.getColumnCount();i++)
			{
		TableColumn column1 = condUniTable.getTableHeader().getColumnModel().getColumn(i);  
		column1.setHeaderValue(col[i]);
			}
		/*Scrollable Table*/
		JScrollPane condUniTableSP= new JScrollPane (condUniTable);
		condUniTableSP.setPreferredSize(new Dimension(380, 350) );
		
		tablePan.add(condUniTableSP);
		
		/*Buttons section*/
		JPanel btnTabblePan = new JPanel();
		condUniPan.add(btnTabblePan, BorderLayout.SOUTH);
		
		JButton btnCreatBdd = new JButton("Cr\u00E9er");
		btnTabblePan.add(btnCreatBdd);
		
		JButton btnModBdd = new JButton("Modifier");
		btnTabblePan.add(btnModBdd);
		
		JButton btnDelBdd = new JButton("Supprimer");
		btnTabblePan.add(btnDelBdd);
		
		/*Page Package/Product*/
		JPanel pacProPan = new JPanel();
		pacProPan.setPreferredSize(new Dimension(400, 500));
		bddPan.addTab("Package/Product", null, pacProPan, null);
		
		JPanel tablePan_1 = new JPanel();
		pacProPan.add(tablePan_1);
		
		table = new JTable(22, 5);
		tablePan_1.add(table);
		
		JPanel btnTabblePan_1 = new JPanel();
		pacProPan.add(btnTabblePan_1);
		
		JButton btnCreatBdd_1 = new JButton("Cr\u00E9er");
		btnTabblePan_1.add(btnCreatBdd_1);
		
		JButton btnModBdd_1 = new JButton("Modifier");
		btnTabblePan_1.add(btnModBdd_1);
		
		JButton btnDelBdd_1 = new JButton("Supprimer");
		btnTabblePan_1.add(btnDelBdd_1);
	}
	/**
	 * Listen Button
	 */

private void btnTestListener(ActionEvent event) {
	System.out.println("btn click");
	}
}


