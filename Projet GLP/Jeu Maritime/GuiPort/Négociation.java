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

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortEnnemi;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Négociation extends JFrame {


	private JPanel contentPane;
	public static final String NL= System.getProperty("line.separator");
	private static Flotte flotte= new Flotte();
	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static PortEnnemi a= new PortEnnemi("Perse",20000,3000,5000,7000,2000,4,flotte,navireATT, navireTransport);
	private JTextArea txtManoeuvreVous;
	private JTextField textField;
	private JTextField textField_1;
	
	public Négociation(PortEnnemi p1, Flotte f1,Moteur moteur) {
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
        
        JLabel lblNewLabel_1 = new JLabel("Or disponible : "+ f1.getCalle().getOr());
		lblNewLabel_1.setBounds(33, 74, 140, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valeur du port : " + p1.getDonnéesPort().getValeurVille());
		lblNewLabel_2.setBounds(10, 40, 140, 14);
		contentPane.add(lblNewLabel_2);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int negoce=(5*p1.getDonnéesPort().getValeurVille()/100);
                int i=Integer.parseInt(textField.getText());
                if(p1.getDonnéesPort().getValeurVille()-negoce<i && f1.getCalle().getOr()>=i) {
                    textField_1.setText("Le marché est conclu.");
            		lblNewLabel_1.setText("Or disponible : "+ (f1.getCalle().getOr()-i));
                    f1.getCalle().setOr(f1.getCalle().getOr()-i);
                    if(p1.getDonnéesPort().getName()=="Athenes") {
                    	moteur.setAppartenanceAthenes(1);
                        moteur.getAthenes().setFlotte(f1);
                        moteur.getRome().setFlotte(f1);
                        moteur.getSparte().setFlotte(f1);
                        moteur.getLeCaire().setFlotte(f1);
                        moteur.getPerse().setFlotte(f1);
    				}
    				if(p1.getDonnéesPort().getName()=="Rome") {
    					moteur.setAppartenanceRome(1);
    					moteur.getAthenes().setFlotte(f1);
                        moteur.getRome().setFlotte(f1);
                        moteur.getSparte().setFlotte(f1);
                        moteur.getLeCaire().setFlotte(f1);
                        moteur.getPerse().setFlotte(f1);
    				}
    				if(p1.getDonnéesPort().getName()=="LeCaire") {
    					moteur.setAppartenanceLeCaire(1);
    					moteur.getAthenes().setFlotte(f1);
                        moteur.getRome().setFlotte(f1);
                        moteur.getSparte().setFlotte(f1);
                        moteur.getLeCaire().setFlotte(f1);
                        moteur.getPerse().setFlotte(f1);
    				}
    				if(p1.getDonnéesPort().getName()=="Sparte") {
    					moteur.setAppartenanceSparte(1);
    					moteur.getAthenes().setFlotte(f1);
                        moteur.getRome().setFlotte(f1);
                        moteur.getSparte().setFlotte(f1);
                        moteur.getLeCaire().setFlotte(f1);
                        moteur.getPerse().setFlotte(f1);
    				}
    				if(p1.getDonnéesPort().getName()=="Perse") {
    					moteur.setAppartenancePerse(1);
    					moteur.getAthenes().setFlotte(f1);
                        moteur.getRome().setFlotte(f1);
                        moteur.getSparte().setFlotte(f1);
                        moteur.getLeCaire().setFlotte(f1);
                        moteur.getPerse().setFlotte(f1);
    				}
                }
                else if(f1.getCalle().getOr()<i) {
                	textField_1.setText("Vous n'avez pas l'or requis pour la négociation.");
                }
                else {
                    textField_1.setText("Il faut augmenter le prix messieurs ! (La négociation devient plus difficile...)");
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
				moteur.setFlotteAllié(f1);
				if(p1.getDonnéesPort().getName()=="Athenes" && moteur.getAppartenanceAthenes()==1) {
                    moteur.Athenes();
				}
				else if(p1.getDonnéesPort().getName()=="Rome" && moteur.getAppartenanceRome()==1) {
                    moteur.Rome();
				}
				else if(p1.getDonnéesPort().getName()=="Sparte" && moteur.getAppartenanceSparte()==1) {
                    moteur.Sparte();
				}
				else if(p1.getDonnéesPort().getName()=="LeCaire" && moteur.getAppartenanceLeCaire()==1) {
                    moteur.LeCaire();
				}
				else if(p1.getDonnéesPort().getName()=="Perse" && moteur.getAppartenancePerse()==1) {
                    moteur.Perse();
				}
				else {
					PortEnnemiGui modif= new PortEnnemiGui(p1,f1,moteur);
					modif.setVisible(true);
				}
			}
			});
		
	}
	
	private void pause(){
        try {
         Thread.sleep(3000);
         }  // attendre 5sec 
        catch (InterruptedException e) {
         e.printStackTrace();
         }
       }
}