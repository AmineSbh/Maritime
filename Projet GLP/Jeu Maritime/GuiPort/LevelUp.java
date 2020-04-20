package GuiPort;

import Port.Port;
import Port.PortAlli�;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

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

public class LevelUp extends JFrame {
	
	private JPanel contentPane;

	public LevelUp(PortAlli� portAlli�, Moteur moteur) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("Level up du port");
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
		
		JButton button = new JButton("Retour au port");
		button.addActionListener(new ActionListener() {
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
		button.setBounds(200, 237, 100, 23);
		contentPane.add(button);
		

	}
}

