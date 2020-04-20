package GuiPort;

import Port.Port;
import Port.PortAlli�;

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

public class Transport extends JFrame {

	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static int CompteurATT=0;
	private static int CompteurTransport=0;
	
	private JPanel contentPane;

	
	public Transport(PortAlli� portAlli�,Moteur moteur) {
	
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
		
		JLabel lbGold = new JLabel("Or: "+portAlli�.getFlotte().getCalle().getOr());
		lbGold.setBounds(15, 41, 194, 20);
		panel.add(lbGold);
		
		JLabel lblBois = new JLabel("Bois: "+portAlli�.getFlotte().getCalle().getWood());
		lblBois.setBounds(15, 64, 194, 20);
		panel.add(lblBois);
		
		JLabel lblNourriture = new JLabel("Nourriture: "+portAlli�.getFlotte().getCalle().getFood());
		lblNourriture.setBounds(15, 88, 188, 20);
		panel.add(lblNourriture);
		
		JLabel lblMetaux = new JLabel("M\u00E9taux: "+portAlli�.getFlotte().getCalle().getSteel());
		lblMetaux.setBounds(15, 113, 194, 20);
		panel.add(lblMetaux);
		
		JLabel lblNewLabel = new JLabel("Capacit\u00E9 disponible :"+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
		lblNewLabel.setBounds(15, 166, 176, 28);
		panel.add(lblNewLabel);
		
		//Panel information
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 206, 285, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
		JLabel lblOrDisponible = new JLabel("Or disponible: "+portAlli�.getDonn�esPort().getGold());
		lblOrDisponible.setBounds(15, 16, 255, 20);
		panel_1.add(lblOrDisponible);
				
		JLabel lblBoisDisponible = new JLabel("Bois disponible: "+portAlli�.getDonn�esPort().getWood());
		lblBoisDisponible.setBounds(15, 41, 255, 20);
		panel_1.add(lblBoisDisponible);
				
		JLabel lblNourritureDisponible = new JLabel("Nourriture disponible: "+portAlli�.getDonn�esPort().getFood());
		lblNourritureDisponible.setBounds(15, 66, 255, 20);
		panel_1.add(lblNourritureDisponible);
		
		JLabel lblMetauxDisponible = new JLabel("M\u00E9taux disponible: "+portAlli�.getDonn�esPort().getSteel());
		lblMetauxDisponible.setBounds(15, 88, 255, 20);
		panel_1.add(lblMetauxDisponible);
				
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choississez votre marchandise", "Or", "Bois", "M\u00E9taux", "Nourriture"}));
		comboBox.setBounds(15, 33, 245, 40);
		contentPane.add(comboBox);
		
		
		//Ajouter une marchandise
		JButton btnNewButton = new JButton("Charger");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portAlli�.AjouterOr(100);
				}
				
				if(comboBox.getSelectedIndex()==2) {
					portAlli�.AjouterWood(100);
				}
				
				if(comboBox.getSelectedIndex()==3) {
					portAlli�.AjouterSteel(100);
				}
				
				if(comboBox.getSelectedIndex()==4) {
					portAlli�.AjouterFood(100);
				}
				
				lbGold.setText("Or: "+ portAlli�.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAlli�.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAlli�.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAlli�.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
				
				lblOrDisponible.setText("Or disponible: "+portAlli�.getDonn�esPort().getGold());
				lblBoisDisponible.setText("Bois disponible: "+portAlli�.getDonn�esPort().getWood());
				lblNourritureDisponible.setText("Nourriture disponible: "+portAlli�.getDonn�esPort().getFood());
				lblMetauxDisponible.setText("M\u00E9taux disponible"+portAlli�.getDonn�esPort().getSteel());
			}
		});
		btnNewButton.setBounds(153, 150, 134, 40);
		contentPane.add(btnNewButton);
		
		
		//Supprimer une marchandise
		JButton btnSupprimerUnNavire = new JButton("Decharger");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portAlli�.SupprimerOr(100);
				}
				if(comboBox.getSelectedIndex()==2) {
					portAlli�.SupprimerWood(100);
				}
				if(comboBox.getSelectedIndex()==3) {
					portAlli�.SupprimerSteel(100);
				}
				if(comboBox.getSelectedIndex()==4) {
					portAlli�.SupprimerFood(100);
				}
				lbGold.setText("Or: "+ portAlli�.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAlli�.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAlli�.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAlli�.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
				
				lblOrDisponible.setText("Or disponible: "+portAlli�.getDonn�esPort().getGold());
				lblBoisDisponible.setText("Bois disponible: "+portAlli�.getDonn�esPort().getWood());
				lblNourritureDisponible.setText("Nourriture disponible: "+portAlli�.getDonn�esPort().getFood());
				lblMetauxDisponible.setText("M\u00E9taux disponible"+portAlli�.getDonn�esPort().getSteel());
			}
		});
		btnSupprimerUnNavire.setBounds(4, 150, 134, 40);
		contentPane.add(btnSupprimerUnNavire);
		
		JButton btnNewButton_1 = new JButton("Marchandise pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(portAlli�.getDonn�esPort().getName()=="Athenes") {
					moteur.setAthenes(portAlli�);
				}
				if(portAlli�.getDonn�esPort().getName()=="Rome") {
					moteur.setRome(portAlli�);
				}
				if(portAlli�.getDonn�esPort().getName()=="LeCaire") {
					moteur.setLeCaire(portAlli�);
				}
				if(portAlli�.getDonn�esPort().getName()=="Sparte") {
					moteur.setSparte(portAlli�);
				}
				if(portAlli�.getDonn�esPort().getName()=="Perse") {
					moteur.setPerse(portAlli�);
				}
				PortAllie modif= new PortAllie(portAlli�,moteur);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(455, 267, 164, 37);
		contentPane.add(btnNewButton_1);
		

	}
}
