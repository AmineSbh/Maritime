package utils;

import entity.Entity;

public class AABB {
	
	private Vector2f pos;
	private float xOffset;
	private float yOffset;
	private float w;
	private float h;
	private float r;
	private float size;
	private Entity e;
	
	public AABB (Vector2f pos, int w, int h) {
		this.pos = pos;
		this.w = w;
		this.h = h;
		
		size = Math.max(w, h);
	}
	
	public AABB (Vector2f pos, int r, Entity e) {
		this.pos = pos;
		this.r = r;
		this.e = e;
		size = r;
	}
	
	public void setxOffset (float x) {xOffset = x;} ;
	public void setyOffset (float y) {yOffset = y;} ;

	public boolean collides (AABB bBox) {
		float ax = ((pos.getworldVar().x + (xOffset)) + (w/2));
		float ay = ((pos.getworldVar().y + (yOffset)) + (h/2));
		float bx = ((bBox.pos.getworldVar().x + (bBox.xOffset / 2)) + (w/2));
		float by = ((bBox.pos.getworldVar().y + (bBox.yOffset / 2)) + (h/2));
		
		if (Math.abs(ax - bx) < (this.w / 2) + (bBox.w / 2)) {
			if (Math.abs(ay - by) < (this.h / 2) + (bBox.h / 2)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean colCircleBox (AABB aBox) {
		float cx = (float) (pos.getworldVar().x + r/Math.sqrt(2) - e.getSize() / Math.sqrt(2));
		float cy = (float) (pos.getworldVar().y + r/Math.sqrt(2) - e.getSize() / Math.sqrt(2));
		
		float xDelta = cx - Math.max(aBox.pos.getworldVar().x + (aBox.w / 2), Math.min(cx, aBox.pos.getworldVar().x));
		float yDelta = cy - Math.max(aBox.pos.getworldVar().y + (aBox.w / 2), Math.min(cy, aBox.pos.getworldVar().y));
		
		if ((xDelta * xDelta + yDelta * yDelta) < ((this.r / Math.sqrt(2)) * (this.r / Math.sqrt(2)))) { 
			return true;
		}
		return false;
	}
	
	
	
}
