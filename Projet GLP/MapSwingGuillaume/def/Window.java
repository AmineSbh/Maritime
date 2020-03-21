package def;
import javax.swing.JFrame;

public class Window extends JFrame {

	
	public Window() {
		setTitle("Maritime");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new GamePanel(1600, 896));
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
