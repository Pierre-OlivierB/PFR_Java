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

public class CleanBdd extends JPanel{

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
	
	public CleanBdd(){
		initialize();
	}

	private void initialize() {
	
		contentPane=this;
		/*Product Frame*/
		cleanFrame();


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

cleanPage();

otherPage();

}
/**
* Listen Button
*/

private void btnTestListener(ActionEvent event) {
System.out.println("btn click");
}
private void cleanFrame() {
inContentPaneSto = new JPanel();
contentPane.add(inContentPaneSto);

leftPanSto = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 100));
leftPanSto.setBorder(new LineBorder(new Color(0, 0, 0), 2));
leftPanSto.setPreferredSize(new Dimension(170, 680));

JLabel leftPanTitlelbl = new JLabel("<html>L'action est <br>irr\u00E9versible, <br>\u00EAtes-vous <br> certain ?</html>");
leftPanTitlelbl.setBackground(Color.WHITE);
leftPanTitlelbl.setPreferredSize(new Dimension(110,80));
leftPanSto.add(leftPanTitlelbl);

JButton lastYesBtn = new JButton("<html>Oui, j'en suis s\u00FBr.</html>");
lastYesBtn.setBackground(Color.GREEN);
lastYesBtn.setHorizontalAlignment(SwingConstants.LEADING);
lastYesBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(lastYesBtn);

JButton lastNoBtn = new JButton("<html>Non, j'ai chang\u00E9 <br> d'avis.</html>");
lastNoBtn.setBackground(Color.RED);
lastNoBtn.setHorizontalAlignment(SwingConstants.LEADING);
lastNoBtn.setPreferredSize(new Dimension(110,80));
leftPanSto.add(lastNoBtn);
}

private void topPanelCenter() {
JPanel topCenterPan = new JPanel();
topCenterPan.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
topCenterPan.setPreferredSize(new Dimension(400, 100));
centerPanSto.add(topCenterPan, BorderLayout.NORTH);
JLabel firstControlTtlLbl = new JLabel("<html>\u00CAtes-vous s\u00FBr de vouloir supprimer <br> toutes les informations de la base de donn\u00E9es ?</html>");
firstControlTtlLbl.setPreferredSize(new Dimension(350, 50));
topCenterPan.add(firstControlTtlLbl);
JButton yesBtn = new JButton("Oui");
yesBtn.setBackground(Color.GREEN);
topCenterPan.add(yesBtn);
JPanel voidPan = new JPanel();
voidPan.setPreferredSize(new Dimension(200, 50));
topCenterPan.add(voidPan);
JButton noBtn = new JButton("Non");
noBtn.setBackground(Color.RED);
topCenterPan.add(noBtn);
}
private void midCenterPan() {
/*Mid of center Pan*/
JPanel middleCenterPan = new JPanel();
middleCenterPan.setPreferredSize(new Dimension(400, 565));
centerPanSto.add(middleCenterPan);
middleCenterPan.setLayout(new BorderLayout(0, 0));
JLabel lastMessageLbl = new JLabel("<html>Toutes les informations <br> de la base de donn\u00E9es <br> ont \u00E9t\u00E9 supprim\u00E9.</html>");
lastMessageLbl.setHorizontalAlignment(SwingConstants.CENTER);
lastMessageLbl.setPreferredSize(new Dimension(400, 50));
lastMessageLbl.setBackground(Color.GREEN);
middleCenterPan.add(lastMessageLbl);


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
}
private void cleanPage() {

}
private void otherPage() {
}

}
