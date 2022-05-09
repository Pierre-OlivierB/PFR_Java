package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class View extends JFrame{
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	/*private JFrame frame;
	public static void main(String[] args) {
		Product test=new Product();

	}*/
	public View() {
		new JFrame();
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		initialize();
	}
	private void initialize() {
		contentPane=(JPanel)this.getContentPane();
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		/*Product Frame*/
		Product productPan = new Product();
		tabbedPane.addTab("Product", null, productPan, null);
		
		/*Fournisseur Frame*/
		Supplier supplierPan = new Supplier();
		tabbedPane.addTab("Fournisseur", null, supplierPan, null);
		/*SupPage = new Supplier();
		supplierPan.add(SupPage);*/		
		
		/*Commande Frame*/
		Package packagePan = new Package();
		tabbedPane.addTab("Commande", null, packagePan, null);
		
		/*Stock Frame*/
		Stock stockPan = new Stock();
		tabbedPane.addTab("Stock", null, stockPan, null);
		
		
	}

}
