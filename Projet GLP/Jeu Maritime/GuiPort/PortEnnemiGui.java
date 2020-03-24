package GuiPort;
	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

import DonnéesPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAllié;
import Port.PortEnnemi;

	import java.awt.Color;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.SwingConstants;
	import java.awt.Font;

import javax.swing.ImageIcon;
	import javax.swing.UIManager;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class PortEnnemiGui extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private static NavireAttaque navireATT=new NavireAttaque();
		private static NavireTransport navireTransport =new NavireTransport();
		private static Flotte flotte= new Flotte();
		private PortAllié portAllié;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PortEnnemiGui frame = new PortEnnemiGui(new PortEnnemi("Perse",20000,15000,5000,7000,2000,3,flotte,navireATT, navireTransport),flotte);
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
		public PortEnnemiGui(PortEnnemi portEnnemi,Flotte flotte) {
			PortEnnemi a= new PortEnnemi("Perse",20000,3000,5000,7000,2000,4,flotte,navireATT, navireTransport);
			setResizable(false);
			setTitle(a.getDonnéesPort().getName());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 600, 400);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(230, 230, 250));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JButton btnNewButton = new JButton("Attaquer le port");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Bataille a = new Bataille();
					a.setVisible(true);
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton.setBounds(10, 261, 164, 55);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("N\u00E9gocier l'achat");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					Négociation b= new Négociation(portEnnemi,flotte);
					b.setVisible(true);
					
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_1.setBounds(210, 261, 164, 55);
			contentPane.add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Acheter des ressources");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					//Marché c= new Marché();
					//c.setVisible(true);
				}
			});
			btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_2.setBounds(410, 261, 164, 55);
			contentPane.add(btnNewButton_2);
			
			JButton btnNewButton_3 = new JButton("Quitter le port");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			btnNewButton_3.setBounds(464, 338, 120, 23);
			contentPane.add(btnNewButton_3);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(230, 230, 250));
			panel.setBounds(64, 40, 438, 160);
			contentPane.add(panel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PortEnnemiGui.class.getResource("/res/Perse.jpg")));
			panel.add(lblNewLabel_1);
			
			JLabel lblAthnes = new JLabel(a.getDonnéesPort().getName());
			lblAthnes.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 22));
			lblAthnes.setHorizontalAlignment(SwingConstants.CENTER);
			lblAthnes.setBounds(10, 11, 182, 30);
			contentPane.add(lblAthnes);
			
			JLabel lblDescriptionDeLa = new JLabel("Description de la ville : Voici la grande cité de Perse");
			lblDescriptionDeLa.setVerticalAlignment(SwingConstants.TOP);
			lblDescriptionDeLa.setBounds(50, 211, 467, 43);
			contentPane.add(lblDescriptionDeLa);
			
			JLabel lblNewLabel = new JLabel("Valeur estim\u00E9e du port : " + a.getDonnéesPort().getValeurVille());
			lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel.setBounds(313, 14, 236, 30);
			contentPane.add(lblNewLabel);
			
			JLabel lblLeNiveauDu = new JLabel("Le niveau du port est: " + a.getDonnéesPort().getLevel());
			lblLeNiveauDu.setBounds(313, 11, 189, 14);
			contentPane.add(lblLeNiveauDu);
		}
	}

