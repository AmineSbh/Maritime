package GuiPort;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Donn�esPort.Flotte;
import Navire.NavireAttaque;
import Navire.NavireTransport;
import Port.PortAlli�;

import java.awt.Color;


import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bataille extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private static NavireAttaque navireATT=new NavireAttaque();
	private static NavireTransport navireTransport =new NavireTransport();
	private static Flotte flotte= new Flotte();
	
	NavireAttaque IA= new NavireAttaque(2);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bataille frame = new Bataille();
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
	public Bataille() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 811, 540);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Abordage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("L'abordage a �t� tent�!");
			}
		});
		btnNewButton.setBounds(201, 365, 144, 35);
		contentPane.add(btnNewButton);
		
		//attaque on baisse la sant�//
		JButton btnNewButton_1 = new JButton("Tirs de canon "+flotte.getSante());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flotte.setSante(flotte.getSante()-IA.getAttaque());
				textField.setText("Le tir de canon � �t� effectu� !"+flotte.getSante());
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
		
		JPanel panel = new JPanel();
		panel.setBounds(86, 29, 628, 307);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(398, 365, 316, 86);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}