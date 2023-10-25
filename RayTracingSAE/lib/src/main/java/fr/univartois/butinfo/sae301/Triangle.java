package fr.univartois.butinfo.sae301;

public class Triangle implements ISceneObject {
	/*
	 * The vectices of the triangle.
	 */
	private Point point1;
	private Point point2;
	private Point point3;
	private Color color;

	/*
	 * Creates a new triangle with the given vector, color and radius.
	 *
	 * @param color The color of the triangle.
	 */
	public Triangle(Color color, Point point1, Point point2, Point point3) {
		this.color = color;
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}

	@Override
	public Point getOrigin() {
		return point1;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public double intersect(Point p, Vector d) {
		double t;
		Vector normal = (point2.subtraction(point1)).vectorProduct((point3.subtraction(point1)).getTrip()).normalize();
		if ((d.scalarProduct(normal)) == 0) {
			return -1;
		} else {
			t = (normal.scalarProduct(point1.subtraction(p))) / (d.scalarProduct(normal));
		}

		Point point = (d.multiplicationScailary(t)).add(p);
		if ((point2.subtraction(point1)).vectorProduct((point.subtraction(point1).getTrip()))
				.scalarProduct(normal) >= 0) {
			if ((point3.subtraction(point2)).vectorProduct((point.subtraction(point2).getTrip()))
					.scalarProduct(normal) >= 0) {
				if ((point1.subtraction(point3)).vectorProduct((point.subtraction(point3).getTrip()))
						.scalarProduct(normal) >= 0) {
					return t;
				} else {
					return -1;
				}
			} else {
				return -1;
			}
		} else {
			return -1;
		}

	}

}
