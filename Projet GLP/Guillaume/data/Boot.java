package data;

import org.lwjgl.opengl.Display;
import static helpers.Artist.*;

public class Boot {
	
	public Boot() {
		BeginSession();
		
		int [][] map = {
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
				{0, 0, 0, 0, 0 , 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0 , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				
		};
		
		TileGrid grid = new TileGrid(map);
		grid.SetTile(3, 4, grid.GetTile(2,4).getType());
		Flotte f = new Flotte (QuickLoad("bateau"),grid.GetTile(14, 12),64,64);
		
		
		
		
		while (!Display.isCloseRequested()) { 
			
			grid.Draw();
			f.Draw();
			Display.update();
			Display.sync (60);
			
		}
		Display.destroy();
	}
	public static void main (String args[]) {
		new Boot();
	}

}
 