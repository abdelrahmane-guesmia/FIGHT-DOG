package jpu2016.dogfight.model;

public class Missile {
	private int SPEED = 4;
	private int WIDTH = 30;
	private int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Direction direction, Dimension dimension){
		//Completer
	}
	
	public int getWidthADirection(Direction direction){
		return 0;
	}
	
	public int getHeightWithADirection(Direction direction){
		return 0;
	}
	
	public void move(){
		return;
	}
	
	public boolean isWeapon(){
		return false;//
	}

}
