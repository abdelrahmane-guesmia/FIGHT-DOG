package jpu2016.dogfight.model;

public class Plane extends Mobile{
	
	private static final int SPEED = 40;
	private static final int WIDTH = 100;
	private static final int HEIGHT = 30;
	private static Dimension dimensionAvion = new Dimension(WIDTH,HEIGHT);
	private int player;
	
	public Plane(int player, Direction direction, Position position, String image){

		super(direction, position, dimensionAvion, SPEED, image);//A completer
		this.player = player;
	}
	
	public boolean isPlayer(int player){
		if(player > 0)
			return true;
		else
			return false;
	}
	
	public boolean hit(){
		return false; //A completer
	}
}
