package GuiPort;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

 

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.Border;

import javax.swing.border.EmptyBorder;

 

import evenements.ConstructionFlotte;
import ville.Ports;

import java.awt.SystemColor;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.awt.Font;

import javax.swing.border.LineBorder;

import javax.swing.border.SoftBevelBorder;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.Port;
import Port.PortAllié;

import javax.swing.border.BevelBorder;

 
public class PortAllie extends JFrame {
	
	private PortAllié portAllié;
	private JPanel contentPane;
	private static NavireAttaque navireATT=new NavireAttaque(1);
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	
	public static final String NL= System.getProperty("line.separator");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortAllie frame = new PortAllie(new PortAllié("Perse",20000,15000,5000,7000,2000,3,flotte,navireATT, navireTransport));
					frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
						}
				}
			});
		}
	
	public PortAllie(PortAllié portAllié) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 391);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOr = new JLabel("Or : " + portAllié.getDonnéesPort().getGold());
		lblOr.setBounds(452, 47, 172, 21);
		contentPane.add(lblOr);
		
		JLabel lblBois = new JLabel("Bois : " + portAllié.getDonnéesPort().getWood());
		lblBois.setBounds(452, 67, 172, 21);
		contentPane.add(lblBois);
		
		JLabel lblMetaux = new JLabel("Metaux : "+ portAllié.getDonnéesPort().getSteel());
		lblMetaux.setBounds(452, 89, 172, 21);
		contentPane.add(lblMetaux);
		
		JLabel lblNourriture = new JLabel("Nourriture : "+ portAllié.getDonnéesPort().getFood());
		lblNourriture.setBounds(452, 110, 172, 21);
		contentPane.add(lblNourriture);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(27, 47, 367, 118);
		contentPane.add(panel);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(PortAllie.class.getResource("/images/Perse.jpg")));
		panel.add(lblNewLabel_10);
		
		JLabel lblNiveauDuPort = new JLabel("Niveau du port de la ville : "+ portAllié.getDonnéesPort().getLevel());
		lblNiveauDuPort.setBounds(155, 16, 195, 39);
		contentPane.add(lblNiveauDuPort);
		
		//Action du bouton construire une flotte
		JButton btnConstruireFlotte = new JButton("Construire une flotte");
		btnConstruireFlotte.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnConstruireFlotte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Construction flotte= new Construction(portAllié);
				flotte.setLocationRelativeTo(null);
				flotte.setVisible(true);
				setVisible(false);
				}
			});
		
		btnConstruireFlotte.setBounds(27, 240, 146, 50);
		contentPane.add(btnConstruireFlotte);
		
		
		//Action du bouton amelioration navire
		JButton btnMiseLa = new JButton("Am\u00E9liorations navires");
		btnMiseLa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMiseLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AmeliorationNavire flotte= new AmeliorationNavire(portAllié);
				flotte.setLocationRelativeTo(null);
				flotte.setVisible(true);
				setVisible(false);
				}
			});
		
		btnMiseLa.setBounds(339, 240, 146, 50);
		contentPane.add(btnMiseLa);
		
		
		//Action du bouton acheter des ressources
		JButton btnAcheterDesRessources = new JButton("Acheter des ressources");
		btnAcheterDesRessources.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnAcheterDesRessources.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Construction flotte= new Construction(portAllié);
				flotte.setLocationRelativeTo(null);
				flotte.setVisible(true);
				setVisible(false);
				}
			});
		
		btnAcheterDesRessources.setBounds(183, 240, 146, 50);
		contentPane.add(btnAcheterDesRessources);
		
		
		JLabel lblFlotte = new JLabel("Composition de la Flotte : "+(portAllié.getDonnéesPort().getLevel()-portAllié.getBateauxDispo())+" /"+ portAllié.getDonnéesPort().getLevel());
		lblFlotte.setBounds(408, 190, 279, 39);
		contentPane.add(lblFlotte);
		
		JButton btnMiseLa_1 = new JButton("Mise \u00E0 la mer");
		btnMiseLa_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMiseLa_1.setBounds(495, 240, 146, 50);
		contentPane.add(btnMiseLa_1);
		
		JButton btnNewButton = new JButton("Quitter le port");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
			});
		
		btnNewButton.setBounds(546, 318, 121, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPerse = new JLabel("Perse");
		lblPerse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblPerse.setBackground(SystemColor.activeCaption);
		lblPerse.setBounds(35, 14, 172, 33);
		contentPane.add(lblPerse);
		
		JTextArea lblDescriptionDeLa = new JTextArea("Description de la ville: Bienvenue en Perse, " +NL+ "la cité experte en arme métallique");
		lblDescriptionDeLa.setBounds(27, 176, 375, 44);
		contentPane.add(lblDescriptionDeLa);
		lblDescriptionDeLa.setFont(new Font("Monospaced", Font.ITALIC, 14));
		lblDescriptionDeLa.setEditable(false);
		lblDescriptionDeLa.setBackground(SystemColor.activeCaption);
		}

}

