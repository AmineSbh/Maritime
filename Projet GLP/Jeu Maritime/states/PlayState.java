package states;

import java.awt.Graphics2D;
import java.util.Timer;
import java.util.TimerTask;

import GuiPort.Moteur;
import entity.Player;
import graphics.Sprite;
import utils.KeyHandler;
import utils.MouseHandler;
import utils.Vector2f;
import tiles.TileManager;

public class PlayState extends GameState {
	
	private Moteur moteur = new Moteur();
	private int fa = 0;
	private int ca = 0;
	private int pa = 0;
	private int ra = 0;
	private int sa = 0;
	
	private Player player;
	private TileManager tm;
	Timer timer = new Timer();
	
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
		if (fa == 0) {
			if (key.Athenes.down) {
				Moteur.Athenes();
				fa++;
			}
		}
		if (ca == 0) {
			if (key.LeCaire.down) {
				Moteur.LeCaire();
				ca++;
			}
		}
		if (ra == 0) {
			if (key.Rome.down) {
				Moteur.Rome();
				ra++;
			}
		}
		if (sa == 0) {
			if (key.Sparte.down) {
				Moteur.Sparte();
				sa++;
			}
		}
		if (pa == 0) {
			if (key.Perse.down) {
				Moteur.Perse();
				pa++;
			}
		}
	}
		

	
	public void render(Graphics2D g) {
		tm.render(g);
		player.render(g);
	}
}
