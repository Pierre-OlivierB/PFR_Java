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

public class Supplier extends JPanel{

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
	private JPanel inContentPaneSup;
	private JPanel leftPanPro;
	private JPanel centerPanSup = new JPanel(new FlowLayout(FlowLayout.CENTER));
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
	

	public Supplier() {
		initialize();
		
	}
	
	private void initialize() {
		
	contentPane=this;
	/*Product Frame*/
	supplierFrame();

	
	/*Référence sur methode. Possible que si methode utilisée*/
	btnNewButtonTest.addActionListener(this::btnTestListener);
	
	
	/*JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));*/
	centerPanSup.setBorder(new LineBorder(new Color(0, 0, 0)));
	centerPanSup.setPreferredSize(new Dimension(400, 680));
	
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
	
	supplierPage();
	
	otherPage();

}
/**
 * Listen Button
 */

private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}
private void supplierFrame() {
	/*tabbedPane.addTab("Product", null, productPan, null);*/
	inContentPaneSup = new JPanel();
	contentPane.add(inContentPaneSup);
	
	leftPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
	leftPanPro.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	leftPanPro.setPreferredSize(new Dimension(170, 680));
	
	JButton btnNewButton = new JButton("Ajouter le fournisseur");
	leftPanPro.add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Vider les champs");
	leftPanPro.add(btnNewButton_1);
}
	
private void topPanelCenter() {
	JPanel topCenterPan = new JPanel();
	topCenterPan.setLayout(new GridLayout(3,4,5,5));
	topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	topCenterPan.setPreferredSize(new Dimension(400, 100));
	centerPanSup.add(topCenterPan, BorderLayout.NORTH);
	
	JPanel voidTopLeft = new JPanel();
	topCenterPan.add(voidTopLeft);
	
	JLabel nameProductLabel = new JLabel("Nom");
	topCenterPan.add(nameProductLabel);
	
	JLabel creationDateLabel = new JLabel("Date de Cr\u00E9ation");
	topCenterPan.add(creationDateLabel);
	
	JLabel creationUserLabel = new JLabel("Utilisateur");
	topCenterPan.add(creationUserLabel);
	
	JPanel voidMidLeft = new JPanel();
	topCenterPan.add(voidMidLeft);
	
	textNomField = new JTextField();
	topCenterPan.add(textNomField);
	textNomField.setColumns(10);
	
	JLabel textPDateField = new JLabel("");
	textPDateField.setOpaque(true);
	textPDateField.setBackground(Color.WHITE);
	topCenterPan.add(textPDateField);
	
	JLabel textPUserField = new JLabel("");
	textPUserField.setOpaque(true);
	textPUserField.setBackground(Color.WHITE);
	topCenterPan.add(textPUserField);
	
	JPanel voidBotLeft = new JPanel();
	topCenterPan.add(voidBotLeft);
	
	JPanel voidBotMidLeft = new JPanel();
	topCenterPan.add(voidBotMidLeft);
	
	JPanel voidBotMidRight = new JPanel();
	topCenterPan.add(voidBotMidRight);
	
	JPanel voidBotRight = new JPanel();
	topCenterPan.add(voidBotRight);
}
private void midCenterPan() {
	/*Mid of center Pan*/
	JPanel middleCenterPan = new JPanel();
	middleCenterPan.setPreferredSize(new Dimension(400, 410));
	centerPanSup.add(middleCenterPan);

	JPanel topMidCenterPan = new JPanel();
	topMidCenterPan.setLayout(new GridLayout(7,5));
	topMidCenterPan.setPreferredSize(new Dimension(400, 290));
	middleCenterPan.add(topMidCenterPan);

	JPanel voidSupTopLeft = new JPanel();
	topMidCenterPan.add(voidSupTopLeft);

	JPanel voidSupTopMidLeft = new JPanel();
	topMidCenterPan.add(voidSupTopMidLeft);
	/*********************************************************/

	JLabel supplierTitle = new JLabel("Fournisseur");
	supplierTitle.setHorizontalAlignment(SwingConstants.CENTER);
	topMidCenterPan.add(supplierTitle);


	JPanel voidSupTopMidRight = new JPanel();
	topMidCenterPan.add(voidSupTopMidRight);

	JPanel voidSupTopRight = new JPanel();
	topMidCenterPan.add(voidSupTopRight);

	JLabel adressTitle = new JLabel("Adresse");
	topMidCenterPan.add(adressTitle);
	adressTitle.setHorizontalAlignment(SwingConstants.CENTER);

	JPanel voidSupMidLeft = new JPanel();
	topMidCenterPan.add(voidSupMidLeft);

	adressTxtF = new JTextField();
	topMidCenterPan.add(adressTxtF);
	adressTxtF.setColumns(10);		

	JPanel voidSupMidMidRight = new JPanel();
	topMidCenterPan.add(voidSupMidMidRight);

	JPanel voidSecondLR = new JPanel();
	topMidCenterPan.add(voidSecondLR);

	JLabel supplierNameTitle = new JLabel("Nom");
	topMidCenterPan.add(supplierNameTitle);
	supplierNameTitle.setHorizontalAlignment(SwingConstants.CENTER);

	JPanel voidSupBotMidRight = new JPanel();
	topMidCenterPan.add(voidSupBotMidRight);

	supNameTxtF = new JTextField();
	topMidCenterPan.add(supNameTxtF);
	supNameTxtF.setColumns(10);

	JPanel voidThirdLMR = new JPanel();
	topMidCenterPan.add(voidThirdLMR);

	JPanel voidThirdLR = new JPanel();
	topMidCenterPan.add(voidThirdLR);

	JPanel voidFourthLL = new JPanel();
	topMidCenterPan.add(voidFourthLL);

	JPanel voidFourthLML = new JPanel();
	topMidCenterPan.add(voidFourthLML);

	JLabel contactTitle = new JLabel("Contact");
	contactTitle.setHorizontalAlignment(SwingConstants.CENTER);
	topMidCenterPan.add(contactTitle);

	JPanel voidFourthLMR = new JPanel();
	topMidCenterPan.add(voidFourthLMR);

	JPanel voidFourthLR = new JPanel();
	topMidCenterPan.add(voidFourthLR);

	JLabel lastNameTitle = new JLabel("Nom");
	lastNameTitle.setHorizontalAlignment(SwingConstants.CENTER);
	topMidCenterPan.add(lastNameTitle);

	JPanel voidFifthLML = new JPanel();
	topMidCenterPan.add(voidFifthLML);

	contactNameTxtF = new JTextField();
	topMidCenterPan.add(contactNameTxtF);
	contactNameTxtF.setColumns(10);

	JPanel voidFifthLMR = new JPanel();
	topMidCenterPan.add(voidFifthLMR);

	JPanel voidFifthLR = new JPanel();
	topMidCenterPan.add(voidFifthLR);

	JLabel firstNameTitle = new JLabel("Pr\u00E9nom");
	firstNameTitle.setHorizontalAlignment(SwingConstants.CENTER);
	topMidCenterPan.add(firstNameTitle);

	JPanel voidSithLML = new JPanel();
	topMidCenterPan.add(voidSithLML);

	contactFNameTxtF = new JTextField();
	topMidCenterPan.add(contactFNameTxtF);
	contactFNameTxtF.setColumns(10);

	JPanel voidSithLMR = new JPanel();
	topMidCenterPan.add(voidSithLMR);

	JPanel voidSithLR = new JPanel();
	topMidCenterPan.add(voidSithLR);

	JLabel phoneNumLbl = new JLabel("T\u00E9l\u00E9phone");
	phoneNumLbl.setHorizontalAlignment(SwingConstants.CENTER);
	topMidCenterPan.add(phoneNumLbl);

	JPanel voidEightLML = new JPanel();
	topMidCenterPan.add(voidEightLML);

	contactNumberTxtF = new JTextField();
	topMidCenterPan.add(contactNumberTxtF);
	contactNumberTxtF.setColumns(10);

	addAndResultPan = new JPanel();
	addAndResultPan.setPreferredSize(new Dimension(400, 110));
	middleCenterPan.add(addAndResultPan);

	JLabel productTitle = new JLabel("Product");
	addAndResultPan.add(productTitle);
	
	
}
private void controlResultPan() {
	JPanel controlResultPan = new JPanel(new GridLayout(2,4));
	controlResultPan.setPreferredSize(new Dimension(400, 50));
	addAndResultPan.add(controlResultPan);

	JPanel voidProductPanel = new JPanel();
	controlResultPan.add(voidProductPanel);

	JLabel nameLbl = new JLabel("Nom");
	controlResultPan.add(nameLbl);

	JLabel brandLbl = new JLabel("Marque");
	controlResultPan.add(brandLbl);

	JLabel priceLbl = new JLabel("Prix Unitaire");
	controlResultPan.add(priceLbl);

	JComboBox comboBox = new JComboBox();
	controlResultPan.add(comboBox);

	pNameTextField = new JTextField();
	controlResultPan.add(pNameTextField);
	pNameTextField.setColumns(10);

	pBrandTextField = new JTextField();
	controlResultPan.add(pBrandTextField);
	pBrandTextField.setColumns(10);

	pPriceTextField = new JTextField();
	controlResultPan.add(pPriceTextField);
	pPriceTextField.setColumns(10);
	btnNewButtonTest.addActionListener(this::btnTestListener);

			addAndResultPan.add(btnNewButtonTest);
}
private void botCenterPan() {
	JPanel botCenterPan = new JPanel();
	botCenterPan.setPreferredSize(new Dimension(400, 150));
	centerPanSup.add(botCenterPan);
	
	JLabel productListTitle = new JLabel("Liste des Products :");
	botCenterPan.add(productListTitle);
	
	JPanel productListPan = new JPanel(new FlowLayout());
	productListPan.setBackground(Color.WHITE);
	productListPan.setBorder(new LineBorder(new Color(0, 0, 0)));
	productListPan.setPreferredSize(new Dimension(300, 100));
	botCenterPan.add(productListPan);
	
	JLabel product_1 = new JLabel("Ustensil-Fouet-G\u00F6ma-16.00\u20AC");
	productListPan.add(product_1);
	
	JButton btnProduct_1 = new JButton("X");
	productListPan.add(btnProduct_1);
}
private void rightSection() {
	JPanel rightPanPro = new JPanel(new FlowLayout());
	rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
	rightPanPro.setPreferredSize(new Dimension(400, 680));

	inContentPaneSup.add(leftPanPro, BorderLayout.WEST);
	inContentPaneSup.add(centerPanSup);
	inContentPaneSup.add(rightPanPro, BorderLayout.EAST);
	
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
private void supplierPage() {
	JPanel proPanSup = new JPanel();
	proPanSup.setPreferredSize(new Dimension(400, 580));
	bddPan.addTab("Fournisseur", null, proPanSup, null);
	
	/*Section Table*/
	JPanel tablePan = new JPanel();
	tablePan.setPreferredSize(new Dimension(380, 450));
	proPanSup.add(tablePan);
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
	proPanSup.add(btnTabblePan, BorderLayout.SOUTH);
	
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