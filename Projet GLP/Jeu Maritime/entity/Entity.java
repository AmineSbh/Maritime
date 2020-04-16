package entity;

import graphics.Sprite;
import utils.AABB;
import utils.Vector2f;

public abstract class Entity {
	
	private final int UP = 0;
	private final int LEFT = 0;
	private final int RIGHT = 0;
	private final int DOWN = 0;
	
	
	protected Sprite sprite;
	protected Vector2f pos;
	protected int size;
	
	protected boolean up;
	protected boolean down;
	protected boolean right;
	protected boolean left;
	
	protected AABB hitBounds;
	protected AABB bounds;
	
	
	public Entity(Sprite sprite, Vector2f origin, int size) {
		this.sprite = sprite;
		pos = origin;
		this.size = size;
		
		bounds = new AABB(origin, size, size);
		hitBounds = new AABB (new Vector2f(origin.x + size/2, origin.y),size,size );
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
	
	
	
	
	
	public int getSize () {return size;}
}
