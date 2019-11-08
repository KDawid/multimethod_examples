package java_examples;

class Point {
	protected int x;
	protected int y;

	public boolean equals(Point other) {
		return this.x == other.x && this.y == other.y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point {
	public ColorPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	private int color;

	public boolean equals(ColorPoint other) {
		return this.x == other.x && this.y == other.y && this.color == other.color;
	}
}

public class EqualsExample {
	public static void main(String[] args) {
		Point point1 = new Point(1, 2);
		Point point2 = new Point(1, 3);
		Point point3 = new Point(1, 2);

		Point colorPoint1 = new ColorPoint(1, 3, 2);
		Point colorPoint2 = new ColorPoint(1, 2, 2);
		Point colorPoint3 = new ColorPoint(1, 3, 2);

		// (1, 2) =/= (1, 3)
		System.out.println(point1.equals(point2));
		// (1, 2) == (1, 2)
		System.out.println(point1.equals(point3));
		System.out.println();
		// (1, 3, 2) =/= (1, 2, 2)
		System.out.println(colorPoint1.equals(colorPoint2));
		// (1, 3, 2) == (1, 3, 2)
		System.out.println(colorPoint1.equals(colorPoint3));
		System.out.println();
		// ColorPoint is handled as Point --> (1, 3) == (1, 3)
		System.out.println(colorPoint1.equals(point2));
		// ColorPoint is handled as Point --> (1, 2) == (1, 2)
		System.out.println(point1.equals(colorPoint2));
	}
}
