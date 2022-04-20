package projet_fil_rouge_java;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Fil_rouge extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4862798308073302717L;
	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButtonTest = new JButton("Cliquez-moi");
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Test");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//look window
					UIManager.setLookAndFeel(new NimbusLookAndFeel());
					//start window
					Fil_rouge window = new Fil_rouge();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fil_rouge() {
		initialize();
	}
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		
		tabbedPane.addTab("Product", null, panel, null);
		
		
		panel.add(lblNewLabel);
		
		
		panel.add(btnNewButtonTest);
		btnNewButtonTest.addActionListener(this);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Fournisseur", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Commande", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Stock", null, panel_3, null);
	}
	/**
	 * Listen Button
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("btn click");
		
	}

}
