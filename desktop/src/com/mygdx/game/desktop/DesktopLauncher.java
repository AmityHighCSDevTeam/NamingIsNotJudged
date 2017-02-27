package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.BlueCollarBillionaire;

public class DesktopLauncher
{
	public static void main(String[] arg)
	{
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Blue-Collar Billionaire";
		config.resizable = false;
		config.width = 1366;
		config.height = 768;
		config.forceExit = true;
		new LwjglApplication(new BlueCollarBillionaire(), config);

	}
}
