package evenements;

import ville.Ports;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class ConstructionFlotte extends JFrame {

	static Ports a= new Ports("Perse",20000,3000,5000,7000,2000,4);
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConstructionFlotte frame = new ConstructionFlotte(a);
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
	public ConstructionFlotte(Ports a) {
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
		panel.setBounds(28, 11, 230, 140);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Navire disponible: "+ a.getLevel());
		lblNewLabel.setBounds(285, 11, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblStatistiquesDeLa = new JLabel("Composition de la Flotte");
		panel.add(lblStatistiquesDeLa);
		
		JButton btnNewButton = new JButton("Ajouter un Navire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a.getLevel()>0)
				a.setLevel(a.getLevel()-1);
				lblNewLabel.setText("Navire disponible: "+ a.getLevel());
			}
		});
		btnNewButton.setBounds(10, 180, 153, 40);
		contentPane.add(btnNewButton);
		
		JButton btnSupprimerUnNavire = new JButton("Supprimer un Navire");
		btnSupprimerUnNavire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a.getLevel()<4)
				a.setLevel(a.getLevel()+1);
				lblNewLabel.setText("Navire disponible: "+ a.getLevel());
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
