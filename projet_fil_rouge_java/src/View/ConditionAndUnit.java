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

public class ConditionAndUnit extends JPanel{

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
	/*private JPanel addAndResultPan;
	private JTextField numberCmdTxtFld;
	private JTextField qttTxtFld;
	private JTextField statuTxtFld;*/
	private JTextField pacTypeTxtFld;
	private JTextField unitNameTxtFld;
	
	public ConditionAndUnit(){
		initialize();
	}

	private void initialize() {
	
		contentPane=this;
		/*Product Frame*/
		condUnitFrame();


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

condUnitPage();

otherPage();

}
/**
* Listen Button
*/

/*private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}*/
private void condUnitFrame() {
inContentPaneSto = new JPanel();
contentPane.add(inContentPaneSto);

leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanSto.setPreferredSize(new Dimension(170, 680));

JLabel leftPanTitlelbl = new JLabel("<html>Action sur <br>les parties <br>Packaging et <br> Unit\u00E9</html>");
leftPanTitlelbl.setBackground(Color.WHITE);
leftPanTitlelbl.setPreferredSize(new Dimension(110,80));
leftPanSto.add(leftPanTitlelbl);

JButton addPacBtn = new JButton("<html>Ajouter <br>la commande<br> au  stock</html>");
addPacBtn.setHorizontalAlignment(SwingConstants.LEADING);
addPacBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(addPacBtn);
JButton addUnitBtn = new JButton("<html>Ajouter l'unit\u00E9</html>");
leftPanSto.add(addUnitBtn);

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
JLabel pacTypeLbl = new JLabel("Type de Packaging");
pacTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
topCenterPan.add(pacTypeLbl);

JPanel voidTopRight = new JPanel();
topCenterPan.add(voidTopRight);

JPanel voidMidLeft = new JPanel();
topCenterPan.add(voidMidLeft);

pacTypeTxtFld = new JTextField();
topCenterPan.add(pacTypeTxtFld);
pacTypeTxtFld.setColumns(10);

JPanel voidMidRight = new JPanel();
topCenterPan.add(voidMidRight);

JPanel voidBotMidRight = new JPanel();
topCenterPan.add(voidBotMidRight);
JLabel pacAlrdExistLbl = new JLabel("Le packaging existe d\u00E9j\u00E0");
pacAlrdExistLbl.setHorizontalAlignment(SwingConstants.CENTER);
topCenterPan.add(pacAlrdExistLbl);

JPanel voidBotRight = new JPanel();
topCenterPan.add(voidBotRight);
}
private void midCenterPan() {
/*Mid of center Pan*/
JPanel middleCenterPan = new JPanel();
middleCenterPan.setPreferredSize(new Dimension(400, 215));
centerPanSto.add(middleCenterPan);

JLabel resumeTitleLbl = new JLabel("Description (150caract\u00E8res) :");
middleCenterPan.add(resumeTitleLbl);
JTextArea descPacTxtArea = new JTextArea();
descPacTxtArea.setPreferredSize(new Dimension(300, 100));
middleCenterPan.add(descPacTxtArea);
JPanel botCenterPan = new JPanel();
botCenterPan.setPreferredSize(new Dimension(400, 100));
botCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
centerPanSto.add(botCenterPan);
botCenterPan.setLayout(new GridLayout(3, 4, 5, 5));
JPanel voidTopLeft_1 = new JPanel();
botCenterPan.add(voidTopLeft_1);
JLabel unitNameLbl = new JLabel("Nom de l'Unit\u00E9");
unitNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
botCenterPan.add(unitNameLbl);
JPanel voidTopRight_1 = new JPanel();
botCenterPan.add(voidTopRight_1);
JPanel voidMidLeft_1 = new JPanel();
botCenterPan.add(voidMidLeft_1);
unitNameTxtFld = new JTextField();
unitNameTxtFld.setColumns(10);
botCenterPan.add(unitNameTxtFld);
JPanel voidMidRight_1 = new JPanel();
botCenterPan.add(voidMidRight_1);
JPanel voidBotMidRight_1 = new JPanel();
botCenterPan.add(voidBotMidRight_1);
JLabel unitAlrdExistLbl = new JLabel("L'unit\u00E9 existe d\u00E9j\u00E0");
unitAlrdExistLbl.setHorizontalAlignment(SwingConstants.CENTER);
botCenterPan.add(unitAlrdExistLbl);
JPanel voidBotRight_1 = new JPanel();
botCenterPan.add(voidBotRight_1);


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
private void condUnitPage() {
JPanel proPanPac = new JPanel();
proPanPac.setPreferredSize(new Dimension(400, 580));
bddPan.addTab("<html>Condition/<br> Unité</html>", null, proPanPac, null);

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
bddPan.addTab("<html>Package/<br> Product</html>", null, supPanSup, null);



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
