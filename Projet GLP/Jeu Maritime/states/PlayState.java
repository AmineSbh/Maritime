package states;

import java.awt.Graphics2D;
import utils.MouseHandler;
import tiles.TileManager;

public class PlayState extends GameState {
	
	private TileManager tm;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		tm = new TileManager("util/carte.xml");
		
	}
	
	public void update() {
	}
	public void input(MouseHandler mouse) {
	}
	public void render(Graphics2D g) {
		tm.render(g);
	}
}
