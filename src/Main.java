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
	}
}
