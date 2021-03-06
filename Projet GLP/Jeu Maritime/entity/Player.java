package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import graphics.Sprite;
import states.PlayState;
import utils.KeyHandler;
import utils.MouseHandler;
import utils.Vector2f;

public class Player extends Entity{

	public Player(Sprite sprite, Vector2f origin, int size) {
		super(sprite, origin, size);
	}

	public void move() {
		if (up) {
			dy -= acc;
			if (dy < -maxSpeed) {
				dy = -maxSpeed;
			}
		} else {
			if (dy < 0) {
				dy += deacc;
				if(dy >0) {
					dy = 0;
				}
			}
		}
		if (down) {
			dy += acc;
			if (dy > maxSpeed) {
				dy = maxSpeed;
			}
		} else {
			if (dy > 0) {
				dy -= deacc;
				if(dy < 0) {
					dy = 0;
				}
			}
		}
		if (left) {
			dx -= acc;
			if (dx < -maxSpeed) {
				dx = -maxSpeed;
			}
		} else {
			if (dx < 0) {
				dx += deacc;
				if(dx >0) {
					dx = 0;
				}
			}
		}
		if (right) {
			dx += acc;
			if (dx > maxSpeed) {
				dx = maxSpeed;
			}
		} else {
			if (dx > 0) {
				dx -= deacc;
				if(dx <0) {
					dx = 0;
				}
			}
		}
	}
		
	
	public void update() {
		super.update();
		move();
		if (!bounds.collisionTile(dx, 0)) {
			pos.x += dx;
		}
		if (!bounds.collisionTile(0, dy)) {
			pos.y += dy;
		}
		pos.x += dx;
		pos.y += dy;
	}

	public void render (Graphics2D g) {
		g.drawImage(ani.getImage(), (int) (pos.getworldVar().x), (int) (pos.getworldVar().y), size,size, null);
	}
	
	public void input (MouseHandler mouse,KeyHandler key) {
		if (key.up.down) {
			up = true;	
		} else { up = false;
		}
		if (key.down.down) {
			down = true;	
		} else { down = false;
		}
		if (key.left.down) {
			left = true;	
		} else { left = false;
		}
		if (key.right.down) {
			right = true;	
		} else { right = false;
		}
	}
	
}
