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
frame.setSize(1000,600);
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
leftPanPro.setPreferredSize(new Dimension(170, 525));
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
btnNewButtonTest.addActionListener(this::btnTestListener);


JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));
centerPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
centerPanPro.setPreferredSize(new Dimension(400, 525));
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
middleCenterPan.setPreferredSize(new Dimension(400, 260));
centerPanPro.add(middleCenterPan);

JPanel topMidCenterPan = new JPanel();
topMidCenterPan.setLayout(new GridLayout(3,5));
topMidCenterPan.setPreferredSize(new Dimension(400, 130));
middleCenterPan.add(topMidCenterPan);

JPanel voidSupTopLeft = new JPanel();
topMidCenterPan.add(voidSupTopLeft);

JPanel voidSupTopMidLeft = new JPanel();
topMidCenterPan.add(voidSupTopMidLeft);

JLabel supplierTitle = new JLabel("Fournisseur");
supplierTitle.setHorizontalAlignment(SwingConstants.CENTER);
topMidCenterPan.add(supplierTitle);

JPanel voidSupTopMidRight = new JPanel();
topMidCenterPan.add(voidSupTopMidRight);

JPanel voidSupTopRight = new JPanel();
topMidCenterPan.add(voidSupTopRight);

JPanel voidSupMidLeft = new JPanel();
topMidCenterPan.add(voidSupMidLeft);

JPanel voidSupMidMidLeft = new JPanel();
topMidCenterPan.add(voidSupMidMidLeft);

JLabel brandTitle = new JLabel("Marque");
brandTitle.setHorizontalAlignment(SwingConstants.CENTER);
topMidCenterPan.add(brandTitle);

JPanel voidSupMidMidRight = new JPanel();
topMidCenterPan.add(voidSupMidMidRight);

JLabel articlePriceTitle = new JLabel("Prix Unitaire");
articlePriceTitle.setHorizontalAlignment(SwingConstants.CENTER);
topMidCenterPan.add(articlePriceTitle);

JComboBox comboBox = new JComboBox();
topMidCenterPan.add(comboBox);

JPanel voidSupBotMidLeft = new JPanel();
topMidCenterPan.add(voidSupBotMidLeft);

textField_2 = new JTextField();
topMidCenterPan.add(textField_2);
textField_2.setColumns(10);

JPanel voidSupBotMidRight = new JPanel();
topMidCenterPan.add(voidSupBotMidRight);

textField_3 = new JTextField();
topMidCenterPan.add(textField_3);
textField_3.setColumns(10);

JPanel addAndResultPan = new JPanel();
addAndResultPan.setPreferredSize(new Dimension(400, 130));
middleCenterPan.add(addAndResultPan);

addAndResultPan.add(btnNewButtonTest);

JPanel controlResultPan = new JPanel(new GridLayout(3,1));
controlResultPan.setPreferredSize(new Dimension(300, 80));
addAndResultPan.add(controlResultPan);

JLabel lblNewLabel = new JLabel("Le product a \u00E9t\u00E9 ajout\u00E9 \u00E0 la liste");
lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel.setOpaque(true);
lblNewLabel.setBackground(Color.GREEN);
controlResultPan.add(lblNewLabel);

JLabel lblNewLabel_6 = new JLabel("Le product existe d\u00E9j\u00E0");
lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_6.setOpaque(true);
lblNewLabel_6.setBackground(Color.ORANGE);
controlResultPan.add(lblNewLabel_6);

JLabel lblNewLabel_7 = new JLabel("Le product n'est pas conforme");
lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
lblNewLabel_7.setOpaque(true);
lblNewLabel_7.setBackground(Color.RED);
controlResultPan.add(lblNewLabel_7);

/*Bot of center Pan*/
JPanel botCenterPan = new JPanel();
botCenterPan.setPreferredSize(new Dimension(400, 150));
centerPanPro.add(botCenterPan);

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

/*Right Section*/

JPanel rightPanPro = new JPanel(new FlowLayout());
rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.setPreferredSize(new Dimension(400, 525));

/*productPan.add(rightPan, BorderLayout.EAST);*/
inContentPanePro.add(leftPanPro, BorderLayout.WEST);
inContentPanePro.add(centerPanPro);
inContentPanePro.add(rightPanPro, BorderLayout.EAST);

JLabel lblNewLabel_3 = new JLabel("Recherche");
rightPanPro.add(lblNewLabel_3);

JPanel surchPan = new JPanel();
surchPan.setPreferredSize(new Dimension(400, 50));
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
ProPanPro.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("Product", null, ProPanPro, null);

/*Section Table*/
JPanel tablePan = new JPanel();
tablePan.setPreferredSize(new Dimension(380, 350));
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
condUniTableSP.setPreferredSize(new Dimension(380, 350) );

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