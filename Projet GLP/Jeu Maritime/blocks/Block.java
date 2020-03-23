package blocks;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import utils.Vector2f;

public abstract class Block {
	protected int w;
	protected int h;
	
	protected BufferedImage img;
	protected Vector2f pos;
	
	public Block(BufferedImage img, Vector2f pos, int w, int h) {
		this.img = img;
		this.pos = pos;
		this.h = h;
		this.w = w;
	}
	
	//public abstract boolean update(AABB p);//
	
	public void render (Graphics2D g) {
		g.drawImage(img, (int) pos.getworldVar().x, (int) pos.getworldVar().y, w, h, null);
	}
}
