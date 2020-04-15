package GuiPort;

import Port.Port;
import Port.PortAllié;
import Port.PortEnnemi;

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

public class Marché extends JFrame {

	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static Flotte flotte1= new Flotte();
	private static PortEnnemi portEnnemi= new PortEnnemi("Perse",20000,3000,5000,7000,2000,4,flotte,navireATT, navireTransport);
	
	//static PortAllié portAllié= new PortAllié("Perse",20000,3000000,50000,7000,2000,4,flotte,navireATT, navireTransport);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flotte.getCalle().setOr(2000);
					flotte.getCalle().setCapacitéTotale(3000);
					Marché frame = new Marché(portEnnemi,flotte);
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
	public Marché(PortEnnemi portEnnemi, Flotte flotte,Moteur moteur) {
	
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
		
		JLabel lblNewLabel = new JLabel("Capacit\u00E9 disponible :"+(flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité()));
		lblNewLabel.setBounds(15, 166, 176, 28);
		panel.add(lblNewLabel);
		
		//Panel information
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(2, 206, 285, 108);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
				
		JLabel lblBoisCout = new JLabel("la ville possède "+portEnnemi.getDonnéesPort().getWood()+" de bois, son cout est de 50 pieces d'or");
		lblBoisCout.setBounds(15, 41, 255, 20);
		panel_1.add(lblBoisCout);
				
		JLabel lblNourritureCout = new JLabel("la ville possède "+portEnnemi.getDonnéesPort().getFood()+" de nourriture, son cout est de 50 pieces d'or");
		lblNourritureCout.setBounds(15, 66, 255, 20);
		panel_1.add(lblNourritureCout);
		
		JLabel lblMetauxCout = new JLabel("la ville possède "+portEnnemi.getDonnéesPort().getSteel()+" de métaux, son cout est de 50 pieces d'or");
		lblMetauxCout.setBounds(15, 88, 255, 20);
		panel_1.add(lblMetauxCout);
				
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choississez votre marchandise", "Bois", "M\u00E9taux", "Nourriture"}));
		comboBox.setBounds(15, 33, 245, 40);
		contentPane.add(comboBox);
		
		
		//Ajouter une marchandise
		JButton btnNewButton = new JButton("Ajouter");
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
				lblNewLabel.setText("Capacité disponible : "+(flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité()));
				
				lblBoisCout.setText("Bois disponible: "+portEnnemi.getDonnéesPort().getWood());
				lblNourritureCout.setText("Nourriture disponible: "+portEnnemi.getDonnéesPort().getFood());
				lblMetauxCout.setText("M\u00E9taux disponible"+portEnnemi.getDonnéesPort().getSteel());
			}
		});
		btnNewButton.setBounds(153, 150, 134, 40);
		contentPane.add(btnNewButton);
		
		
		/*Supprimer une marchandise
		JButton btnSupprimerUnNavire = new JButton("Supprimer");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portEnnemi.SupprimerOr(100);
				}
				if(comboBox.getSelectedIndex()==2) {
					portEnnemi.SupprimerWood(100);
				}
				if(comboBox.getSelectedIndex()==3) {
					portEnnemi.SupprimerSteel(100);
				}
				if(comboBox.getSelectedIndex()==4) {
					portEnnemi.SupprimerFood(100);
				}
				lbGold.setText("Or: "+flotte.getCalle().getOr());
				lblBois.setText("Bois : "+flotte.getCalle().getWood());
				lblNourriture.setText("Nourriture : "+flotte.getCalle().getFood());
				lblMetaux.setText("Metaux : "+flotte.getCalle().getSteel());
				lblNewLabel.setText("Capacité disponible : "+(flotte.getCalle().getCapacitéTotale()-flotte.getCalle().getCapacité()));
				
				lblOrDisponible.setText("Or disponible: "+portEnnemi.getDonnéesPort().getGold());
				lblBoisDisponible.setText("Bois disponible: "+portEnnemi.getDonnéesPort().getWood());
				lblNourritureDisponible.setText("Nourriture disponible: "+portEnnemi.getDonnéesPort().getFood());
				lblMetauxDisponible.setText("M\u00E9taux disponible"+portEnnemi.getDonnéesPort().getSteel());
			}
		});
		btnSupprimerUnNavire.setBounds(4, 150, 134, 40);
		contentPane.add(btnSupprimerUnNavire);*/
		
		JButton btnNewButton_1 = new JButton("Marchandise pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				PortEnnemiGui modif= new PortEnnemiGui(portEnnemi,flotte1,moteur);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(455, 267, 164, 37);
		contentPane.add(btnNewButton_1);
		

	}
}

