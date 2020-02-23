package evenements;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class bataille extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bataille frame = new bataille();
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
	public bataille() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 751, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Abordage");
		btnNewButton.setBounds(201, 365, 123, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Tirs de canon");
		btnNewButton_1.setBounds(48, 365, 123, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Repositionnement");
		btnNewButton_2.setBounds(27, 416, 123, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Fuite");
		btnNewButton_3.setBounds(175, 416, 123, 35);
		contentPane.add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 25, 628, 307);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(371, 365, 305, 86);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
