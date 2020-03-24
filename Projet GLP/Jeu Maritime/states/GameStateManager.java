package states;
import java.awt.Graphics2D;
import java.util.ArrayList;

import def.GamePanel;
import utils.MouseHandler;
import utils.Vector2f;

public class GameStateManager {
	
	private ArrayList<GameState> states;
	
	public static Vector2f map;
	
	public static final int PLAY = 0;
	public static final int MENU = 1;
	public static final int PAUSE = 2;
	public static final int GAMEOVER = 3;
	
	
	
	
	public GameStateManager() {
		
		map = new Vector2f(GamePanel.WIDTH,GamePanel.HEIGHT);
		Vector2f.setWorldVar(map.x, map.y);
		states = new ArrayList<GameState>();
		states.add(new PlayState(this));

	}
	
	public void pop(int state) {
		states.remove(state);
	}
	
	public void add(int state) {
		if (state == PLAY) {
			states.add(new PlayState(this));
		}
		if (state == MENU) {
			states.add(new MenuState(this));
		}
		if (state == PAUSE) {
			states.add(new PauseState(this));
		}
		if (state == GAMEOVER) {
			states.add(new GameOverState(this));
		}
	}
	
	public void addAndpop(int state) {
		states.remove(0);
		add(state);
	}
	
	
	public void update() {
		Vector2f.setWorldVar(map.x, map.y);
		for (int i = 0; i< states.size(); i++) {
			states.get(i).update();
		}
	}
	
	public void input(MouseHandler mouse) {
		for (int i = 0; i< states.size(); i++) {
			states.get(i).input(mouse);
		}
	}
	
	public void render(Graphics2D g) {
		for (int i = 0; i< states.size(); i++) {
			states.get(i).render(g);
		}
	}
	
	
	
	
	

}