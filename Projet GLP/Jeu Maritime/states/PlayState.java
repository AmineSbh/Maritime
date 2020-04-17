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
		if (key.up.down) {System.out.println ("up"); }
		if (key.left.down) {System.out.println ("left"); }
		if (key.right.down) {System.out.println ("right"); }
		if (key.down.down) {System.out.println ("down"); }
		if (key.enter.down) {System.out.println ("up"); }
		if (key.escape.down) {System.out.println ("up"); }
	}
	
	public void render(Graphics2D g) {
		tm.render(g);
		player.render(g);
	}
}
