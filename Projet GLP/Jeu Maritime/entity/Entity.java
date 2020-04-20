package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import graphics.Animation;
import graphics.Sprite;
import utils.AABB;
import utils.KeyHandler;
import utils.MouseHandler;
import utils.Vector2f;

public abstract class Entity {
	
	private final int UP = 3;
	private final int LEFT = 1;
	private final int RIGHT = 2;
	private final int DOWN = 0;
	protected int currentAnimation;
	
	protected Animation ani;
	protected Sprite sprite;
	protected Vector2f pos;
	protected int size;
	
	protected boolean up;
	protected boolean down;
	protected boolean right;
	protected boolean left;
	
	protected float dx;
	protected float dy;
	
	protected float maxSpeed =1f;
	protected float acc = 1f;
	protected float deacc = 0.1f;
	
	protected AABB hitBounds;
	protected AABB bounds;
	
	
	public Entity(Sprite sprite, Vector2f origin, int size) {
		this.sprite = sprite;
		pos = origin;
		this.size = size;
		
		ani = new Animation();
		setAnimation(RIGHT, sprite.getSpriteArray(RIGHT), 10);
		bounds = new AABB(origin, size, size);
		hitBounds = new AABB (new Vector2f(origin.x + size/2, origin.y),size,size );
	}
	
	public void setAnimation(int i, BufferedImage[] frames, int delay) {
		currentAnimation = i;
		ani.setFrames(frames);
		ani.setDelay(delay);
	}
	
	public void animate() {
		if(up) {
			if (currentAnimation != UP || ani.getDelay() != -1) {
				setAnimation(UP, sprite.getSpriteArray(UP), 5);
			}
		}
		else if(down) {
			if (currentAnimation != DOWN || ani.getDelay() != -1) {
				setAnimation(DOWN, sprite.getSpriteArray(DOWN), 5);
			}
		}
		else if(left) {
			if (currentAnimation != LEFT || ani.getDelay() != -1) {
				setAnimation(LEFT, sprite.getSpriteArray(LEFT), 5);
			}
		}
		else if(right) {
			if (currentAnimation != RIGHT || ani.getDelay() != -1) {
				setAnimation(RIGHT, sprite.getSpriteArray(RIGHT), 5);
			}
		}
		else {
			setAnimation (currentAnimation, sprite.getSpriteArray(currentAnimation), -1);
		}
	}
	
	private void setHitBoxDirection () {
		if (up) {
			hitBounds.setxOffset(-size / 2);
			hitBounds.setyOffset(-size / 2);
		}
		else if (down) {
			hitBounds.setxOffset(-size / 2);
			hitBounds.setyOffset(size / 2);
		}
		else if (right) {
			hitBounds.setxOffset(-size);
			hitBounds.setyOffset(0);
		}
		else if (left) {
			hitBounds.setxOffset(0);
			hitBounds.setyOffset(0);
		}
	}
	
	public void update() {
		animate();
		setHitBoxDirection();
		ani.update();
	}
	
	public abstract void render(Graphics2D g);
	public void input(KeyHandler key, MouseHandler mouse) {}
	
	public int getSize () {return size;}
}
