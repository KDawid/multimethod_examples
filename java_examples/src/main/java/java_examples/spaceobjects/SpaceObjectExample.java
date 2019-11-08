package java_examples.spaceobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java_examples.spaceobjects.objects.Asteroid;
import java_examples.spaceobjects.objects.SpaceObject;
import java_examples.spaceobjects.objects.SpaceShip;

public class SpaceObjectExample {

	public static void main(String[] args) {
		List<SpaceObject> spaceObjectList = new ArrayList<SpaceObject>(
				Arrays.asList(
						new SpaceObject(),
						new Asteroid(),
						new SpaceShip()));

		// Dynamic type works when I call name()
		for (SpaceObject spaceObject : spaceObjectList) {
			System.out.println(spaceObject.name());
		}
	}
}
