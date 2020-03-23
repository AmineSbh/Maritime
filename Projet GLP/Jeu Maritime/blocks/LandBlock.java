package blocks;

import java.awt.Color;
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
		g.setColor(Color.green);
		g.drawRect((int) pos.getworldVar().x, (int) pos.getworldVar().y, w, h);
	}
}
