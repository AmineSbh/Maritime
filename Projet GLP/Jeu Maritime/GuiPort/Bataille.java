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
import Port.PortEnnemi;

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
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortEnnemi port=new PortEnnemi(Villes.Athenes,Villes.valeurDeLaVilleAthenes,4000,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport);
					port.AjouterAttaquePort();
					Bataille frame = new Bataille(port,flotte);
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
	public Bataille(PortEnnemi portEnnemi, Flotte flotte,Moteur moteur) {
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
		panel.setBackground(Color.cyan);
		
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
		
		JLabel lblNewLabel = new JLabel("Sant\u00E9: "+flotte.getSante()+" /"+3000);
		lblNewLabel.setBounds(272, 261, 192, 30);
		panel.add(lblNewLabel);
		
		JLabel lblSantIa = new JLabel("Sant\u00E9 IA: "+portEnnemi.getFlotte().getSante()+" /"+3000);
		lblSantIa.setBounds(213, 30, 132, 30);
		panel.add(lblSantIa);
	
		
		JButton btnNewButton = new JButton("Abordage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c=(int) Math.random();
				if(c==0) {
					textField.setText("L'abordage a été reussi");
					flotte.getCalle().setOr(flotte.getCalle().getOr()+500);
					portEnnemi.getFlotte().getCalle().setOr(0);
				}
				if(c==1) {
					textField.setText("L'abordage a été rater");
					flotte.getCalle().setOr(flotte.getCalle().getOr()+500);
					portEnnemi.getFlotte().getCalle().setOr(0);
				}
			}
		});
		btnNewButton.setBounds(201, 365, 144, 35);
		contentPane.add(btnNewButton);
		
		//attaque on baisse la santé//
		JButton btnNewButton_1 = new JButton("Tirs de canon ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				portEnnemi.getFlotte().setSante(portEnnemi.getFlotte().getSante()-flotte.getAttaque());
				lblSantIa.setText("Sant\u00E9 IA: "+portEnnemi.getFlotte().getSante()+" /"+3000);
				textField.setText("Le tir de canon à été effectué ! Vous avez effectué "+flotte.getAttaque()+" de dégats");
				int a;
				int repositionnementAllie=0;
				int repositionnementEnnemi=0;
				a=(int) Math.random()*(5-3);
				if(a == 0) {
					if (repositionnementEnnemi==1) {
						flotte.setSante(flotte.getSante()-(portEnnemi.getFlotte().getAttaque()*3));
						if(flotte.getSante()<=0) {
							if(portEnnemi.getDonnéesPort().getName()=="Athenes") {
		                    	moteur.setAppartenanceAthenes(1);
		                        moteur.getAthenes().setFlotte(flotte);
		                        moteur.getRome().setFlotte(flotte);
		                        moteur.getSparte().setFlotte(flotte);
		                        moteur.getLeCaire().setFlotte(flotte);
		                        moteur.getPerse().setFlotte(flotte);
		    				}
		    				if(portEnnemi.getDonnéesPort().getName()=="Rome") {
		    					moteur.setAppartenanceRome(1);
		    					moteur.getAthenes().setFlotte(flotte);
		                        moteur.getRome().setFlotte(flotte);
		                        moteur.getSparte().setFlotte(flotte);
		                        moteur.getLeCaire().setFlotte(flotte);
		                        moteur.getPerse().setFlotte(flotte);
		    				}
		    				if(portEnnemi.getDonnéesPort().getName()=="LeCaire") {
		    					moteur.setAppartenanceLeCaire(1);
		    					moteur.getAthenes().setFlotte(flotte);
		                        moteur.getRome().setFlotte(flotte);
		                        moteur.getSparte().setFlotte(flotte);
		                        moteur.getLeCaire().setFlotte(flotte);
		                        moteur.getPerse().setFlotte(flotte);
		    				}
		    				if(portEnnemi.getDonnéesPort().getName()=="Sparte") {
		    					moteur.setAppartenanceSparte(1);
		    					moteur.getAthenes().setFlotte(flotte);
		                        moteur.getRome().setFlotte(flotte);
		                        moteur.getSparte().setFlotte(flotte);
		                        moteur.getLeCaire().setFlotte(flotte);
		                        moteur.getPerse().setFlotte(flotte);
		    				}
		    				if(portEnnemi.getDonnéesPort().getName()=="Perse") {
		    					moteur.setAppartenancePerse(1);
		    					moteur.getAthenes().setFlotte(flotte);
		                        moteur.getRome().setFlotte(flotte);
		                        moteur.getSparte().setFlotte(flotte);
		                        moteur.getLeCaire().setFlotte(flotte);
		                        moteur.getPerse().setFlotte(flotte);
		    				}
						}
						lblNewLabel.setText("Sant\u00E9: "+flotte.getSante()+" /"+3000);
						textField.setText("Vous avez été touché! Vous avez pris "+(portEnnemi.getFlotte().getAttaque()*2)+" dégats");
						repositionnementEnnemi=0;
					}else {
						flotte.setSante(flotte.getSante()-portEnnemi.getFlotte().getAttaque());
						lblNewLabel.setText("Sant\u00E9: "+flotte.getSante()+" /"+3000);
						textField.setText("Vous avez été touché! Vous avez pris "+portEnnemi.getFlotte().getAttaque()+" dégats");
					}
				}
				
				else if(a == 1) {
					repositionnementEnnemi=1;
					textField.setText("L'ennemi se repositionne, attention !");
				}
				
				else if(a == 2) {
					if(flotte.getCalle().getOr()>1000) {
					flotte.getCalle().setOr(flotte.getCalle().getOr()-1000);
					textField.setText("L'ennemi vous a piller des ressources !");
					}
					else {
					textField.setText("Rien de spécial s'est passé");
					}
				}
				pause();
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
				setVisible(false);
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
         Thread.sleep(2000);
         }  // attendre 2sec 
        catch (InterruptedException e) {
         e.printStackTrace();
         }
       }
}