package GuiPort;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AmeliorationNavire window = new AmeliorationNavire(new PortAllié(Villes.Athenes,Villes.valeurDeLaVilleAthenes,4000,Villes.woodAthenes,Villes.steelAthenes,Villes.foodAthenes,Villes.levelAthenes,flotte,navireATT, navireTransport));
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public AmeliorationNavire(PortAllié portAllié,Moteur moteur) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 371);
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
		panel.setBounds(230, 16, 230, 140);
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
		
		JLabel label_4 = new JLabel("Capacité :");
		label_4.setBounds(15, 95, 194, 20);
		panel.add(label_4);
		
		//Panel information
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 190, 445, 86);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAmelioTransport = new JLabel("Coût amélioration navire de transport pour le niveau "+portAllié.getNavireTransport().getNiveau()+" est: "+portAllié.getNavireTransport().getPrix());
		lblAmelioTransport.setBounds(15, 5, 375, 20);
		panel_1.add(lblAmelioTransport);
		
		JLabel lblAmelioATT = new JLabel("Coût amélioration navire d'attaque pour le niveau "+portAllié.getNavireATT().getNiveau()+" est: "+portAllié.getNavireATT().getPrix());
		lblAmelioATT.setBounds(15, 30, 375, 20);
		panel_1.add(lblAmelioATT);
		
		JLabel lblOrDisponible = new JLabel("or disponible: "+portAllié.getDonnéesPort().getGold());
		lblOrDisponible.setBounds(15, 55, 270, 20);
		panel_1.add(lblOrDisponible);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Navire d'Attaque", "Navire de Transport"}));
		comboBox.setBounds(15, 16, 159, 40);
		contentPane.add(comboBox);
		
		JButton btnAmeliorerLeNavire = new JButton("Ameliorer le navire");
		btnAmeliorerLeNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex()==0) {
						if(portAllié.getNavireATT().getNiveau()<4 && portAllié.getDonnéesPort().getGold()>=portAllié.getNavireATT().getPrix()) {
							portAllié.AméliorerNavireAttaque();
							lblStatistiquesDuNavire.setText("Statistiques du navire : Attaque");
							label_1.setText("Attaque : "+portAllié.getNavireATT().getAttaque());
							label_2.setText("Sante : "+portAllié.getNavireATT().getSante());
							label_3.setText("Consommation : "+portAllié.getNavireATT().getConsommation());
							label_4.setText("Capacité : "+portAllié.getNavireATT().getCapacité());
							lblAmelioTransport.setText("Coût amélioration navire de transport pour le niveau "+portAllié.getNavireTransport().getNiveau()+" est: "+portAllié.getNavireTransport().getPrix());
							lblAmelioATT.setText("Coût amélioration navire d'attaque pour le niveau "+portAllié.getNavireATT().getNiveau()+" est: "+portAllié.getNavireATT().getPrix());
							lblOrDisponible.setText("or disponible: "+portAllié.getDonnéesPort().getGold());
						}
				}
				else {
						if(portAllié.getNavireTransport().getNiveau()<4 && portAllié.getDonnéesPort().getGold()>=portAllié.getNavireTransport().getPrix()) {
							portAllié.AméliorerNavireTransport();
							lblStatistiquesDuNavire.setText("Statistiques du navire : Transport");
							label_1.setText("Attaque : "+portAllié.getNavireTransport().getAttaque());
							label_2.setText("Sante : "+portAllié.getNavireTransport().getSante());
							label_3.setText("Consommation : "+portAllié.getNavireTransport().getConsommation());
							label_4.setText("Capacité : "+portAllié.getNavireTransport().getCapacité());
							lblAmelioTransport.setText("Coût amélioration navire de transport pour le niveau "+portAllié.getNavireTransport().getNiveau()+" est: "+portAllié.getNavireTransport().getPrix());
							lblAmelioATT.setText("Coût amélioration navire d'attaque pour le niveau "+portAllié.getNavireATT().getNiveau()+" est: "+portAllié.getNavireATT().getPrix());
							lblOrDisponible.setText("or disponible: "+portAllié.getDonnéesPort().getGold());
						}
				}
			}
		});
		btnAmeliorerLeNavire.setBounds(15, 101, 159, 40);
		contentPane.add(btnAmeliorerLeNavire);
		
		JButton button = new JButton("Flotte pr\u00EAte");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				moteur.setAthenes(portAllié);
				PortAllie modif= new PortAllie(portAllié,moteur);
				modif.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(386, 292, 117, 23);
		contentPane.add(button);
	}
}
