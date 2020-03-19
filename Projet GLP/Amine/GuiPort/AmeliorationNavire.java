package GuiPort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import DonnéesPort.Flotte;
import DonnéesPort.Villes;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAllié;

import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class AmeliorationNavire extends JFrame {
	
	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private static int CompteurATT=0;
	private static int CompteurTransport=0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmeliorationNavire window = new AmeliorationNavire(new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,10000,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport));
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AmeliorationNavire(PortAllié portAllié) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("Am\\u00E9lioration des navires");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 180, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(183, 16, 230, 140);
		contentPane.add(panel);
		
		JLabel lblStatistiquesDuNavire = new JLabel("Statistiques du navire");
		lblStatistiquesDuNavire.setBounds(15, 16, 230, 20);
		panel.add(lblStatistiquesDuNavire);
		
		JLabel label_1 = new JLabel("Attaque :");
		label_1.setBounds(15, 41, 194, 20);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Sante :");
		label_2.setBounds(15, 59, 194, 20);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Consommation :");
		label_3.setBounds(15, 77, 188, 20);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Transport :");
		label_4.setBounds(15, 95, 194, 20);
		panel.add(label_4);
		
		
		JButton button = new JButton("Flotte pr\u00EAte");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PortAllie modif= new PortAllie(portAllié);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(296, 205, 117, 23);
		contentPane.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Navire d'Attaque", "Navire de Transport"}));
		comboBox.setBounds(15, 16, 144, 40);
		contentPane.add(comboBox);
		
		JButton btnAmeliorerLeNavire = new JButton("Ameliorer le navire");
		btnAmeliorerLeNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0) {
				if(portAllié.getDonnéesPort().getGold()>=portAllié.getNavireATT().getPrix()) {
					portAllié.AméliorerNavireAttaque();
					label_1.setText("Attaque : "+portAllié.getNavireATT().getAttaque()+" le niveau "+portAllié.getNavireATT().getNiveau());
					label_2.setText("Sante : "+portAllié.getNavireATT().getSante());
					label_3.setText("Consommation : "+portAllié.getNavireATT().getConsommation());
					label_4.setText("Transport : "+portAllié.getNavireATT().getCapacité());
					CompteurATT++;
				}
				}
				else {
					if(portAllié.getDonnéesPort().getGold()>=portAllié.getNavireTransport().getPrix()) {
					portAllié.AméliorerNavireTransport();
					label_1.setText("Attaque : "+portAllié.getNavireTransport().getAttaque());
					label_2.setText("Sante : "+portAllié.getNavireTransport().getSante());
					label_3.setText("Consommation : "+portAllié.getNavireTransport().getConsommation());
					label_4.setText("Transport : "+portAllié.getNavireTransport().getCapacité());
					CompteurTransport++;
					}
				}
				
			}
		});
		btnAmeliorerLeNavire.setBounds(15, 105, 153, 40);
		contentPane.add(btnAmeliorerLeNavire);
	}

}
