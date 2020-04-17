package tiles;

import graphics.Sprite;
import utils.Vector2f;
import java.awt.Graphics2D;
import java.util.HashMap;

import blocks.Athene;
import blocks.Block;
import blocks.LandBlock;
import blocks.LeCaire;
import blocks.ObjBlock;
import blocks.Perse;
import blocks.Rome;
import blocks.Sparte;



public class TileMapObj extends TileMap{

	public static HashMap<String, Block> tmo_blocks;
	
	public TileMapObj (String data, Sprite sprite, int width, int height, int tileWidth, int tileHeight, int tileColumns) {
		Block tempBlock;
		
		tmo_blocks = new HashMap<String, Block>();
		
		String[] block = data.split(",");
		for(int i=0; i < (width * height); i++) {
			int temp = Integer.parseInt (block[i].replaceAll("\\s+",""));
			if(temp != 0) {
				if (temp == 17) {
					tempBlock = new LandBlock(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				else if (temp == 45) {
					tempBlock = new Rome(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				else if (temp == 79) {
					tempBlock = new Athene(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				else if (temp == 80) {
					tempBlock = new LeCaire(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				else if (temp == 95) {
						tempBlock = new Perse(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				else if (temp == 96) {
					tempBlock = new Sparte(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}	
				else {
					tempBlock = new ObjBlock(sprite.getSprite((int) ((temp-1) % tileColumns),(int) ((temp-1) / tileColumns) ),new Vector2f((int) (i % width) * tileWidth, (int) (i / width) * tileHeight) ,tileWidth,tileHeight);
				}
				tmo_blocks.put(String.valueOf((int) (i % width)) + "," + (String.valueOf((int) (i / height))), tempBlock);
			}
		}
	}
	
	public void render(Graphics2D g) {
		for (Block block: tmo_blocks.values()) {
			block.render(g);
		}
	}
}
