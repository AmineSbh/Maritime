package states;

import java.awt.Graphics2D;

import entity.Player;
import graphics.Sprite;
import utils.KeyHandler;
import utils.MouseHandler;
import utils.Vector2f;
import tiles.TileManager;

public class PlayState extends GameState {
	
	private Player player;
	private TileManager tm;
	
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		tm = new TileManager("tile/carte.xml");
		player = new Player (new Sprite("res/bateau.png"), new Vector2f (300,300), 32);
	}
	
	public void update() {
		player.update();
	}
	
	
	public void input(MouseHandler mouse,KeyHandler key) {
		player.input(mouse, key);
	}
	
	public void render(Graphics2D g) {
		tm.render(g);
		player.render(g);
	}
}
