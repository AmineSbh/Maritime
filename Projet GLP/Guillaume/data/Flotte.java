package data;

import org.newdawn.slick.opengl.Texture;
import static helpers.Artist.*;

public class Flotte {
	private int width, height;
	private float x, y;
	private Texture texture;
	private Tile StartTile;
	
	public Flotte (Texture texture, Tile StartTile, int width, int height) {
		this.texture = texture;
		this.x = StartTile.getX();
		this.y = StartTile.getY();
		this.width = width;
		this.height = height;
	}
	
	public void Draw() {
		DrawQuadTex(texture,x,y,width,height);
	}
	
}
