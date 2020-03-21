package graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import utils.Vector2f;

public class Font {
	
	private BufferedImage FONTSHEET = null;
	private BufferedImage[][] spriteArray;
	private final int TILE_SIZE = 32;
	public int w;
	public int h;
	private int wLetter;
	private int hLetter;
	
	public Font(String file) {
		w = TILE_SIZE;
		h = TILE_SIZE;
		
		System.out.println("Loading" + file);
		FONTSHEET = loadSprite(file);
		
		wLetter = FONTSHEET.getWidth() / w;
		hLetter = FONTSHEET.getHeight() / h;
		loadSpriteArray();
	}
	
	public Font (String file, int w, int h) {
		this.w = w;
		this.h = h;
		
		System.out.println("Loading" + file);
		FONTSHEET = loadSprite(file);
		
		wLetter = FONTSHEET.getWidth() / w;
		hLetter = FONTSHEET.getHeight() / h;
		loadSpriteArray();
	}
	
	public void setSize(int width,int height) {
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(int i) {
		w  = i;
		wLetter = FONTSHEET.getWidth() / w;
	}
	
	public void setHeight(int i) {
		h  = i;
		hLetter = FONTSHEET.getHeight() / h;
	}
	
	public int getWidth () {return w;}
	public int getHeight () {return h;}
	
	private BufferedImage loadSprite(String file) {
		BufferedImage sprite = null;
		try {
			sprite = ImageIO.read(getClass().getClassLoader().getResourceAsStream(file));
		} catch (Exception e) {
			System.out.println ("ERROR: Could not load file:" + file);
		}
		return sprite;
	}
	
	public void loadSpriteArray() {
		spriteArray = new BufferedImage[wLetter][hLetter];
		
		for (int x = 0; x < wLetter; x++) {
			for (int y = 0; y < wLetter; y++) {
				spriteArray[x][y] = getLetter(x,y);
			}
		}
	}
	
	public BufferedImage getFontSheet() {return FONTSHEET;}
	public BufferedImage getLetter(int x, int y) {
		return FONTSHEET.getSubimage(x * w, y * h,w,h);
		}
	public BufferedImage getFont(char letter) {
		int value = letter;
		
		int x = value % wLetter;
		int y = value / hLetter;
		
		return FONTSHEET.getSubimage(x, y, h, w);
	}
	
	

	
	public static void DrawArray (Graphics2D g, ArrayList<BufferedImage> img, Vector2f pos, int width, int height, int xOffset, int yOffset) {
		float x = pos.x;
		float y = pos.y;
		
		for (int i = 0; i < img.size(); i++) {
			if (img.get(i) != null) {
				g.drawImage(img.get(i), (int) x, (int) y, width, height, null) ;
			}
			x += xOffset;
			y += yOffset;
		}
	}
	
	public static void DrawArray (Graphics2D g, Font f, String word, Vector2f pos, int width, int height, int xOffset, int yOffset) {
		float x = pos.x;
		float y = pos.y;
		
		for (int i = 0; i < word.length(); i++ ) {
			if (word.charAt(i) != 32) {
				g.drawImage(f.getFont(word.charAt(i)), (int) x, (int) y, width, height, null);
			}
		}
	}
}










