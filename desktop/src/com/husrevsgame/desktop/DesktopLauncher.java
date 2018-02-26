package com.husrevsgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.husrevsgame.RaceCar;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title=RaceCar.TITLE;
		config.height=(int)(RaceCar.HEIGHT*0.7);
		config.width=(int)(RaceCar.WIDTH*0.7);

		new LwjglApplication(new RaceCar(), config);
	}
}
