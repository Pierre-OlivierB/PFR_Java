package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Package extends JPanel{
	private static final long serialVersionUID = -4610886238798936616L;
	private JFrame frame;
	private JButton btnNewButtonTest = new JButton("Cliquez-moi");
	/*private JPanel supplierPan = new JPanel();*/
	private JTable condUniTable;
	private JTextField textField_1;
	private JTable table;
	private JComboBox combobox; 
	private JTextField textNomField;
	private JTextField textPDateField;
	private JTextField textPUserField;
	private JPanel contentPane;
	private JPanel inContentPanePac;
	private JPanel leftPanPac;
	private JPanel centerPanPac = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JTabbedPane bddPan;
	private JTextField adressTxtF;
	private JTextField supNameTxtF;
	private JTextField contactFNameTxtF;
	private JTextField contactNameTxtF;
	private JTextField contactNumberTxtF;
	private JPanel addAndResultPan;
	private JTextField pNameTextField;
	private JTextField pBrandTextField;
	private JTextField pPriceTextField;
	private JTextField statuTxtField;
	

	public Package() {
		initialize();
		
	}
	
	private void initialize() {
		
	contentPane=this;
	/*Product Frame*/
	packageFrame();

	
	/*Référence sur methode. Possible que si methode utilisée*/
	btnNewButtonTest.addActionListener(this::btnTestListener);
	
	
	/*JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));*/
	centerPanPac.setBorder(new LineBorder(new Color(0, 0, 0)));
	centerPanPac.setPreferredSize(new Dimension(400, 680));
	
	/*Top panel of center*/
	topPanelCenter();
	
	/*Mid of center Pan*/
	midCenterPan();
	controlResultPan();
	
	/*Bot of center Pan*/
	botCenterPan();
	
	/*Right Section*/
	
	rightSection();
	
	/*Côté bdd*/
	/*Page Product*/		
	
	packagePage();
	
	otherPage();

}
/**
 * Listen Button
 */

	private void btnTestListener(ActionEvent event) {
	System.out.println("btn click");
	}
	private void packageFrame() {
		inContentPanePac = new JPanel();
		contentPane.add(inContentPanePac);
		
		leftPanPac = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
		leftPanPac.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		leftPanPac.setPreferredSize(new Dimension(170, 680));
		
		JLabel listProductLbl = new JLabel("Action sur la liste des products");
		leftPanPac.add(listProductLbl);
		
		JButton btnNewButton = new JButton("Ajouter le fournisseur");
		leftPanPac.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Vider les champs");
		leftPanPac.add(btnNewButton_1);
	}
		
	private void topPanelCenter() {
		JPanel topCenterPan = new JPanel();
		topCenterPan.setLayout(new GridLayout(3,4,5,5));
		topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		topCenterPan.setPreferredSize(new Dimension(400, 100));
		centerPanPac.add(topCenterPan, BorderLayout.NORTH);
		
		JPanel voidTopLeft = new JPanel();
		topCenterPan.add(voidTopLeft);
		
		JLabel nameProductLabel = new JLabel("Nom");
		nameProductLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topCenterPan.add(nameProductLabel);
		
		JLabel creationDateLabel = new JLabel("Date de Cr\u00E9ation");
		topCenterPan.add(creationDateLabel);
		
		JPanel panel = new JPanel();
		topCenterPan.add(panel);
		
		JComboBox comboBox = new JComboBox();
		topCenterPan.add(comboBox);
		
		textNomField = new JTextField();
		topCenterPan.add(textNomField);
		textNomField.setColumns(10);
		
		JLabel textPDateField = new JLabel("");
		textPDateField.setOpaque(true);
		textPDateField.setBackground(Color.WHITE);
		topCenterPan.add(textPDateField);
		
		JPanel panel_1 = new JPanel();
		topCenterPan.add(panel_1);
		
		JPanel voidBotLeft = new JPanel();
		topCenterPan.add(voidBotLeft);
		
		JPanel voidBotMidLeft = new JPanel();
		topCenterPan.add(voidBotMidLeft);
		
		JPanel voidBotMidRight = new JPanel();
		topCenterPan.add(voidBotMidRight);
		
		JButton surchPackageBtn = new JButton("Rechercher");
		topCenterPan.add(surchPackageBtn);
	}
	private void midCenterPan() {
		/*Mid of center Pan*/
		JPanel middleCenterPan = new JPanel();
		middleCenterPan.setPreferredSize(new Dimension(400, 300));
		centerPanPac.add(middleCenterPan);

		JPanel topMidCenterPan = new JPanel();
		topMidCenterPan.setLayout(new GridLayout(7,5));
		topMidCenterPan.setPreferredSize(new Dimension(400, 290));
		middleCenterPan.add(topMidCenterPan);
		/*********************************************************/

		JLabel supplierTitle = new JLabel("Fournisseur");
		supplierTitle.setHorizontalAlignment(SwingConstants.CENTER);
		topMidCenterPan.add(supplierTitle);


		JPanel voidSupTopMidRight = new JPanel();
		topMidCenterPan.add(voidSupTopMidRight);

		JLabel brandNameTitle = new JLabel("Marque");
		topMidCenterPan.add(brandNameTitle);
		brandNameTitle.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel voidSupMidLeft = new JPanel();
		topMidCenterPan.add(voidSupMidLeft);
		
				JLabel unicPriceTitle = new JLabel("Prix Unitaire");
				topMidCenterPan.add(unicPriceTitle);
				unicPriceTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel supAutoCompLbl = new JLabel("");
		topMidCenterPan.add(supAutoCompLbl);
		
		JPanel panel = new JPanel();
		topMidCenterPan.add(panel);
		
		JLabel brandAutoCompLbl = new JLabel("");
		topMidCenterPan.add(brandAutoCompLbl);

		JPanel voidSupMidMidRight = new JPanel();
		topMidCenterPan.add(voidSupMidMidRight);
		
		JLabel unicPriceAutoCompLbl = new JLabel("");
		topMidCenterPan.add(unicPriceAutoCompLbl);
		
		JLabel quantityTitleLbl = new JLabel("Quantit\u00E9");
		quantityTitleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		topMidCenterPan.add(quantityTitleLbl);

		JPanel voidThirdLMR = new JPanel();
		topMidCenterPan.add(voidThirdLMR);
		
				JLabel packagingTitle = new JLabel("Contact");
				packagingTitle.setHorizontalAlignment(SwingConstants.CENTER);
				topMidCenterPan.add(packagingTitle);

		JPanel voidThirdLR = new JPanel();
		topMidCenterPan.add(voidThirdLR);

		JPanel voidFourthLL = new JPanel();
		topMidCenterPan.add(voidFourthLL);
						
								supNameTxtF = new JTextField();
								topMidCenterPan.add(supNameTxtF);
								supNameTxtF.setColumns(10);
				
						JPanel voidFourthLML = new JPanel();
						topMidCenterPan.add(voidFourthLML);
		
				contactNameTxtF = new JTextField();
				topMidCenterPan.add(contactNameTxtF);
				contactNameTxtF.setColumns(10);

		JPanel voidFourthLMR = new JPanel();
		topMidCenterPan.add(voidFourthLMR);
				
						JPanel voidFourthLR = new JPanel();
						topMidCenterPan.add(voidFourthLR);
		
				JLabel weightTitle = new JLabel("Poids");
				weightTitle.setHorizontalAlignment(SwingConstants.CENTER);
				topMidCenterPan.add(weightTitle);

		JPanel voidFifthLML = new JPanel();
		topMidCenterPan.add(voidFifthLML);
		
				JLabel unityTitle = new JLabel("Unit\u00E9");
				unityTitle.setHorizontalAlignment(SwingConstants.CENTER);
				topMidCenterPan.add(unityTitle);

		JPanel voidFifthLMR = new JPanel();
		topMidCenterPan.add(voidFifthLMR);
		
		JButton addItemToListBtn = new JButton("Ajouter");
		topMidCenterPan.add(addItemToListBtn);
		
				contactFNameTxtF = new JTextField();
				topMidCenterPan.add(contactFNameTxtF);
				contactFNameTxtF.setColumns(10);

		JPanel voidSithLML = new JPanel();
		topMidCenterPan.add(voidSithLML);
		
				contactNumberTxtF = new JTextField();
				topMidCenterPan.add(contactNumberTxtF);
				contactNumberTxtF.setColumns(10);

		JPanel voidSithLMR = new JPanel();
		topMidCenterPan.add(voidSithLMR);

		JPanel voidSithLR = new JPanel();
		topMidCenterPan.add(voidSithLR);

		JPanel voidEightLML = new JPanel();
		topMidCenterPan.add(voidEightLML);
		
		
	}
	private void controlResultPan() {
	}
	private void botCenterPan() {
		JPanel botCenterPan = new JPanel();
		botCenterPan.setPreferredSize(new Dimension(400, 260));
		centerPanPac.add(botCenterPan);
		
		JLabel productListTitle = new JLabel("Liste des Products :");
		botCenterPan.add(productListTitle);
		
		JPanel productListPan = new JPanel(new FlowLayout());
		productListPan.setBackground(Color.WHITE);
		productListPan.setBorder(new LineBorder(new Color(0, 0, 0)));
		productListPan.setPreferredSize(new Dimension(300, 200));
		botCenterPan.add(productListPan);
		
		JLabel product_1 = new JLabel("Ustensil-Fouet-G\u00F6ma-16.00\u20AC");
		productListPan.add(product_1);
		
		JButton btnProduct_1 = new JButton("X");
		productListPan.add(btnProduct_1);
		
		JPanel panel = new JPanel();
		botCenterPan.add(panel);
		
		JLabel statuLbl = new JLabel("Etat : ");
		panel.add(statuLbl);
		
		statuTxtField = new JTextField();
		panel.add(statuTxtField);
		statuTxtField.setColumns(10);
	}
	private void rightSection() {
		JPanel rightPanPro = new JPanel(new FlowLayout());
		rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightPanPro.setPreferredSize(new Dimension(400, 680));

		inContentPanePac.add(leftPanPac, BorderLayout.WEST);
		inContentPanePac.add(centerPanPac);
		inContentPanePac.add(rightPanPro, BorderLayout.EAST);
		
		JLabel lblNewLabel_3 = new JLabel("Recherche");
		rightPanPro.add(lblNewLabel_3);
		
		JPanel surchPan = new JPanel();
		surchPan.setPreferredSize(new Dimension(400, 90));
		rightPanPro.add(surchPan);
		
		textField_1 = new JTextField();
		surchPan.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Ok");
		
		surchPan.add(btnNewButton_2);
		
		bddPan = new JTabbedPane(JTabbedPane.TOP);
		bddPan.setBorder(new LineBorder(new Color(0, 0, 0)));
		rightPanPro.add(bddPan);
	}
	private void packagePage() {
		JPanel proPanPac = new JPanel();
		proPanPac.setPreferredSize(new Dimension(400, 580));
		bddPan.addTab("Fournisseur", null, proPanPac, null);
		
		/*Section Table*/
		JPanel tablePan = new JPanel();
		tablePan.setPreferredSize(new Dimension(380, 450));
		proPanPac.add(tablePan);
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
		condUniTableSP.setPreferredSize(new Dimension(380, 450) );
		
		tablePan.add(condUniTableSP);
		
		/*Buttons section*/
		JPanel btnTabblePan = new JPanel();
		proPanPac.add(btnTabblePan, BorderLayout.SOUTH);
		
		JButton btnCreatBdd = new JButton("Cr\u00E9er");
		btnTabblePan.add(btnCreatBdd);
		
		JButton btnModBdd = new JButton("Modifier");
		btnTabblePan.add(btnModBdd);
		
		JButton btnDelBdd = new JButton("Supprimer");
		btnTabblePan.add(btnDelBdd);
	}
	private void otherPage() {
		/*Page Fournisseur*/
		JPanel supPanSup = new JPanel();
		supPanSup.setPreferredSize(new Dimension(400, 500));
		bddPan.addTab("Product", null, supPanSup, null);
		

		
		/*Page Commande*/
		
		JPanel pacPanSup = new JPanel();
		pacPanSup.setPreferredSize(new Dimension(400, 500));
		bddPan.addTab("Commande", null, pacPanSup, null);
		
		/*Page Stock*/
		
		JPanel stoPanSup = new JPanel();
		stoPanSup.setPreferredSize(new Dimension(400, 500));
		bddPan.addTab("Stock", null, stoPanSup, null);
	}
}
