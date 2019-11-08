package java_examples;

class SpaceObject {
	public String getName() {
		return "SpaceObject";
	}

	public void collideWith(SpaceObject other) {
		System.out.println("SpaceObject <=> SpaceObject");
	}

	public void collideWith(Asteroid asteroid) {
		System.out.println("SpaceObject <=> Asteroid");
	}

	public void collideWith(SpaceShip spaceship) {
		System.out.println("SpaceObject <=> Spaceship");
	}
}

class Asteroid extends SpaceObject {
	public String getName() {
		return "Asteroid";
	}

	public void collideWith(SpaceObject spaceobject) {
		System.out.println("Asteroid <=> SpaceObject");
	}

	public void collideWith(Asteroid asteroid) {
		System.out.println("Asteroid <=> Asteroid");
	}

	public void collideWith(SpaceShip spaceship) {
		System.out.println("Asteroid <=> Spaceship");
	}
}

class SpaceShip extends SpaceObject {
	public String getName() {
		return "SpaceShip";
	}

	public void collideWith(SpaceObject spaceobject) {
		System.out.println("Spaceship <=> SpaceObject");
	}

	public void collideWith(Asteroid asteroid) {
		System.out.println("Spaceship <=> Asteroid");
	}

	public void collideWith(SpaceShip spaceship) {
		System.out.println("Spaceship <=> Spaceship");
	}
}

public class MultimethodProblem {
	public static void main(String[] args) {
		SpaceObject spaceObject = new SpaceObject();

		SpaceObject asteroid1 = new Asteroid();
		SpaceObject asteroid2 = new Asteroid();

		SpaceObject ship1 = new SpaceShip();
		SpaceObject ship2 = new SpaceShip();

		System.out.println(spaceObject.getName());
		System.out.println(asteroid1.getName());
		System.out.println(ship1.getName());

		System.out.println();

		asteroid1.collideWith(asteroid2);
		asteroid1.collideWith(ship2);
		ship1.collideWith(asteroid2);
		ship1.collideWith(ship2);
	}
}
