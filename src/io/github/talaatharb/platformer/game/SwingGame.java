package io.github.talaatharb.platformer.game;

import java.awt.Canvas;
import java.awt.Dimension;

import io.github.talaatharb.platformer.config.GameConfiguration;

public class SwingGame extends Canvas{
	
	private static final long serialVersionUID = 1639354150347551130L;

	public SwingGame(GameConfiguration config) {
		Dimension dimension = new Dimension(config.getWidth(), config.getHeight());
		setPreferredSize(dimension);
		setMinimumSize(dimension);
		setMaximumSize(dimension);
	}

}
