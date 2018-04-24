package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder
{
	private int player;
	public UserOrder(int player, Order order)
	{
		this.player = player;
	}
	
	@Override
	public Order getOrder()
	{
		return this.getOrder();
	}
	
	@Override
	public int getPlayer() 
	{
		return player;
	}
	
	public void setPlayer(int player) 
	{
		this.player = player;
	}
	
}
