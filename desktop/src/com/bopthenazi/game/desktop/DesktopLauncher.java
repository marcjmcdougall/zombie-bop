package com.bopthenazi.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.bopthenazi.game.BTNGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.title="Bop the Zombie";
		config.width= 320;
		config.height= 568;
		
		new LwjglApplication(new BTNGame(), config);
	}
}
