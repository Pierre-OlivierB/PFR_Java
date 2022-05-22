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

public class Stock extends JPanel{
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
	private JTextField textField_2;
	private JTextField textField_3;
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
	
	
	

	public Stock() {
		initialize();
		
	}
	
	private void initialize() {
		
	contentPane=this;
	/*Product Frame*/
	stockFrame();
	
	
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
	
	stockPage();
	
	otherPage();

}
/**
 * Listen Button
 */

private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}
private void stockFrame() {
	inContentPaneSto = new JPanel();
	contentPane.add(inContentPaneSto);
	
	leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
	leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	leftPanSto.setPreferredSize(new Dimension(170, 680));
	
	JLabel leftPanTitlelbl = new JLabel("<html>Action sur <br>le r\u00E9capituliatif <br>de la commande</html>");
	leftPanTitlelbl.setBackground(Color.WHITE);
	leftPanTitlelbl.setPreferredSize(new Dimension(110,80));
	leftPanSto.add(leftPanTitlelbl);
	
	JButton addOrderBtn = new JButton("<html>Ajouter <br>la commande<br> au  stock</html>");
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
	
	JLabel numberCmdLbl = new JLabel("Commande N\u00B0 :");
	topCenterPan.add(numberCmdLbl);
	
	JPanel voidTopLeft = new JPanel();
	topCenterPan.add(voidTopLeft);
	
	JPanel voidMidTop = new JPanel();
	topCenterPan.add(voidMidTop);
	
	JPanel voidTopRight = new JPanel();
	topCenterPan.add(voidTopRight);
	
	numberCmdTxtFld = new JTextField();
	topCenterPan.add(numberCmdTxtFld);
	numberCmdTxtFld.setColumns(10);
	
	JPanel voidMidLeft = new JPanel();
	topCenterPan.add(voidMidLeft);
	
	JPanel voidLeftMid = new JPanel();
	topCenterPan.add(voidLeftMid);
	
	JPanel voidRightMid = new JPanel();
	topCenterPan.add(voidRightMid);
	
	JPanel voidBotMidLeft = new JPanel();
	topCenterPan.add(voidBotMidLeft);
	
	JPanel voidBotMidRight = new JPanel();
	topCenterPan.add(voidBotMidRight);
	
	JPanel voidBotRight = new JPanel();
	topCenterPan.add(voidBotRight);
	
	JButton surchCmdBtn = new JButton("Rechercher");
	topCenterPan.add(surchCmdBtn);
}
private void midCenterPan() {
	/*Mid of center Pan*/
	JPanel middleCenterPan = new JPanel();
	middleCenterPan.setPreferredSize(new Dimension(400, 565));
	centerPanSto.add(middleCenterPan);
	
	JLabel resumeTitleLbl = new JLabel("R\u00E9capitulatif de la commande");
	middleCenterPan.add(resumeTitleLbl);

	/*contactNumberTxtF = new JTextField();
	topMidCenterPan.add(contactNumberTxtF);
	contactNumberTxtF.setColumns(10);*/
	
	JPanel resumeContainerPnl = new JPanel();
	resumeContainerPnl.setBackground(Color.WHITE);
	resumeContainerPnl.setBorder(new LineBorder(new Color(0, 0, 0)));
	resumeContainerPnl.setPreferredSize(new Dimension(400, 290));
	middleCenterPan.add(resumeContainerPnl);
	
	JLabel testResultPnl = new JLabel("Ustensil - Fouet - 1 - 16.00\u20AC - En stock");
	resumeContainerPnl.add(testResultPnl);

	addAndResultPan = new JPanel();
	addAndResultPan.setPreferredSize(new Dimension(400, 265));
	middleCenterPan.add(addAndResultPan);

	JLabel modifPartLbl = new JLabel("Partie Modifications");
	addAndResultPan.add(modifPartLbl);
	
	
}
private void controlResultPan() {
	GridLayout gl_modifPartPan = new GridLayout(4,3);
	gl_modifPartPan.setVgap(20);
	gl_modifPartPan.setHgap(20);
	JPanel modifPartPan = new JPanel(gl_modifPartPan);
	modifPartPan.setPreferredSize(new Dimension(400, 200));
	addAndResultPan.add(modifPartPan);
	
	JLabel productLbl = new JLabel("Product");
	productLbl.setHorizontalAlignment(SwingConstants.CENTER);
	modifPartPan.add(productLbl);

	JLabel nameLbl = new JLabel("Nom");
	nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
	modifPartPan.add(nameLbl);

	JLabel costLbl = new JLabel("Cout Unitaire");
	costLbl.setHorizontalAlignment(SwingConstants.CENTER);
	modifPartPan.add(costLbl);
	
	JLabel autoProLbl = new JLabel("");
	modifPartPan.add(autoProLbl);
	
	JLabel autoNamLbl = new JLabel("");
	modifPartPan.add(autoNamLbl);
	
	JLabel autoCosLbl = new JLabel("");
	modifPartPan.add(autoCosLbl);

	JLabel quantityLbl = new JLabel("Quantit\u00E9");
	quantityLbl.setHorizontalAlignment(SwingConstants.CENTER);
	modifPartPan.add(quantityLbl);
	
	JPanel voidCenterTopPnl = new JPanel();
	modifPartPan.add(voidCenterTopPnl);
	
	JLabel statuLbl = new JLabel("Etat");
	statuLbl.setHorizontalAlignment(SwingConstants.CENTER);
	modifPartPan.add(statuLbl);
	
	qttTxtFld = new JTextField();
	modifPartPan.add(qttTxtFld);
	qttTxtFld.setColumns(10);
	
	JPanel voidCenterBotPnl = new JPanel();
	modifPartPan.add(voidCenterBotPnl);
	
	statuTxtFld = new JTextField();
	modifPartPan.add(statuTxtFld);
	statuTxtFld.setColumns(10);
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
private void stockPage() {
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
