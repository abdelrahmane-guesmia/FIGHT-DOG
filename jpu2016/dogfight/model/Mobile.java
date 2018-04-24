package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{

	private int speed;
	private Dimension dimension;
	private Position position;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		this.speed = speed;
		this.dimension = dimension;
		this.getDirection();
		this.getPosition();
	}

	private void moveUp(){
		
	}

	private void moveRight(){
		
	}

	private void moveDown(){
		
	}

	private void moveLeft() {
		
	}

	public Color getColor() {
		return null;
		
	}
	
	@Override
	public Direction getDirection() {
		
		return null;
	}

	@Override
	public void setDirection(Direction direction) {

		
	}

	@Override
	public Point getPosition() {
		return null;
	}

	@Override
	public Dimension getDimension() {

		return dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		return this.speed;
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public IDogfightModel getDogfightModel(){
		return null;
	}
	
	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
