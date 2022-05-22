package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/*import java.awt.event.ActionEvent;*/
import javax.swing.JButton;
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

public class Contact extends JPanel{

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
	
	public Contact(){
		initialize();
	}

	private void initialize() {
	
		contentPane=this;
		/*Product Frame*/
		contFrame();


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

contPage();

otherPage();

}
/**
* Listen Button
*/

/*private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}*/
private void contFrame() {
inContentPaneSto = new JPanel();
contentPane.add(inContentPaneSto);

leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanSto.setPreferredSize(new Dimension(170, 680));

JButton addContactBtn = new JButton("<html>Ajouter <br>les informations</html>");
addContactBtn.setHorizontalAlignment(SwingConstants.LEADING);
addContactBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(addContactBtn);

JButton drainContactBtn = new JButton("<html>Vider les champs</html>");
drainContactBtn.setHorizontalAlignment(SwingConstants.LEADING);
drainContactBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(drainContactBtn);
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

JLabel userNameTitlLbl = new JLabel("Utilisateur");
topCenterPan.add(userNameTitlLbl);

JPanel voidMidLeft = new JPanel();
topCenterPan.add(voidMidLeft);

JPanel voidMidLeftMid = new JPanel();
topCenterPan.add(voidMidLeftMid);


JPanel voidMid = new JPanel();
topCenterPan.add(voidMid);

JLabel userNameTxtLbl = new JLabel("Bob");
topCenterPan.add(userNameTxtLbl);

JPanel voidBotMidLeft = new JPanel();
topCenterPan.add(voidBotMidLeft);

JPanel voidBotMidRight = new JPanel();
topCenterPan.add(voidBotMidRight);

JPanel voidBotRight = new JPanel();
topCenterPan.add(voidBotRight);

JPanel voidBotRightEnd = new JPanel();
topCenterPan.add(voidBotRightEnd);
}
private void midCenterPan() {
/*Mid of center Pan*/
JPanel middleCenterPan = new JPanel();
middleCenterPan.setPreferredSize(new Dimension(400, 565));
centerPanSto.add(middleCenterPan);

/*contactNumberTxtF = new JTextField();
topMidCenterPan.add(contactNumberTxtF);
contactNumberTxtF.setColumns(10);*/

JPanel resumeContainerPnl = new JPanel();
resumeContainerPnl.setBorder(null);
resumeContainerPnl.setPreferredSize(new Dimension(400, 345));
middleCenterPan.add(resumeContainerPnl);
resumeContainerPnl.setLayout(new GridLayout(7, 3, 5, 5));
JPanel voidLOneLeft = new JPanel();
resumeContainerPnl.add(voidLOneLeft);
JLabel contactTtlLbl = new JLabel("Contact");
contactTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(contactTtlLbl);
JPanel voidLOneRight = new JPanel();
resumeContainerPnl.add(voidLOneRight);
JLabel nameLbl = new JLabel("Nom");
nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(nameLbl);
nameTxtFld = new JTextField();
resumeContainerPnl.add(nameTxtFld);
nameTxtFld.setColumns(10);
JPanel voidLTwo = new JPanel();
resumeContainerPnl.add(voidLTwo);
JLabel firstNameTtlLbl = new JLabel("Pr\u00E9nom");
firstNameTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(firstNameTtlLbl);
firstNameTxtFld = new JTextField();
resumeContainerPnl.add(firstNameTxtFld);
firstNameTxtFld.setColumns(10);
JPanel voidLThree = new JPanel();
resumeContainerPnl.add(voidLThree);
JLabel phoneTtlLbl = new JLabel("T\u00E9l\u00E9phone");
phoneTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(phoneTtlLbl);
phoneTxtFld = new JTextField();
resumeContainerPnl.add(phoneTxtFld);
phoneTxtFld.setColumns(10);
JPanel voidLFour = new JPanel();
resumeContainerPnl.add(voidLFour);
JPanel voidLFiveLeft = new JPanel();
resumeContainerPnl.add(voidLFiveLeft);
JLabel supplierTtlLbl = new JLabel("Fournisseur");
supplierTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(supplierTtlLbl);
JPanel voidLFiveRight = new JPanel();
resumeContainerPnl.add(voidLFiveRight);
JLabel adressSupTtlLbl = new JLabel("Adresse");
adressSupTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(adressSupTtlLbl);
JTextArea adressSupTxtArea = new JTextArea();
resumeContainerPnl.add(adressSupTxtArea);
JPanel voidLSix = new JPanel();
resumeContainerPnl.add(voidLSix);
JLabel nameSupTtlLbl = new JLabel("Nom");
nameSupTtlLbl.setHorizontalAlignment(SwingConstants.CENTER);
resumeContainerPnl.add(nameSupTtlLbl);
nameSupTxtFld = new JTextField();
resumeContainerPnl.add(nameSupTxtFld);
nameSupTxtFld.setColumns(10);

addAndResultPan = new JPanel();
addAndResultPan.setPreferredSize(new Dimension(400, 200));
middleCenterPan.add(addAndResultPan);


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
private void contPage() {
JPanel proPanPac = new JPanel();
proPanPac.setPreferredSize(new Dimension(400, 580));
bddPan.addTab("<html>Contact</html>", null, proPanPac, null);

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
