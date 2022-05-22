package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;

public class MArticle extends MyConnexion{
	static Clavier scan=new Clavier(); 
	static Boolean flag=false;
	private static Object[] row;
	private static DefaultTableModel model;
	private MyConnexion co = new MyConnexion();
	
	public DefaultTableModel readAll() {
		try {
			co.openConnection();
			Statement declaration=accessDataBase.createStatement();
			String query="SELECT a.Id_article,a.name, sup.name, ap.price, a.creation_date FROM article a INNER JOIN supplier sup, article_price ap";
			ResultSet resultat=declaration.executeQuery(query);
			String [] show = new String[6];
			String[] article= {"Product","Nom","Fournisseur","Prix","Date Ajout"};
			model = new DefaultTableModel(null, article);
			while (resultat.next()) {
						show[0]=resultat.getString("Id_article");
						show[1]=resultat.getString("name");
						show[2]=resultat.getString("name");
						show[3]=resultat.getString("price");
						show[4]=resultat.getString("creation_date");
						model.addRow(show);
						//JTable.setModel(model);
			}
			co.closeConnection();
			System.out.println("fin requête read");
		}catch (Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}
		return model;
		
	}
}
