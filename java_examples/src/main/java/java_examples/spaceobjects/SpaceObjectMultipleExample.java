package java_examples.spaceobjects;

import java_examples.spaceobjects.objects.Asteroid;
import java_examples.spaceobjects.objects.SpaceObject;
import java_examples.spaceobjects.objects.SpaceShip;

public class SpaceObjectMultipleExample {

	public static void main(String[] args) {
		SpaceObject ship1 = new SpaceShip();
		SpaceObject ship2 = new SpaceShip();

		SpaceObject asteroid1 = new Asteroid();
		SpaceObject asteroid2 = new Asteroid();

		ship1.collideWith(ship2); // SpaceShip <=> SpaceObject
		ship1.collideWith(asteroid2); // SpaceShip <=> SpaceObject
		asteroid1.collideWith(ship2); // Asteroid <=> SpaceObject
		asteroid1.collideWith(asteroid2); // Asteroid <=> SpaceObject
	}
}
