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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class User extends JPanel{

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
	private JTextField numberCmdTxtFld;
	private JTextField qttTxtFld;
	private JTextField statuTxtFld;
	private JTextField nameTxtFld;
	private JTextField firstNameTxtFld;
	private JTextField phoneTxtFld;
	private JTextField nameSupTxtFld;
	private JTextField textField_4;
	private JTextField mdpTxtFld;
	private JTextField surchTxtFld;
	public User(){
		initialize();
	}

	private void initialize() {
	
		contentPane=this;
		/*Product Frame*/
		userFrame();


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

userPage();

otherPage();

}
/**
* Listen Button
*/

/*private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}*/
private void userFrame() {
inContentPaneSto = new JPanel();
contentPane.add(inContentPaneSto);

leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 75));
leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanSto.setPreferredSize(new Dimension(170, 680));

JLabel leftPanTitlelbl = new JLabel("<html>Action sur <br>le champ <br>Utilisateur</html>");
leftPanTitlelbl.setBackground(Color.WHITE);
leftPanTitlelbl.setPreferredSize(new Dimension(110,80));
leftPanSto.add(leftPanTitlelbl);

JButton addUserBtn = new JButton("<html>Ajouter <br>l'utilisateur</html>");
addUserBtn.setHorizontalAlignment(SwingConstants.LEADING);
addUserBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(addUserBtn);
JLabel secondLeftPanTtlLbl = new JLabel("<html>Action sur <br>le role</html>");
leftPanSto.add(secondLeftPanTtlLbl);
JButton addRoleBtn = new JButton("Ajouter le Role");
leftPanSto.add(addRoleBtn);

JButton drainUserBtn = new JButton("<html>Vider les champs</html>");
drainUserBtn.setHorizontalAlignment(SwingConstants.LEADING);
drainUserBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(drainUserBtn);
}

private void topPanelCenter() {
JPanel topCenterPan = new JPanel();
topCenterPan.setLayout(new GridLayout(3,4,5,5));
topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
topCenterPan.setPreferredSize(new Dimension(400, 100));
centerPanSto.add(topCenterPan, BorderLayout.NORTH);

JLabel loginUserTtlLbl = new JLabel("Login");
loginUserTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
topCenterPan.add(loginUserTtlLbl);

JPanel voidTopLeft = new JPanel();
topCenterPan.add(voidTopLeft);
JLabel mdpTtlLbl = new JLabel("Mot de Passe");
topCenterPan.add(mdpTtlLbl);

JPanel voidMidTop = new JPanel();
topCenterPan.add(voidMidTop);

JPanel voidTopRight = new JPanel();
topCenterPan.add(voidTopRight);

numberCmdTxtFld = new JTextField();
topCenterPan.add(numberCmdTxtFld);
numberCmdTxtFld.setColumns(10);

JPanel voidMidLeft = new JPanel();
topCenterPan.add(voidMidLeft);
mdpTxtFld = new JTextField();
topCenterPan.add(mdpTxtFld);
mdpTxtFld.setColumns(10);

JPanel voidLeftMid = new JPanel();
topCenterPan.add(voidLeftMid);
JComboBox roleUpComboB = new JComboBox();
topCenterPan.add(roleUpComboB);

JPanel voidRightMid = new JPanel();
topCenterPan.add(voidRightMid);

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
middleCenterPan.setPreferredSize(new Dimension(400, 565));
centerPanSto.add(middleCenterPan);

addAndResultPan = new JPanel();
addAndResultPan.setPreferredSize(new Dimension(400, 230));
middleCenterPan.add(addAndResultPan);
JPanel rolPan = new JPanel();
rolPan.setBackground(Color.LIGHT_GRAY);
rolPan.setPreferredSize(new Dimension(400, 100));
middleCenterPan.add(rolPan);
JLabel roleTtlLbl = new JLabel("Role");
roleTtlLbl.setPreferredSize(new Dimension(350, 20));
roleTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
rolPan.add(roleTtlLbl);
textField_4 = new JTextField();
textField_4.setPreferredSize(new Dimension(250, 20));
rolPan.add(textField_4);
textField_4.setColumns(10);
JPanel descriptionPan = new JPanel();
descriptionPan.setPreferredSize(new Dimension(380, 150));
middleCenterPan.add(descriptionPan);
JLabel descrTtlLbl = new JLabel("Description (150 caract\u00E8res) :");
descrTtlLbl.setPreferredSize(new Dimension(370, 20));
descriptionPan.add(descrTtlLbl);
JTextArea descRoleTxtArea = new JTextArea();
descRoleTxtArea.setPreferredSize(new Dimension(300, 100));
descRoleTxtArea.setTabSize(10);
descriptionPan.add(descRoleTxtArea);


}
private void controlResultPan() {
}

private void rightSection() {
JPanel rightPanPro = new JPanel(new FlowLayout());
rightPanPro.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.setPreferredSize(new Dimension(400, 680));

inContentPaneSto.add(leftPanSto, BorderLayout.WEST);
inContentPaneSto.add(centerPanSto);
inContentPaneSto.add(rightPanPro, BorderLayout.EAST);

JLabel surchTtlLbl = new JLabel("Recherche");
rightPanPro.add(surchTtlLbl);

JPanel surchPan = new JPanel();
surchPan.setPreferredSize(new Dimension(400, 90));
rightPanPro.add(surchPan);

surchTxtFld = new JTextField();
surchPan.add(surchTxtFld);
surchTxtFld.setColumns(10);

JButton surchOkBtn = new JButton("Ok");

surchPan.add(surchOkBtn);

bddPan = new JTabbedPane(JTabbedPane.TOP);
bddPan.setBorder(new LineBorder(new Color(0, 0, 0)));
rightPanPro.add(bddPan);
}
private void userPage() {
JPanel proPanPac = new JPanel();
proPanPac.setPreferredSize(new Dimension(400, 580));
bddPan.addTab("<html>Utilisateur</html>", null, proPanPac, null);

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
bddPan.addTab("<html>Package/<br> Product</html>", null, pacPanSup, null);

/*Page Stock*/

JPanel stoPanSup = new JPanel();
stoPanSup.setPreferredSize(new Dimension(400, 500));
bddPan.addTab("<html>Utilisateur</html>", null, stoPanSup, null);
}

}
	
