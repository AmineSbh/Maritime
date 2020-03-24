package entity;

import graphics.Sprite;
import utils.Vector2f;

public abstract class Entity {
	
	private final int UP = 0;
	private final int LEFT = 0;
	private final int RIGHT = 0;
	private final int DOWN = 0;
	
	protected Sprite sprite;
	protected Vector2f pos;
	protected int size;
	
	
	public Entity(Sprite sprite, Vector2f origin, int size) {
		this.sprite = sprite;
		pos = origin;
		this.size = size;
		
	}
}
