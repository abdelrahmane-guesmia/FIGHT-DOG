package jpu2016.dogfight.model;

public class Plane extends Mobile{
	
	private static final int SPEED = 2;
	private static final int WIDTH = 100;
	private static final int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image){
		super(direction, position, null, player, image);//A completer
	}
	
	public boolean isPlayer(int player){
		return false; //A completer
	}
	
	public boolean hit(){
		return false; //A completer
	}
}
