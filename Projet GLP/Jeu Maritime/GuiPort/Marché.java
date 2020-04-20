package GuiPort;

import Port.Port;
import Port.PortAlli�;
import Port.PortEnnemi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Donn�esPort.Flotte;
import Donn�esPort.Villes;
import Navire.NavireAttaque;
import Navire.NavireTransport;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JList;

public class March� extends JFrame {

	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static Flotte flotte1= new Flotte();
	private static PortEnnemi portEnnemi= new PortEnnemi("Perse",20000,3000,5000,7000,2000,4,flotte,navireATT, navireTransport);
	
	private JPanel contentPane;
	
	
	public March�(PortEnnemi portEnnemi, Flotte flotte,Moteur moteur) {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 370);
		setResizable(false);
		setTitle("Construction de la flotte avant le d�part");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(302, 16, 317, 210);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setLayout(null);
		
		JLabel lblStatistiquesDeLa = new JLabel("Marchandise de la Flotte");
		lblStatistiquesDeLa.setBounds(15, 16, 230, 20);
		panel.add(lblStatistiquesDeLa);
		
		JLabel lbGold = new JLabel("Or: "+flotte.getCalle().getOr());
		lbGold.setBounds(15, 41, 194, 20);
		panel.add(lbGold);
		
		JLabel lblBois = new JLabel("Bois: "+flotte.getCalle().getWood());
		lblBois.setBounds(15, 64, 194, 20);
		panel.add(lblBois);
		
		JLabel lblNourriture = new JLabel("Nourriture: "+flotte.getCalle().getFood());
		lblNourriture.setBounds(15, 88, 188, 20);
		panel.add(lblNourriture);
		
		JLabel lblMetaux = new JLabel("M\u00E9taux: "+flotte.getCalle().getSteel());
		lblMetaux.setBounds(15, 113, 194, 20);
		panel.add(lblMetaux);
		
		JLabel lblNewLabel = new JLabel("Capacit\u00E9 disponible :"+(flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�()));
		lblNewLabel.setBounds(15, 166, 176, 28);
		panel.add(lblNewLabel);
		
		//Panel information
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 206, 285, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
		JLabel lblBoisCout = new JLabel("Le cout du bois est de 50 pieces d'or");
		lblBoisCout.setBounds(15, 41, 255, 20);
		panel_1.add(lblBoisCout);
				
		JLabel lblNourritureCout = new JLabel("Le cout de la nourriture est de 30 pieces d'or");
		lblNourritureCout.setBounds(15, 66, 255, 20);
		panel_1.add(lblNourritureCout);
		
		JLabel lblMetauxCout = new JLabel("Le cout des m�taux est de 110 pieces d'or");
		lblMetauxCout.setBounds(15, 88, 255, 20);
		panel_1.add(lblMetauxCout);
				
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choississez votre marchandise", "Bois", "M\u00E9taux", "Nourriture"}));
		comboBox.setBounds(15, 33, 245, 40);
		contentPane.add(comboBox);
		
		
		//Ajouter une marchandise
		JButton btnNewButton = new JButton("Acheter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					flotte1=portEnnemi.AcheterBois(flotte);
				}
				
				if(comboBox.getSelectedIndex()==2) {
					flotte1=portEnnemi.AcheterMetaux(flotte);
				}
				
				if(comboBox.getSelectedIndex()==3) {
					flotte1=portEnnemi.AcheterNourriture(flotte);
				}
				
				lbGold.setText("Or: "+flotte.getCalle().getOr());
				lblBois.setText("Bois : "+flotte.getCalle().getWood());
				lblNourriture.setText("Nourriture : "+flotte.getCalle().getFood());
				lblMetaux.setText("Metaux : "+flotte.getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�()));
				
				lblBoisCout.setText("Bois disponible: "+portEnnemi.getDonn�esPort().getWood());
				lblNourritureCout.setText("Nourriture disponible: "+portEnnemi.getDonn�esPort().getFood());
				lblMetauxCout.setText("M\u00E9taux disponible"+portEnnemi.getDonn�esPort().getSteel());
			}
		});
		btnNewButton.setBounds(153, 150, 134, 40);
		contentPane.add(btnNewButton);
		
		
		//Supprimer une marchandise
		JButton btnSupprimerUnNavire = new JButton("Vendre");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					flotte1=portEnnemi.VendreBois(flotte);
				}
				
				if(comboBox.getSelectedIndex()==2) {
					flotte1=portEnnemi.VendreMetaux(flotte);
				}
				
				if(comboBox.getSelectedIndex()==3) {
					flotte1=portEnnemi.VendreNourriture(flotte);
				}
				
				lbGold.setText("Or: "+flotte.getCalle().getOr());
				lblBois.setText("Bois : "+flotte.getCalle().getWood());
				lblNourriture.setText("Nourriture : "+flotte.getCalle().getFood());
				lblMetaux.setText("Metaux : "+flotte.getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(flotte.getCalle().getCapacit�Totale()-flotte.getCalle().getCapacit�()));
				
				lblBoisCout.setText("Bois disponible: "+portEnnemi.getDonn�esPort().getWood());
				lblNourritureCout.setText("Nourriture disponible: "+portEnnemi.getDonn�esPort().getFood());
				lblMetauxCout.setText("M\u00E9taux disponible"+portEnnemi.getDonn�esPort().getSteel());
			}
		});
		btnSupprimerUnNavire.setBounds(4, 150, 134, 40);
		contentPane.add(btnSupprimerUnNavire);
		
		JButton btnNewButton_1 = new JButton("Marchandise pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				moteur.setFlotteAlli�(flotte1);
				PortEnnemiGui modif= new PortEnnemiGui(portEnnemi,flotte1,moteur);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(455, 267, 164, 37);
		contentPane.add(btnNewButton_1);
		

	}
}

