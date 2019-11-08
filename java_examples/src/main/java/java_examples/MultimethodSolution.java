package java_examples;

class MSpaceObject {
	public String getName() {
		return "SpaceObject";
	}

	public void collideWith(MSpaceObject other) {
		if (other instanceof MAsteroid) {
			System.out.println("SpaceObject <=> Asteroid");
		} else if (other instanceof MSpaceShip) {
			System.out.println("SpaceObject <=> Spaceship");
		} else {
			System.out.println("SpaceObject <=> SpaceObject");
		}
	}
}

class MAsteroid extends MSpaceObject {
	public String getName() {
		return "Asteroid";
	}

	public void collideWith(MSpaceObject other) {
		if (other instanceof MAsteroid) {
			System.out.println("Asteroid <=> Asteroid");
		} else if (other instanceof MSpaceShip) {
			System.out.println("Asteroid <=> Spaceship");
		} else {
			System.out.println("Asteroid <=> SpaceObject");
		}
	}
}

class MSpaceShip extends MSpaceObject {
	public String getName() {
		return "SpaceShip";
	}

	public void collideWith(MSpaceObject other) {
		if (other instanceof MAsteroid) {
			System.out.println("Spaceship <=> Asteroid");
		} else if (other instanceof MSpaceShip) {
			System.out.println("Spaceship <=> Spaceship");
		} else {
			System.out.println("Spaceship <=> SpaceObject");
		}
	}
}

public class MultimethodSolution {
	public static void main(String[] args) {
		MSpaceObject spaceObject = new MSpaceObject();

		MSpaceObject asteroid1 = new MAsteroid();
		MSpaceObject asteroid2 = new MAsteroid();

		MSpaceObject ship1 = new MSpaceShip();
		MSpaceObject ship2 = new MSpaceShip();

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
