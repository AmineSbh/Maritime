package entity;

import java.awt.Graphics2D;

import graphics.Sprite;
import utils.KeyHandler;
import utils.MouseHandler;
import utils.Vector2f;

public class Player extends Entity{

	public Player(Sprite sprite, Vector2f origin, int size) {
		super(sprite, origin, size);
	}

	
	
	public void update() {
		super.update;
		move();
	}

	public void render (Graphics2D g) {
	}
	
	public void input (MouseHandler mouse,KeyHandler key) {
		
	}
	
}
