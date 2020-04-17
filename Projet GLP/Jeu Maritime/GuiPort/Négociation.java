package GuiPort;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortEnnemi;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class N�gociation extends JFrame {


	private JPanel contentPane;
	public static final String NL= System.getProperty("line.separator");
	private static Flotte flotte= new Flotte();
	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static PortEnnemi a= new PortEnnemi("Perse",20000,3000,5000,7000,2000,4,flotte,navireATT, navireTransport);
	private JTextArea txtManoeuvreVous;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		flotte.setCapacit�(25000);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					N�gociation frame = new N�gociation(a,flotte);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public N�gociation(PortEnnemi p1, Flotte f1,Moteur moteur) {
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
		lblPrixPropos.setBounds(30, 99, 94, 14);
		panel.add(lblPrixPropos);
		
		textField = new JTextField();
		textField.setBounds(111, 96, 158, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Validation");
        btnNewButton.setBounds(298, 95, 184, 23);
        panel.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int negoce=(5*p1.getDonn�esPort().getValeurVille()/100);
                int i=Integer.parseInt(textField.getText());
                if(p1.getDonn�esPort().getValeurVille()-negoce<i && f1.getCalle().getOr()>=i) {
                	f1.getCalle().setOr(f1.getCalle().getOr());
                    textField_1.setText("Le march� est conclu.");
                    f1.getCalle().setOr(f1.getCalle().getOr()-i); 
                    moteur.setAppartenanceAthenes(1);
                    moteur.getAthenes().setFlotte(f1);
                    moteur.Athenes();
                    setVisible(false);
                }
                else if(f1.getCalle().getOr()<i) {
                	textField_1.setText("Vous n'avez pas l'or requis pour la n�gociation.");
                }
                else {
                    textField_1.setText("Il faut augmenter le prix messieurs ! (La n�gociation devient plus difficile...)");
                }
            }});
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEditable(false);
		textField_1.setBounds(33, 139, 383, 66);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnQuitterLesNgociations = new JButton("Quitter les n\u00E9gociations");
		btnQuitterLesNgociations.setBounds(426, 182, 209, 23);
		panel.add(btnQuitterLesNgociations);
		btnQuitterLesNgociations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
			});
		
		JLabel lblNewLabel_1 = new JLabel("Or disponible : "+ f1.getCalle().getOr());
		lblNewLabel_1.setBounds(33, 74, 140, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valeur du port : " + p1.getDonn�esPort().getValeurVille());
		lblNewLabel_2.setBounds(10, 40, 140, 14);
		contentPane.add(lblNewLabel_2);
	}
}