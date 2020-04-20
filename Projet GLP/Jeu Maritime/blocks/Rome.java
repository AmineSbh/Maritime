package blocks;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import utils.AABB;
import utils.Vector2f;

public class Rome extends Block {
	
	public Rome (BufferedImage img, Vector2f pos, int w, int h) {
		super(img,pos,w,h);
	}
	
	public boolean update(AABB p) {
		return true;
	}
	
	public void render (Graphics2D g) {
		super.render(g);
	}
	

}
