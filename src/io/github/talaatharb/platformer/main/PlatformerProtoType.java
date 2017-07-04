package io.github.talaatharb.platformer.main;

import io.github.talaatharb.platformer.config.GameConfiguration;
import io.github.talaatharb.platformer.game.SwingGame;
import io.github.talaatharb.platformer.window.SwingWindow;

public class PlatformerProtoType {

	public static void main(String[] args) {
		GameConfiguration config = new GameConfiguration();
		SwingGame game = new SwingGame(config);
		SwingWindow window = new SwingWindow(config, game);

	}

}
