package utils;

public class Vector2f {
	
	
	public float x;
	public float y;
	
	public static float worldx;
	public static float worldy;
	
	public Vector2f() {
		x = 0;
		y = 0;
	}
	
	public Vector2f(Vector2f pos) {
		new Vector2f (pos.x,pos.y);
	}
	
	public Vector2f(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public void addX(float i) {x =+ i;};
	public void addy(float i) {y =+ i;};
	
	public void setx (float i) {x = i;};
	public void sety (float i) {y = i;};

}
