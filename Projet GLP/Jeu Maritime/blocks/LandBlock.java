package blocks;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import utils.AABB;
import utils.Vector2f;

public class LandBlock extends Block {

	public LandBlock (BufferedImage img, Vector2f pos, int w, int h) {
		super(img,pos,w,h);
	}
	
	public boolean update(AABB p) {

		return true;
	}
	
	private boolean isInside (AABB p) {
		if (p.getpos().x + p.getxOffset() < pos.x) return false;
		if (p.getpos().y + p.getyOffset() < pos.y) return false;
		if (w + pos.x < p.getWidth() + p.getpos().x + p.getxOffset()) return false;
		if (h + pos.y < p.getHeight() + p.getpos().y + p.getyOffset()) return false;
		return true;
	}
	
	public void render (Graphics2D g) {
		super.render(g);
	}
}
