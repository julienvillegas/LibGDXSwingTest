package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglAWTCanvas;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.MyGdxGame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class DesktopLauncher  {

	public static final MainWindow window = new MainWindow();

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		LwjglAWTCanvas libGDXApp = new LwjglAWTCanvas(new MyGdxGame(),config);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		window.addLibGDXapp(libGDXApp.getCanvas());
		window.setSize(
				Math.min(1150, screenSize.width - 100),
				Math.min(800, screenSize.height - 100)
		);
		window.setLocationRelativeTo(null);
		window.setVisible(true);


	}
}
