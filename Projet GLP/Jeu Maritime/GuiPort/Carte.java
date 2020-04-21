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

public class Carte extends JFrame {
	
	private JPanel contentPane;
	
	private Moteur moteur=new Moteur();
	
	public Carte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("Construction de la flotte avant le départ ");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Rome");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Rome();
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(267, 195, 131, 36);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("Athenes");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Athenes();
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(63, 195, 121, 36);
		contentPane.add(btnNewButton_2);
		
		
		JButton btnSparte = new JButton("Sparte");
		btnSparte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Sparte();
				setVisible(false);
			}
		});
		btnSparte.setBounds(298, 109, 131, 37);
		contentPane.add(btnSparte);
		
		
		JButton btnLecaire = new JButton("LeCaire");
		btnLecaire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.LeCaire();
				setVisible(false);
			}
		});
		btnLecaire.setBounds(173, 37, 129, 37);
		contentPane.add(btnLecaire);
		
		
		JButton btnPerse = new JButton("Perse");
		btnPerse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.Perse();
				setVisible(false);
			}
		});
		btnPerse.setBounds(15, 94, 135, 38);
		contentPane.add(btnPerse);
		

	}
}

