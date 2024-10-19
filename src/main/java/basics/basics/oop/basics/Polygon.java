package basics.basics.oop.basics;

import java.awt.geom.Point2D;
import java.util.Arrays;

/**
 * A class representing a polygon defined by an array of vertices.
 * The class provides methods to calculate the number of vertices,
 * the perimeter, and the area of the polygon.
 *
 * Example usage:
 * <pre>
 *     Point2D.Double[] vertices = {
 *         new Point2D.Double(0, 0),
 *         new Point2D.Double(1, 0),
 *         new Point2D.Double(1, 1),
 *         new Point2D.Double(0, 1)
 *     };
 *     Polygon polygon = new Polygon(vertices);
 *     double area = polygon.getArea();
 *     double perimeter = polygon.getPerimeter();
 * </pre>
 *
 * @author Yassin Sohim
 */
public class Polygon {
    private final Point2D.Double[] vertices;

    /**
     * Constructs a Polygon with the given vertices.
     *
     * @param vertices an array of Point2D.Double representing the vertices of the polygon
     * @throws IllegalArgumentException if less than three vertices are provided
     */
    public Polygon(Point2D.Double[] vertices) {
        if (vertices.length < 3) {
            throw new IllegalArgumentException("At least three vertices are required");
        }
        this.vertices = vertices;
    }

    /**
     * Gets the number of vertices in the polygon.
     *
     * @return the number of vertices
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * Calculates the perimeter of the polygon.
     *
     * @return the perimeter of the polygon
     */
    public double getPerimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }
        return perimeter;
    }

    /**
     * Calculates the area of the polygon using the shoelace formula.
     *
     * @return the area of the polygon
     */
    public double getArea() {
        double area = 0.0;
        for (int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area / 2.0);
    }

    /**
     * Returns a string representation of the polygon, including its vertices.
     *
     * @return a string representing the polygon
     */
    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
