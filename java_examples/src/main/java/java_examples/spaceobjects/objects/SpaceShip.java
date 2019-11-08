package java_examples.spaceobjects.objects;

public class SpaceShip extends SpaceObject {

	@Override
	public String name() {
		return "SpaceShip";
	}

	public void collideWith(SpaceObject other) {
		System.out.println("SpaceShip <=> SpaceObject");
	}

	public void collideWith(SpaceShip other) {
		System.out.println("SpaceShip <=> SpaceShip");
	}

	public void collideWith(Asteroid other) {
		System.out.println("SpaceShip <=> Asteroid");
	}
}
