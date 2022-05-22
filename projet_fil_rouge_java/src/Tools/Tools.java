package Tools;

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

public class Tools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


frame = new JFrame();
frame.setSize(1000,760);
frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
frame.setLocationRelativeTo(null);

JPanel contentPane=(JPanel)frame.getContentPane();
JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
contentPane.add(tabbedPane);

/*Product Frame*/
tabbedPane.addTab("Product", null, productPan, null);
JPanel inContentPanePro = new JPanel();
productPan.add(inContentPanePro);
/*inContentPane.setLayout(new BorderLayout());*/

JPanel leftPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
leftPanPro.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanPro.setPreferredSize(new Dimension(170, 680));
/*productPan.add(leftPan, BorderLayout.WEST);*/

JLabel lblNewLabel_1 = new JLabel("Test Titre");
leftPanPro.add(lblNewLabel_1);

JButton btnNewButton = new JButton("Création");
leftPanPro.add(btnNewButton);

JButton btnNewButton_1 = new JButton("Suppréssion");
leftPanPro.add(btnNewButton_1);




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


JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));
centerPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
centerPanPro.setPreferredSize(new Dimension(400, 680));
/*productPan.add(centerPan);*/

/*String[] data = {"one", "two", "three", "four"};
JList <String>list = new JList<String>(data);
JScrollPane scrollPane = new JScrollPane(list);
centerPan.add(scrollPane);*/

/*Top panel of center*/
JPanel topCenterPan = new JPanel();
topCenterPan.setLayout(new GridLayout(3,4,5,5));
topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
topCenterPan.setPreferredSize(new Dimension(400, 100));
centerPanPro.add(topCenterPan, BorderLayout.NORTH);

JPanel voidTopLeft = new JPanel();
topCenterPan.add(voidTopLeft);

JLabel nameProductLabel = new JLabel("Nom");
topCenterPan.add(nameProductLabel);

JLabel creationDateLabel = new JLabel("Date de Cr\u00E9ation");
topCenterPan.add(creationDateLabel);

JLabel creationUserLabel = new JLabel("Utilisateur");
topCenterPan.add(creationUserLabel);

/*@SuppressWarnings("unused")
Fil_rouge obj = new Fil_rouge();*/
String product[]= {"Product","Ustensil","Ingrédient"};
combobox = new JComboBox(product);
topCenterPan.add(combobox);

textNomField = new JTextField();
topCenterPan.add(textNomField);
textNomField.setColumns(10);

JLabel textPDateField = new JLabel("");
textPDateField.setOpaque(true);
textPDateField.setBackground(Color.WHITE);
topCenterPan.add(textPDateField);
/*textPDateField.setColumns(10);*/

JLabel textPUserField = new JLabel("");
textPUserField.setOpaque(true);
textPUserField.setBackground(Color.WHITE);
topCenterPan.add(textPUserField);
/*textPUserField.setColumns(10);*/

JPanel voidBotLeft = new JPanel();
topCenterPan.add(voidBotLeft);

JPanel voidBotMidLeft = new JPanel();
topCenterPan.add(voidBotMidLeft);

JPanel voidBotMidRight = new JPanel();
topCenterPan.add(voidBotMidRight);

JPanel voidBotRight = new JPanel();
topCenterPan.add(voidBotRight);

/*String[] data2 = {"A", "B", "C", "D"};
JList <String>list_1 = new JList<String>(data2);
JScrollPane scrollPane_1 = new JScrollPane(list_1);
panel.add(scrollPane_1);*/

/*Mid of center Pan*/
JPanel middleCenterPan = new JPanel();
middleCenterPan.setPreferredSize(new Dimension(400, 410));
centerPanPro.add(middleCenterPan);

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

JPanel addAndResultPan = new JPanel();
addAndResultPan.setPreferredSize(new Dimension(400, 110));
middleCenterPan.add(addAndResultPan);

JLabel productTitle = new JLabel("Product");
addAndResultPan.add(productTitle);

/*********************************************************/

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

/*Bot of center Pan*/
JPanel botCenterPan = new JPanel();
botCenterPan.setPreferredSize(new Dimension(400, 150));
centerPanPro.add(botCenterPan);

JLabel productListTitle = new JLabel("Liste des Products :");
botCenterPan.add(productListTitle);

JPanel productListPan = new JPanel(new FlowLayout());
productListPan.setBackground(Color.WHITE);
productListPan.setBorder(new LineBorder(new Color(0, 0, 0)));
productListPan.setPreferredSize(new Dimension(300, 120));
botCenterPan.add(productListPan);

JLabel product_1 = new JLabel("Ustensil-Fouet-G\u00F6ma-16.00\u20AC");
productListPan.add(product_1);

JButton btnProduct_1 = new JButton("X");
productListPan.add(btnProduct_1);

/*Right Section*/

JPanel rightPanPro = new JPanel(new FlowLayout());
rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.setPreferredSize(new Dimension(400, 680));

/*productPan.add(rightPan, BorderLayout.EAST);*/
inContentPanePro.add(leftPanPro, BorderLayout.WEST);
inContentPanePro.add(centerPanPro);
inContentPanePro.add(rightPanPro, BorderLayout.EAST);

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

JTabbedPane bddPan = new JTabbedPane(JTabbedPane.TOP);
bddPan.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.add(bddPan);



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
/*Page Product*/		

JPanel ProPanPro = new JPanel();
ProPanPro.setPreferredSize(new Dimension(400, 580));
bddPan.addTab("Product", null, ProPanPro, null);

/*Section Table*/
JPanel tablePan = new JPanel();
tablePan.setPreferredSize(new Dimension(380, 450));
ProPanPro.add(tablePan);
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
ProPanPro.add(btnTabblePan, BorderLayout.SOUTH);

JButton btnCreatBdd = new JButton("Cr\u00E9er");
btnTabblePan.add(btnCreatBdd);

JButton btnModBdd = new JButton("Modifier");
btnTabblePan.add(btnModBdd);

JButton btnDelBdd = new JButton("Supprimer");
btnTabblePan.add(btnDelBdd);

/*Page Fournisseur*/
JPanel supPanPro = new JPanel();
supPanPro.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("Fournisseur", null, supPanPro, null);

/*JPanel tablePan_1 = new JPanel();
supPanPro.add(tablePan_1);

table = new JTable(22, 5);
tablePan_1.add(table);

JPanel btnTabblePan_1 = new JPanel();
supPanPro.add(btnTabblePan_1);

JButton btnCreatBdd_1 = new JButton("Cr\u00E9er");
btnTabblePan_1.add(btnCreatBdd_1);

JButton btnModBdd_1 = new JButton("Modifier");
btnTabblePan_1.add(btnModBdd_1);

JButton btnDelBdd_1 = new JButton("Supprimer");
btnTabblePan_1.add(btnDelBdd_1);*/

/*Page Commande*/

JPanel pacPanPro = new JPanel();
pacPanPro.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("Commande", null, pacPanPro, null);

/*Page Stock*/

JPanel stoPanPro = new JPanel();
stoPanPro.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("Stock", null, stoPanPro, null);
}
/**
* Listen Button
*/

private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}