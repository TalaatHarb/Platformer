package io.github.talaatharb.platformer.config;

public class GameConfiguration {
	
	private final static int DEFAULT_W = 800;
	private final static int DEFAULT_H = 600;
	private final static String DEFAULT_TITLE = "Game";
	
	private int width;
	private int height;
	private String title;
	
	public GameConfiguration() {
		width = DEFAULT_W;
		height = DEFAULT_H;
		title = DEFAULT_TITLE;
	}
	
	public GameConfiguration(String configFile){
		// TODO Loading configuration from file
	}
	
	public GameConfiguration width(int w){
		width = w;
		return this;
	}
	
	public GameConfiguration height(int h){
		height = h;
		return this;
	}
	
	public GameConfiguration title(final String t){
		title = t;
		return this;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public String getTitle(){
		return title;
	}
	
	public GameConfiguration property(String key, String value){
		// TODO Property system
		return this;
	}
	
	public String getProperty(String key){
		return "";
	}
	
	public void save(String configFile){
		// TODO Saving configuration to file
	}

}
