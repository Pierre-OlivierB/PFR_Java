package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/*import java.awt.event.ActionEvent;*/

import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class PackageAndProduct extends JPanel{

	private static final long serialVersionUID = -4610886238798936616L;
	/*private JButton btnNewButtonTest = new JButton("Cliquez-moi");*/
	/*private JPanel supplierPan = new JPanel();*/
	private JTable condUniTable;
	private JTextField textField_1;
	private JPanel contentPane;
	private JPanel inContentPaneSto;
	/*private JTabbedPane tabbedPane;*/
	private JPanel leftPanSto;
	private JPanel centerPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JTabbedPane bddPan;
	private JPanel addAndResultPan;
	private JTextField proNameTxtFld;
	private JPanel middleCenterPan;
	private JTextField pacTypTxtFld;
	private JTextField weightTxtFld;
	private JTextField unityNameTxtFld;
	
	public PackageAndProduct(){
		initialize();
	}

	private void initialize() {
	
		contentPane=this;
		/*Product Frame*/
		pacProFrame();


/*JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));*/
centerPanSto.setBorder(new LineBorder(new Color(0, 0, 0)));
centerPanSto.setPreferredSize(new Dimension(400, 680));

/*Top panel of center*/
topPanelCenter();

/*Mid of center Pan*/
midCenterPan();
controlResultPan();

/*Right Section*/

rightSection();

/*Côté bdd*/
/*Page Product*/		

pacProPage();

otherPage();

}
/**
* Listen Button
*/

/*private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}*/
private void pacProFrame() {
inContentPaneSto = new JPanel();
contentPane.add(inContentPaneSto);

leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanSto.setPreferredSize(new Dimension(170, 680));

JLabel leftPanTitlelbl = new JLabel("<html>Action sur <br>la liste <br>des packaging</html>");
leftPanTitlelbl.setBackground(Color.WHITE);
leftPanTitlelbl.setPreferredSize(new Dimension(110,80));
leftPanSto.add(leftPanTitlelbl);

JButton addOrderBtn = new JButton("<html>Ajouter <br>la liste<br> des liens</html>");
addOrderBtn.setHorizontalAlignment(SwingConstants.LEADING);
addOrderBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(addOrderBtn);

JButton drainOrderBtn = new JButton("<html>Vider les champs</html>");
drainOrderBtn.setHorizontalAlignment(SwingConstants.LEADING);
drainOrderBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(drainOrderBtn);
}

private void topPanelCenter() {
JPanel topCenterPan = new JPanel();
topCenterPan.setLayout(new GridLayout(3,4,5,5));
topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
topCenterPan.setPreferredSize(new Dimension(400, 100));
centerPanSto.add(topCenterPan, BorderLayout.NORTH);
JPanel voidTopLeft = new JPanel();
topCenterPan.add(voidTopLeft);

JPanel voidTopMidLeft = new JPanel();
topCenterPan.add(voidTopMidLeft);

JPanel voidMidTop = new JPanel();
topCenterPan.add(voidMidTop);
JLabel prodNameTitlLbl = new JLabel("Nom");
prodNameTitlLbl.setHorizontalAlignment(SwingConstants.CENTER);
topCenterPan.add(prodNameTitlLbl);
JPanel voidTopRight = new JPanel();
topCenterPan.add(voidTopRight);

JPanel voidMidLeft = new JPanel();
topCenterPan.add(voidMidLeft);
JComboBox comboBox = new JComboBox();
topCenterPan.add(comboBox);

JPanel voidCenterMid = new JPanel();
topCenterPan.add(voidCenterMid);
proNameTxtFld = new JTextField();
topCenterPan.add(proNameTxtFld);
proNameTxtFld.setColumns(10);

JPanel voidRightMid = new JPanel();
topCenterPan.add(voidRightMid);

JPanel voidBotLeft = new JPanel();
topCenterPan.add(voidBotLeft);

JPanel voidBotMidLeft = new JPanel();
topCenterPan.add(voidBotMidLeft);

JPanel voidBotCenter = new JPanel();
topCenterPan.add(voidBotCenter);
JPanel voidBotMidRight = new JPanel();
topCenterPan.add(voidBotMidRight);
}
private void midCenterPan() {
/*Mid of center Pan*/
middleCenterPan = new JPanel();
middleCenterPan.setPreferredSize(new Dimension(400, 330));
centerPanSto.add(middleCenterPan);

addAndResultPan = new JPanel();
addAndResultPan.setPreferredSize(new Dimension(400, 265));
JPanel botCenterPan = new JPanel();
centerPanSto.add(botCenterPan);
JPanel resumeContainerPnl_1 = new JPanel();
resumeContainerPnl_1.setPreferredSize(new Dimension(350, 220));
resumeContainerPnl_1.setBorder(new LineBorder(new Color(0, 0, 0)));
resumeContainerPnl_1.setBackground(Color.WHITE);
botCenterPan.add(resumeContainerPnl_1);
JLabel testResultPnl_1 = new JLabel("Ustensil - Fouet - G\u00F6ma - sachet de 2 - 164.00 g");
resumeContainerPnl_1.add(testResultPnl_1);
JButton btnNewButton = new JButton("X");
resumeContainerPnl_1.add(btnNewButton);


}
private void controlResultPan() {
GridLayout gl_modifPartPan = new GridLayout(6,3);
gl_modifPartPan.setVgap(10);
gl_modifPartPan.setHgap(10);
JPanel modifPartPan = new JPanel(gl_modifPartPan);
modifPartPan.setPreferredSize(new Dimension(400, 280));
middleCenterPan.add(modifPartPan);
JPanel panel_2 = new JPanel();
modifPartPan.add(panel_2);
JLabel pacTypTitlLbl = new JLabel("Type de packaging :");
pacTypTitlLbl.setHorizontalAlignment(SwingConstants.CENTER);
modifPartPan.add(pacTypTitlLbl);
JPanel panel_1 = new JPanel();
modifPartPan.add(panel_1);
JPanel panel_3 = new JPanel();
modifPartPan.add(panel_3);
pacTypTxtFld = new JTextField();
modifPartPan.add(pacTypTxtFld);
pacTypTxtFld.setColumns(10);
JPanel panel_4 = new JPanel();
modifPartPan.add(panel_4);
JPanel panel_9 = new JPanel();
modifPartPan.add(panel_9);
JLabel unityNameTitlLbl = new JLabel("Nom de l'unit\u00E9 :");
unityNameTitlLbl.setHorizontalAlignment(SwingConstants.CENTER);
modifPartPan.add(unityNameTitlLbl);
JPanel panel = new JPanel();
modifPartPan.add(panel);
JPanel panel_5 = new JPanel();
modifPartPan.add(panel_5);
unityNameTxtFld = new JTextField();
modifPartPan.add(unityNameTxtFld);
unityNameTxtFld.setColumns(10);
JPanel panel_6 = new JPanel();
modifPartPan.add(panel_6);
JPanel panel_10 = new JPanel();
modifPartPan.add(panel_10);
JLabel weightTitlLbl = new JLabel("Poids :");
weightTitlLbl.setHorizontalAlignment(SwingConstants.CENTER);
modifPartPan.add(weightTitlLbl);
JPanel panel_7 = new JPanel();
modifPartPan.add(panel_7);
JPanel panel_8 = new JPanel();
modifPartPan.add(panel_8);
weightTxtFld = new JTextField();
modifPartPan.add(weightTxtFld);
weightTxtFld.setColumns(10);
JButton addListBtn = new JButton("Ajouter");
middleCenterPan.add(addListBtn);
}

private void rightSection() {
JPanel rightPanPro = new JPanel(new FlowLayout());
rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.setPreferredSize(new Dimension(400, 680));

inContentPaneSto.add(leftPanSto, BorderLayout.WEST);
inContentPaneSto.add(centerPanSto);
inContentPaneSto.add(rightPanPro, BorderLayout.EAST);

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
private void pacProPage() {
JPanel proPanPac = new JPanel();
proPanPac.setPreferredSize(new Dimension(400, 580));
bddPan.addTab("<html>Package/<br> Product</html>", null, proPanPac, null);

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
bddPan.addTab("<html>Condition/<br> Unité</html>", null, supPanSup, null);



/*Page Commande*/

JPanel pacPanSup = new JPanel();
pacPanSup.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("<html>Contact</html>", null, pacPanSup, null);

/*Page Stock*/

JPanel stoPanSup = new JPanel();
stoPanSup.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("<html>Utilisateur</html>", null, stoPanSup, null);
}


	}
