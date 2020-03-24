package GuiPort;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DonnéesPort.Flotte;
import DonnéesPort.Villes;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAllié;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Bataille extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static NavireAttaque navireATT=new NavireAttaque(2);
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortAllié port=new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,4000,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
					port.AjouterAttaquePort();
					Bataille frame = new Bataille(port,navireATT);
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
	public Bataille(PortAllié portAllie, NavireAttaque navireATT) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 811, 540);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(86, 29, 628, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//panel insertion bateau
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(34, 181, 220, 110);
		panel.add(panel_1);
		
		//panel insertion bateau IA
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(360, 30, 220, 110);
		panel.add(panel_2);
		
		JLabel lblBateau = new JLabel("");
		lblBateau.setIcon(new ImageIcon(Bataille.class.getResource("/res/maritimeimg.jpeg")));
		panel_1.add(lblBateau);
		
		JLabel lblIa = new JLabel("");
		lblIa.setIcon(new ImageIcon(Bataille.class.getResource("/res/maritimeimg.jpeg")));
		panel_2.add(lblIa);
		
		JLabel lblNewLabel = new JLabel("Sant\u00E9: "+portAllie.getFlotte().getSante()+" /"+3000);
		lblNewLabel.setBounds(272, 261, 192, 30);
		panel.add(lblNewLabel);
		
		JLabel lblSantIa = new JLabel("Sant\u00E9 IA: "+navireATT.getSante()+" /"+3000);
		lblSantIa.setBounds(213, 30, 132, 30);
		panel.add(lblSantIa);
	
		
		JButton btnNewButton = new JButton("Abordage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("L'abordage a été tenté!");
			}
		});
		btnNewButton.setBounds(201, 365, 144, 35);
		contentPane.add(btnNewButton);
		
		//attaque on baisse la santé//
		JButton btnNewButton_1 = new JButton("Tirs de canon ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				navireATT.setSante(navireATT.getSante()-portAllie.getFlotte().getAttaque());
				lblSantIa.setText("Sant\u00E9 IA: "+navireATT.getSante()+" /"+3000);
				textField.setText("Le tir de canon à été effectué ! Vous avez effectué "+portAllie.getFlotte().getAttaque()+" de dégats");
				pause();
				portAllie.getFlotte().setSante(portAllie.getFlotte().getSante()-navireATT.getAttaque());
				lblNewLabel.setText("Sant\u00E9: "+portAllie.getFlotte().getSante()+" /"+3000);
				textField.setText("Vous avez été touché! Vous avez prit "+portAllie.getFlotte().getAttaque()+" dégats");
			}
		});
		btnNewButton_1.setBounds(27, 365, 144, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Repositionnement");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("Repositionnement, le prochain tir fera mouche");
			}
		});
		
		btnNewButton_2.setBounds(27, 416, 144, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Fuite");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(201, 416, 144, 35);
		contentPane.add(btnNewButton_3);
	
		
		textField = new JTextField();
		textField.setBounds(384, 365, 363, 86);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	private void pause(){
        try {
         Thread.sleep(5000);
         }  // attendre 5sec 
        catch (InterruptedException e) {
         e.printStackTrace();
         }
       }
}
