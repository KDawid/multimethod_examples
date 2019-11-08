package java_examples.spaceobjects.objects;

public class Asteroid extends SpaceObject {

	@Override
	public String name() {
		return "Asteroid";
	}

	public void collideWith(SpaceObject other) {
		System.out.println("Asteroid <=> SpaceObject");
	}

	public void collideWith(SpaceShip other) {
		System.out.println("Asteroid <=> SpaceShip");
	}

	public void collideWith(Asteroid other) {
		System.out.println("Asteroid <=> Asteroid");
	}
}
