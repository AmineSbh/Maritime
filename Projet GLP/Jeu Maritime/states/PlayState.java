package states;

import java.awt.Color;
import java.awt.Graphics2D;
import utils.MouseHandler;
import tiles.TileManager;

public class PlayState extends GameState {
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		new TileManager("carte.xml");
		
	}
	
	public void update() {
	}
	public void input(MouseHandler mouse) {
	}
	public void render(Graphics2D g) {
		g.setColor(Color.red);
		g.fillRect(100, 100, 64, 64);
	}
}
