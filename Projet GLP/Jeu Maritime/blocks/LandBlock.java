package blocks;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import utils.Vector2f;

public class LandBlock extends Block {

	public LandBlock (BufferedImage img, Vector2f pos, int w, int h) {
		super(img,pos,w,h);
	}
	
	/* public boolean update(AABB p) {
		return false;
	} */
	
	public void render (Graphics2D g) {
		super.render(g);
	}
}
