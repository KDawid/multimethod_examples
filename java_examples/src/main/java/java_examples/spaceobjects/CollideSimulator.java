package java_examples.spaceobjects;

import java_examples.spaceobjects.objects.Asteroid;
import java_examples.spaceobjects.objects.SpaceObject;
import java_examples.spaceobjects.objects.SpaceShip;

public class CollideSimulator {

	public static void collide(SpaceShip o1, SpaceShip o2) {
		System.out.println("Spaceship <=> Spaceship");
	}

	public static void collide(Asteroid o1, Asteroid o2) {
		System.out.println("Asteroid <=> Asteroid");
	}

	public static void collide(SpaceShip o1, Asteroid o2) {
		System.out.println("Spaceship <=> Asteroid");
	}

	public static void collide(Asteroid o1, SpaceShip o2) {
		System.out.println("Asteroid <=> Spaceship");
	}

	public static void collide(SpaceObject o1, SpaceObject o2) {
		System.out.println("SpaceObject <=> SpaceObject");
	}

	public static void main(String[] args) {

		SpaceObject ship1 = new SpaceShip();
		SpaceObject ship2 = new SpaceShip();

		SpaceObject asteroid1 = new Asteroid();
		SpaceObject asteroid2 = new Asteroid();

		// Java cannot find out the dynamic type of the arguments
		collide(asteroid1, asteroid2);
		collide(asteroid1, ship2);
		collide(ship1, asteroid2);
		collide(ship1, ship2);

	}
}
