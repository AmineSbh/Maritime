package data;

public enum TileType {

	
	Eau("eau", true), Ile ("ile", false),Port ("port", false), Ile2 ("ile2", false);
	
	
	
	String textureName;
	boolean walkable;
	
	TileType (String textureName, boolean walkable) {
		this.textureName = textureName;
		this.walkable = walkable;
	}
}
