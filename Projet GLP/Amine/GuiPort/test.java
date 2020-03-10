package GuiPort;

import Port.Port;
import Port.PortAllié;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DonnéesPort.Flotte;
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

public class test extends JFrame {

	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	
	static PortAllié portAllié= new PortAllié("Perse",20000,3000000,50000,7000,2000,4,flotte,navireATT, navireTransport);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test(new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,Villes.goldAthenes,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport));
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
	public test(PortAllié portAllié) {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		panel.setBounds(28, 11, 230, 140);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Navire disponible: "+ portAllié.getDonnéesPort().getLevel());
		lblNewLabel.setBounds(285, 11, 117, 14);
		contentPane.add(lblNewLabel);
		panel.setLayout(null);
		
		JLabel lblStatistiquesDeLa = new JLabel("Composition de la Flotte");
		lblStatistiquesDeLa.setBounds(15, 16, 230, 20);
		panel.add(lblStatistiquesDeLa);
		
		JLabel lblAttaque = new JLabel("Attaque :");
		lblAttaque.setBounds(15, 41, 194, 20);
		panel.add(lblAttaque);
		
		JLabel lblSante = new JLabel("Sante :");
		lblSante.setBounds(15, 59, 194, 20);
		panel.add(lblSante);
		
		JLabel lblConsommation = new JLabel("Consommation :");
		lblConsommation.setBounds(15, 77, 188, 20);
		panel.add(lblConsommation);
		
		JLabel lblNewLabel_1 = new JLabel("Transport :");
		lblNewLabel_1.setBounds(15, 95, 194, 20);
		panel.add(lblNewLabel_1);
		
		//Ajouter un navire
		JButton btnNewButton = new JButton("Ajouter un Navire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(portAllié.getBateauxDispo()>0)
					portAllié.setBateauxDispo(portAllié.getBateauxDispo()-1);
					portAllié.AjouterAttaquePort();
					lblNewLabel.setText("Navire disponible: "+ portAllié.getBateauxDispo());
					lblAttaque.setText("Attaque : "+portAllié.getFlotte().getAttaque());
					lblSante.setText("Sante : "+portAllié.getFlotte().getSante());
					lblConsommation.setText("Consommation : "+portAllié.getFlotte().getConsommation());
					lblNewLabel_1.setText("Transport : "+portAllié.getFlotte().getCapacité());
			}
		});
		btnNewButton.setBounds(10, 180, 153, 40);
		contentPane.add(btnNewButton);
		
		//Supprimer un navire
		JButton btnSupprimerUnNavire = new JButton("Supprimer un Navire");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(portAllié.getBateauxDispo()<portAllié.getDonnéesPort().getLevel())
					portAllié.SupprimerNavireAttaquePort();
					lblNewLabel.setText("Navire disponible: "+ portAllié.getBateauxDispo());
					lblNewLabel.setText("Navire disponible: "+ portAllié.getBateauxDispo());
					lblAttaque.setText("Attaque : "+portAllié.getFlotte().getAttaque());
					lblSante.setText("Sante : "+portAllié.getFlotte().getSante());
					lblConsommation.setText("Consommation : "+portAllié.getFlotte().getConsommation());
					lblNewLabel_1.setText("Transport : "+portAllié.getFlotte().getCapacité());
			}
		});
		btnSupprimerUnNavire.setBounds(198, 180, 164, 40);
		contentPane.add(btnSupprimerUnNavire);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Navire d'Attaque", "Navire de Transport"}));
		comboBox.setBounds(280, 50, 144, 40);
		contentPane.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Flotte pr\u00EAte");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(301, 237, 117, 23);
		contentPane.add(btnNewButton_1);
		

	}
}
