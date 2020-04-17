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

public class TestCarte extends JFrame {

	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static int CompteurATT=0;
	private static int CompteurTransport=0;
	
	//static PortAllié portAllié= new PortAllié("Perse",20000,3000000,50000,7000,2000,4,flotte,navireATT, navireTransport);
	private JPanel contentPane;
	
	private Moteur moteur=new Moteur();
	
	public TestCarte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("Construction de la flotte avant le départ ");
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
		
		JButton btnNewButton_1 = new JButton("Flotte pr\u00EAte"+moteur.getEnCours());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Rome();
				//PortAllie modif= new PortAllie(moteur.getAthenes(),moteur);
				//modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(301, 237, 117, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Flotte pr\u00EAte"+moteur.getEnCours());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Athenes();
				//PortAllie modif= new PortAllie(moteur.getAthenes(),moteur);
				//modif.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(200, 237, 100, 23);
		contentPane.add(btnNewButton_2);
		

	}
}

