package tiles;

import graphics.Sprite;
import utils.Vector2f;
import blocks.NormBlock;
import tiles.TileMapObj;


import java.awt.Graphics2D;
import java.util.ArrayList;
import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class TileManager extends TileMap {
	
	public static ArrayList<TileMap> tm;
	
	
	public TileManager () {
		tm = new ArrayList<TileMap>();
	}
	
	public TileManager (String path) {
		tm = new ArrayList<TileMap>();
		addTileMap(path,32,32);
	}
	
	private void addTileMap(String path, int blockWidth, int blockHeight) {
		
		String imagePath;
		int width = 0;
		int height = 0;
		int tileWidth;
		int tileHeight;
		int tileCount;
		int tileColumns;
		int layers = 0;
		Sprite sprite;
		
		String[] data = new String[10];
		
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(getClass().getClassLoader().getResource(path).toURI()));
            doc.getDocumentElement().normalize();

            NodeList list = doc.getElementsByTagName("tileset");
            Node node = list.item(0);
            Element eElement = (Element) node;

            imagePath = eElement.getAttribute("name");
            tileWidth = Integer.parseInt(eElement.getAttribute("tilewidth"));
            tileHeight = Integer.parseInt(eElement.getAttribute("tileheight"));
            tileColumns =  Integer.parseInt(eElement.getAttribute("columns"));
            tileCount = Integer.parseInt(eElement.getAttribute("tilecount"));
            list = doc.getElementsByTagName("layer");
            layers = list.getLength();
            System.out.println(imagePath);
            sprite = new Sprite("tile/" + imagePath, tileWidth, tileHeight);
            
            
            
            for(int i = 0; i < layers; i++) {
                node = list.item(i);
                eElement = (Element) node;
                if(i <= 0) {
                    width = Integer.parseInt(eElement.getAttribute("width"));
                    height = Integer.parseInt(eElement.getAttribute("height"));
                }

                data[i] = eElement.getElementsByTagName("data").item(0).getTextContent();
                
                if (i >= 1) {
                	tm.add(new TileMapNorm(data[i], sprite, width, height, blockWidth, blockHeight, tileColumns));
                } 
                else if (i == 0) {
                	tm.add(new TileMapObj(data[i], sprite, width, height, blockWidth, blockHeight, tileColumns));
                }
                
            }
        } catch(Exception e) {
        	System.out.println("ERROR: Cannot read the tilemap");
        }
	}
	
	public void render(Graphics2D g) {
		for (int i = 0; i < tm.size(); i++) {
			tm.get(i).render(g);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
