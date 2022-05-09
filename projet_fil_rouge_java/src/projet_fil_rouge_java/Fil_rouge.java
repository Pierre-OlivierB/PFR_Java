package projet_fil_rouge_java;



import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.SwingConstants;
import View.*;

public class Fil_rouge{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4862798308073302717L;
	/*private JFrame frame;
	/*private JPanel contentPane;
	private JTabbedPane tabbedPane;*/
	/*private JButton btnNewButtonTest = new JButton("Cliquez-moi");
	private JPanel productPan = new JPanel();
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
	private JPanel inContentPanePro;
	private JTabbedPane tabbedPane;
	private JPanel leftPanPro;
	private JPanel centerPanPro = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JTabbedPane bddPan;*/
	private View test;
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
					window.test.setVisible(true);
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

		test = new View();	

	}
		
}


