package states;

import java.awt.Graphics2D;

import utils.MouseHandler;
import tiles.TileManager;

public class PlayState extends GameState {
	
	private int mousefirst = 0;
	private TileManager tm;
	
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		tm = new TileManager("tile/carte.xml");
		
	}
	
	public void update() {
	}
	public void input(MouseHandler mouse) {
		if ((mouse.getButton() == 1) && (mousefirst  == 0)) {
			mousefirst += 1;
			System.out.println("Vous avez cliquer sur un port");
		}
            
	}
	public void render(Graphics2D g) {
		tm.render(g);
	}
}
