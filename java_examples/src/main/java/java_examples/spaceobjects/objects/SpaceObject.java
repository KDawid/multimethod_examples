package java_examples.spaceobjects.objects;

public class SpaceObject {

	public String name() {
		return "SpaceObject";
	}

	public void collideWith(SpaceObject other) {
		System.out.println("SpaceObject <=> SpaceObject");
	}
}
