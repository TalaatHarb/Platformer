package io.github.talaatharb.platformer.config;

public class GameConfiguration {
	
	public GameConfiguration() {
		// TODO Default constructor for game configuration
	}
	
	public GameConfiguration(String configFile){
		// TODO Loading configuration from file
	}
	
	public GameConfiguration width(int w){
		return this;
	}
	
	public GameConfiguration height(int h){
		return this;
	}
	
	public GameConfiguration title(String title){
		return this;
	}
	
	public int getWidth(){
		return 0;
	}
	
	public int getHeight(){
		return 0;
	}
	
	public String getTitle(){
		return "";
	}
	
	public GameConfiguration property(String key, String value){
		return this;
	}
	
	public String getProperty(String key){
		return "";
	}
	
	public void save(String configFile){
		// TODO Saving configuration to file
	}

}
