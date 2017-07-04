package io.github.talaatharb.platformer.window;

import javax.swing.JFrame;

import io.github.talaatharb.platformer.config.GameConfiguration;
import io.github.talaatharb.platformer.game.SwingGame;

public class SwingGameWindow {
	
	private JFrame jFrame;
	
	public SwingGameWindow(GameConfiguration config, SwingGame game) {
		jFrame = new JFrame(config.getTitle());
		jFrame.add(game);
		jFrame.pack();
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);		
		jFrame.setVisible(true);
	}

}
