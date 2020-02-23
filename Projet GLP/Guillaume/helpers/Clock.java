package helpers;

import org.lwjgl.Sys;

public class Clock {
	
	
	private static boolean paused = false;
	public static long LastFrame, TotalTime;
	public static float d = 0, multiplier = 1;
	
	public static long getTime() {
		return Sys.getTime() * 1000 / Sys.getTimerResolution();
	}
	
	public static float getDelta() {
		long currentTime = getTime();
		int delta = (int) (currentTime -LastFrame);
		LastFrame = getTime();
		return delta * 0.01f;
	}
	
	public static float Delta() {
		if (paused)
			return 0;
		else 
			return d * multiplier; 
	}

	public static long getTotalTime() {
		return TotalTime;
	} 	

	public static float getMultiplier() {
		return multiplier;
	}

	public static void setMultiplier(float multiplier) {
		Clock.multiplier = multiplier;
	}
	
	public static void update() {
		d = getDelta();
		TotalTime += d;
	}
	
	
	
	
}
