package GuiPort;

import Port.Port;
import Port.PortAllié;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DonnéesPort.Flotte;
import DonnéesPort.Villes;
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

	
	public Transport(PortAllié portAllié,Moteur moteur) {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 370);
		setResizable(false);
		setTitle("Construction de la flotte avant le départ");
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
		
		JLabel lbGold = new JLabel("Or: "+portAllié.getFlotte().getCalle().getOr());
		lbGold.setBounds(15, 41, 194, 20);
		panel.add(lbGold);
		
		JLabel lblBois = new JLabel("Bois: "+portAllié.getFlotte().getCalle().getWood());
		lblBois.setBounds(15, 64, 194, 20);
		panel.add(lblBois);
		
		JLabel lblNourriture = new JLabel("Nourriture: "+portAllié.getFlotte().getCalle().getFood());
		lblNourriture.setBounds(15, 88, 188, 20);
		panel.add(lblNourriture);
		
		JLabel lblMetaux = new JLabel("M\u00E9taux: "+portAllié.getFlotte().getCalle().getSteel());
		lblMetaux.setBounds(15, 113, 194, 20);
		panel.add(lblMetaux);
		
		JLabel lblNewLabel = new JLabel("Capacit\u00E9 disponible :"+(portAllié.getFlotte().getCalle().getCapacitéTotale()-portAllié.getFlotte().getCalle().getCapacité()));
		lblNewLabel.setBounds(15, 166, 176, 28);
		panel.add(lblNewLabel);
		
		//Panel information
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 206, 285, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
		JLabel lblOrDisponible = new JLabel("Or disponible: "+portAllié.getDonnéesPort().getGold());
		lblOrDisponible.setBounds(15, 16, 255, 20);
		panel_1.add(lblOrDisponible);
				
		JLabel lblBoisDisponible = new JLabel("Bois disponible: "+portAllié.getDonnéesPort().getWood());
		lblBoisDisponible.setBounds(15, 41, 255, 20);
		panel_1.add(lblBoisDisponible);
				
		JLabel lblNourritureDisponible = new JLabel("Nourriture disponible: "+portAllié.getDonnéesPort().getFood());
		lblNourritureDisponible.setBounds(15, 66, 255, 20);
		panel_1.add(lblNourritureDisponible);
		
		JLabel lblMetauxDisponible = new JLabel("M\u00E9taux disponible: "+portAllié.getDonnéesPort().getSteel());
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
					portAllié.AjouterOr(100);
				}
				
				if(comboBox.getSelectedIndex()==2) {
					portAllié.AjouterWood(100);
				}
				
				if(comboBox.getSelectedIndex()==3) {
					portAllié.AjouterSteel(100);
				}
				
				if(comboBox.getSelectedIndex()==4) {
					portAllié.AjouterFood(100);
				}
				
				lbGold.setText("Or: "+ portAllié.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAllié.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAllié.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAllié.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacité disponible : "+(portAllié.getFlotte().getCalle().getCapacitéTotale()-portAllié.getFlotte().getCalle().getCapacité()));
				
				lblOrDisponible.setText("Or disponible: "+portAllié.getDonnéesPort().getGold());
				lblBoisDisponible.setText("Bois disponible: "+portAllié.getDonnéesPort().getWood());
				lblNourritureDisponible.setText("Nourriture disponible: "+portAllié.getDonnéesPort().getFood());
				lblMetauxDisponible.setText("M\u00E9taux disponible"+portAllié.getDonnéesPort().getSteel());
			}
		});
		btnNewButton.setBounds(153, 150, 134, 40);
		contentPane.add(btnNewButton);
		
		
		//Supprimer une marchandise
		JButton btnSupprimerUnNavire = new JButton("Decharger");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portAllié.SupprimerOr(100);
				}
				if(comboBox.getSelectedIndex()==2) {
					portAllié.SupprimerWood(100);
				}
				if(comboBox.getSelectedIndex()==3) {
					portAllié.SupprimerSteel(100);
				}
				if(comboBox.getSelectedIndex()==4) {
					portAllié.SupprimerFood(100);
				}
				lbGold.setText("Or: "+ portAllié.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAllié.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAllié.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAllié.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacité disponible : "+(portAllié.getFlotte().getCalle().getCapacitéTotale()-portAllié.getFlotte().getCalle().getCapacité()));
				
				lblOrDisponible.setText("Or disponible: "+portAllié.getDonnéesPort().getGold());
				lblBoisDisponible.setText("Bois disponible: "+portAllié.getDonnéesPort().getWood());
				lblNourritureDisponible.setText("Nourriture disponible: "+portAllié.getDonnéesPort().getFood());
				lblMetauxDisponible.setText("M\u00E9taux disponible"+portAllié.getDonnéesPort().getSteel());
			}
		});
		btnSupprimerUnNavire.setBounds(4, 150, 134, 40);
		contentPane.add(btnSupprimerUnNavire);
		
		JButton btnNewButton_1 = new JButton("Marchandise pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(portAllié.getDonnéesPort().getName()=="Athenes") {
					moteur.setAthenes(portAllié);
				}
				if(portAllié.getDonnéesPort().getName()=="Rome") {
					moteur.setRome(portAllié);
				}
				if(portAllié.getDonnéesPort().getName()=="LeCaire") {
					moteur.setLeCaire(portAllié);
				}
				if(portAllié.getDonnéesPort().getName()=="Sparte") {
					moteur.setSparte(portAllié);
				}
				if(portAllié.getDonnéesPort().getName()=="Perse") {
					moteur.setPerse(portAllié);
				}
				PortAllie modif= new PortAllie(portAllié,moteur);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(455, 267, 164, 37);
		contentPane.add(btnNewButton_1);
		

	}
}
