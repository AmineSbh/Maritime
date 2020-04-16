package utils;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import def.GamePanel;
 

public class KeyHandler implements KeyListener {

	public static List<Key> keys = new ArrayList<Key>();
	
	public class Key {
		public int presses, absorbs;
		public boolean down, clicked;
		
		public Key() {
			keys.add(this);
		}
		
		public void toggle (boolean pressed) {
			if (pressed != down) {
				down = pressed;
			}
			if (pressed) {
				presses ++;
			}
		}
		
		public void tick() {
			if (absorbs < presses) {
				absorbs ++;
				clicked = true;
			} else {
				clicked = false;
			}	
		}
	}
	
	public Key up = new Key();
	public Key down = new Key();
	public Key left = new Key();
	public Key right = new Key();
	public Key menu = new Key();
	public Key enter = new Key();
	public Key escape = new Key();
	
	public KeyHandler(GamePanel game) {
		game.addKeyListener(this);
	}
	
	public void toggle (KeyEvent e, boolean pressed) {
		if (e.getKeyCode() == KeyEvent.VK_Z) up.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_Q) left.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_S) down.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_D) right.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_UP) up.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_LEFT) left.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_DOWN) down.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) right.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) menu.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_SPACE) enter.toggle(pressed);
		if (e.getKeyCode() == KeyEvent.VK_ENTER) enter.toggle(pressed);
	}
	
	
	public void releaseAll() {
		for (int i = 0; i < keys.size(); i++) {
			keys.get(i).down = false;
		}
	}
	
	public void tick() {
		for (int i = 0; i < keys.size(); i++) {
			keys.get(i).tick();
		}
	}
	
	
	
	
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
