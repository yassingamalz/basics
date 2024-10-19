package basics.basics.oop.basics;

import java.awt.*;

/**
 * A class representing a circle defined by a center point and a radius.
 * The class provides methods to calculate the perimeter and area of the circle,
 * check if a point is inside the circle, and move (translate) the circle.
 *
 * Example usage:
 * <pre>
 *     Circle c = new Circle(new Point(0, 0), 5);
 *     double perimeter = c.getPerimeter();
 *     double area = c.getArea();
 *     boolean isInside = c.contains(new Point(3, 4));
 * </pre>
 *
 * @author Yassin Sohim
 */
public class Circle {
    private Point center;
    private int radius;

    /**
     * Constructs a Circle with a given center and radius.
     *
     * @param center the center of the circle
     * @param radius the radius of the circle
     */
    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Gets the center of the circle.
     *
     * @return the center point of the circle
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Sets the center of the circle.
     *
     * @param center the new center point of the circle
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Gets the radius of the circle.
     *
     * @return the radius of the circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the new radius of the circle
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * Calculates the perimeter of the circle.
     * The formula used is 2 * π * radius.
     *
     * @return the perimeter (circumference) of the circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Calculates the area of the circle.
     * The formula used is π * radius^2.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    /**
     * Checks if a given point is inside the circle.
     * The method uses the distance from the center to the point and compares it to the radius.
     *
     * @param point the point to check
     * @return true if the point is inside the circle, false otherwise
     */
    public boolean contains(Point point) {
        return (center.distance(point) < radius);
    }

    /**
     * Translates (moves) the circle by a given distance along the x and y axes.
     *
     * @param dx the distance to move along the x-axis
     * @param dy the distance to move along the y-axis
     */
    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    /**
     * Returns a string representation of the circle, including its center and radius.
     *
     * @return a string representing the circle
     */
    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}
