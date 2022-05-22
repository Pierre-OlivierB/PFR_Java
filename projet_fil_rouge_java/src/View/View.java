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
		this.setSize(1000,760);
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
		
		/*Condition/Unité Frame*/
		ConditionAndUnit condUnitPan = new ConditionAndUnit();
		tabbedPane.addTab("<html>Condition/<br> Unité</html>", null,condUnitPan, null );
		
		/*Condition/Unité Frame*/
		PackageAndProduct pacProPan = new PackageAndProduct();
		tabbedPane.addTab("<html>Package/<br> Product</html>", null,pacProPan, null );
		
		/*Condition/Unité Frame*/
		Contact contactPan = new Contact();
		tabbedPane.addTab("<html>Contact</html>", null,contactPan, null );
		
		/*Condition/Unité Frame*/
		User userPan = new User();
		tabbedPane.addTab("<html>Utilisateur</html>", null,userPan, null );
		
		/*Condition/Unité Frame*/
		CleanBdd cleanBddPan = new CleanBdd();
		tabbedPane.addTab("<html>Nettoyage<br> BDD</html>", null,cleanBddPan, null );
	}

}
