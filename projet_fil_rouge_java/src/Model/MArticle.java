package Model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MArticle extends MyConnexion{
	static Clavier scan=new Clavier(); 
	static Boolean flag=false;
	private static Object[] row;
	private static DefaultTableModel model;
	private MyConnexion co = new MyConnexion();
	private String [] showSup = new String[1];
	private String supOriginTxt="";
	private ResultSet resultattest;
	
	public MArticle() {
		test();
	}
	
	public DefaultTableModel readAll() {
		try {
			co.openConnection();
			Statement declaration=accessDataBase.createStatement();
			String query="SELECT a.Id_article,a.name, sup.name, ap.price, a.creation_date FROM article a LEFT JOIN sell_by sb ON sb.Id_article=a.Id_article LEFT JOIN supplier sup ON sup.Id_supplier=sb.Id_supplier LEFT JOIN article_price ap ON ap.Id_article=a.Id_article; ";
			ResultSet resultat=declaration.executeQuery(query);
			String [] show = new String[6];
			String[] article= {"Product","Nom","Fournisseur","Prix","Date Ajout"};
			model = new DefaultTableModel(null, article);
			while (resultat.next()) {
						show[0]=resultat.getString("Id_article");
						show[1]=resultat.getString("name");
						show[2]=resultat.getString("sup.name");
						show[3]=resultat.getString("price");
						show[4]=resultat.getString("creation_date");
						model.addRow(show);
						//JTable.setModel(model);
			}
			co.closeConnection();
			System.out.println("fin requ?te read");
		}catch (Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}
		return model;
		
	}
	public void insertProduct(String name, String brand, String user) {
		try {
			co.openConnection();
			String query="INSERT INTO article (name, brand, Id_user) values (?,?,?)";
			PreparedStatement declaration= accessDataBase.prepareStatement(query);
			declaration.setString(1, name);
			declaration.setString(2, brand);
			declaration.setString(3, user);
			declaration.executeUpdate();
			
			co.closeConnection();
			System.out.println("fin requ?te read");
		}catch (Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}			
	}
	
	public void insertSellBy(String supName, String artName) {
		try {
			String originFocus = supOrigin(supName);
			String Id_supplier = supId(supName);
			String Id_article = artId(artName);
			co.openConnection();
			String query="INSERT INTO sell_by (Id_supplier, Id_article, origin) values (?,?,?)";
			PreparedStatement declaration= accessDataBase.prepareStatement(query);
			declaration.setString(1, Id_supplier);
			declaration.setString(2, Id_article);
			declaration.setString(3, originFocus);
			declaration.executeUpdate();
			
			co.closeConnection();
			System.out.println("fin requ?te read");
		}catch (Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}			
	}
	public String supOrigin(String supName){
		try {
			co.openConnection();
			String query="SELECT address FROM  supplier WHERE name=? ";
			PreparedStatement declarationSupOrigin= accessDataBase.prepareStatement(query);
			declarationSupOrigin.setString(1, supName);
			//declarationSupOrigin.executeUpdate();
			ResultSet resultat=declarationSupOrigin.executeQuery(query);
			supOriginTxt=resultat.getString("address");
			co.closeConnection();
			System.out.println("fin requ?te supOrigin");
			
		}catch(Exception e) {
			System.err.println("Erreur d'affichage d'ing(supOrigin): " + e.getMessage());
		}
		return supOriginTxt;
		//return resultat;
	}
	public String supId(String supName){
		try {
			co.openConnection();
			//String query="SELECT Id_supplier FROM  supplier WHERE name=? ";
			PreparedStatement declarationSupOrigin= accessDataBase.prepareStatement("SELECT Id_supplier FROM  supplier WHERE name=? ");
			declarationSupOrigin.setString(1, supName);
			//declarationSupOrigin.executeUpdate();
			ResultSet resultat=declarationSupOrigin.executeQuery();
			supOriginTxt=resultat.getString("Id_supplier");
			co.closeConnection();
			System.out.println("fin requ?te supId");
			
		}catch(Exception e) {
			System.err.println("Erreur d'affichage d'ing(supId): " + e.getMessage());
		}
		return supOriginTxt;
	}
	public String artId(String artName){
		try {
			co.openConnection();
			String query="SELECT art.Id_article FROM  article art WHERE name=?; ";
			PreparedStatement declarationSupOrigin= accessDataBase.prepareStatement(query);
			declarationSupOrigin.setString(1, artName);
			//declarationSupOrigin.executeUpdate();
			ResultSet resultat=declarationSupOrigin.executeQuery();
			supOriginTxt=resultat.getString("Id_article");
			co.closeConnection();
			System.out.println("fin requ?te artId");
			
		}catch(Exception e) {
			System.err.println("Erreur d'affichage d'ing(artId): " + e.getMessage());
		}
		return supOriginTxt;
	}
	public String[] supChoiceCBSet(){
		try {
			co.openConnection();
			Statement declaration=accessDataBase.createStatement();
			String query="SELECT sup.name FROM  supplier sup ; ";
			ResultSet resultat=declaration.executeQuery(query);
			while (resultat.next()) {
						showSup[0]=resultat.getString("name");
			}
			co.closeConnection();
			System.out.println("fin requ?te supChoice");
			
		}catch(Exception e) {
			System.err.println("Erreur d'affichage d'ing: " + e.getMessage());
		}
		return showSup;
	}
	private void test() {
		System.out.println("test");
	}
	
}
