package src;
import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.model.*;
import jpu2016.dogfight.view.*;

public class Main 
{
	public static void main(String[] args) 
	{
		final DogfightModel dogfightModel = new DogfightModel(); 
		final DogfightController dogfightController = new DogfightController(dogfightModel); 
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel); 
		dogfightController.setViewSystem(dogfightView); 
		dogfightController.play();
		
		Dimension cielBleu = new Dimension(200,200);

		Plane avion = new Plane(1, Direction.UP, new Position(5,5,10,10), "avion");
		
		Missile missile = new Missile(Direction.RIGHT, cielBleu);
		
		System.out.println(avion.getDimension().getWidth());
		System.out.println(avion.getDimension().getHeight());
		
	}
}
