package projet_fil_rouge_java;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MenuBarSample extends JFrame {


	private static final long serialVersionUID = 8656926137269461688L;
	
	/*Constructeur, interface graphique*/
	public MenuBarSample() {
		super("JMenuBar Sample");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		/*Construction et injection de la barre*/
		this.setJMenuBar(createMenuBar());
	}
	/*Method construction barre de menu*/
	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu mnuFile = new JMenu("File");
		
		JMenuItem mnuNew = new JMenuItem("New File");
		mnuFile.add(mnuNew);
		
		menuBar.add(mnuFile);
		
		
		return menuBar;
	}

	/**/

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		MenuBarSample window = new MenuBarSample();
		window.setVisible(true);
	}

}
