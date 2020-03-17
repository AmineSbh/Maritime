package GuiPort;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;

public class Négociation extends JFrame {

	private JPanel contentPane;
	public static final String NL= System.getProperty("line.separator");
	private JTextArea txtManoeuvreVous;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Négociation frame = new Négociation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Négociation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 661, 333);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00E9gociation");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(120, 11, 359, 49);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 60, 635, 233);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtManoeuvreVous = new JTextArea();
		txtManoeuvreVous.setBackground(SystemColor.menu);
		txtManoeuvreVous.setEditable(false);
		txtManoeuvreVous.setText("Manoeuvre : Vous \u00EAtes en pleine n\u00E9gociation afin de d'acheter le port \r\nVeuillez proposer un prix convenable ");
		txtManoeuvreVous.setBounds(10, 26, 572, 51);
		panel.add(txtManoeuvreVous);
		txtManoeuvreVous.setColumns(10);
		
		JLabel lblPrixPropos = new JLabel("Prix propos\u00E9 :");
		lblPrixPropos.setBounds(20, 88, 94, 14);
		panel.add(lblPrixPropos);
		
		textField = new JTextField();
		textField.setBounds(112, 85, 158, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Validation");
		btnNewButton.setBounds(334, 84, 184, 23);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEditable(false);
		textField_1.setBounds(33, 139, 383, 66);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnQuitterLesNgociations = new JButton("Quitter les n\u00E9gociations");
		btnQuitterLesNgociations.setBounds(467, 182, 158, 23);
		panel.add(btnQuitterLesNgociations);
		
		JLabel lblNewLabel_1 = new JLabel("Or disponible : ");
		lblNewLabel_1.setBounds(10, 40, 140, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valeur du port : ");
		lblNewLabel_2.setBounds(10, 15, 140, 14);
		contentPane.add(lblNewLabel_2);
	}
}
