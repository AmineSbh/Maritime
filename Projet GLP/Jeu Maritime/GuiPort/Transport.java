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
	
	//static PortAlli� portAlli�= new PortAlli�("Perse",20000,3000000,50000,7000,2000,4,flotte,navireATT, navireTransport);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transport frame = new Transport(new PortAlli�(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport));
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
	public Transport(PortAlli� portAlli�) {
	
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
		
		JLabel lbGold = new JLabel("Or :"+portAlli�.getFlotte().getCalle().getOr());
		lbGold.setBounds(15, 41, 194, 20);
		panel.add(lbGold);
		
		JLabel lblBois = new JLabel("Bois :"+portAlli�.getFlotte().getCalle().getWood());
		lblBois.setBounds(15, 64, 194, 20);
		panel.add(lblBois);
		
		JLabel lblNourriture = new JLabel("Nourriture :"+portAlli�.getFlotte().getCalle().getFood());
		lblNourriture.setBounds(15, 88, 188, 20);
		panel.add(lblNourriture);
		
		JLabel lblMetaux = new JLabel("M\u00E9taux :"+portAlli�.getFlotte().getCalle().getSteel());
		lblMetaux.setBounds(15, 113, 194, 20);
		panel.add(lblMetaux);
		
		JLabel lblNewLabel = new JLabel("Capacit\u00E9 disponible: "+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
		lblNewLabel.setBounds(15, 166, 176, 28);
		panel.add(lblNewLabel);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Choississez votre marchandise", "Or", "Bois", "M\u00E9taux", "Nourriture"}));
		comboBox.setBounds(15, 33, 245, 40);
		contentPane.add(comboBox);
		
		
		//Ajouter une marchandise
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portAlli�.getFlotte().getCalle().AjouterOr(100);
				}
				
				if(comboBox.getSelectedIndex()==2) {
					portAlli�.getFlotte().getCalle().AjouterWood(100);
				}
				
				if(comboBox.getSelectedIndex()==3) {
					portAlli�.getFlotte().getCalle().AjouterSteel(100);
				}
				
				if(comboBox.getSelectedIndex()==4) {
					portAlli�.getFlotte().getCalle().AjouterFood(100);
				}
				
				lbGold.setText("Or: "+ portAlli�.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAlli�.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAlli�.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAlli�.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
			}
		});
		btnNewButton.setBounds(153, 150, 134, 40);
		contentPane.add(btnNewButton);
		
		
		//Supprimer une marchandise
		JButton btnSupprimerUnNavire = new JButton("Supprimer");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==1) {
					portAlli�.getFlotte().getCalle().SupprimerOr(100);
				}
				if(comboBox.getSelectedIndex()==2) {
					portAlli�.getFlotte().getCalle().SupprimerWood(100);
				}
				if(comboBox.getSelectedIndex()==3) {
					portAlli�.getFlotte().getCalle().SupprimerSteel(100);
				}
				if(comboBox.getSelectedIndex()==4) {
					portAlli�.getFlotte().getCalle().SupprimerFood(100);
				}
				lbGold.setText("Or: "+ portAlli�.getFlotte().getCalle().getOr());
				lblBois.setText("Bois : "+portAlli�.getFlotte().getCalle().getWood());
				lblNourriture.setText("Nourriture : "+portAlli�.getFlotte().getCalle().getFood());
				lblMetaux.setText("Metaux : "+portAlli�.getFlotte().getCalle().getSteel());
				lblNewLabel.setText("Capacit� disponible : "+(portAlli�.getFlotte().getCalle().getCapacit�Totale()-portAlli�.getFlotte().getCalle().getCapacit�()));
			}
		});
		btnSupprimerUnNavire.setBounds(4, 150, 134, 40);
		contentPane.add(btnSupprimerUnNavire);
		
		JButton btnNewButton_1 = new JButton("Marchandise pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PortAllie modif= new PortAllie(portAlli�);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(455, 267, 164, 37);
		contentPane.add(btnNewButton_1);
		

	}
}
