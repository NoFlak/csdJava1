/**
* Class representing a point in 2D space with x and y coordinates
* @author Brent Barrows
*/
public class Point {
    // Private fields for x and y coordinates
    private double x;
    private double y;
    
    /**
     * No-argument constructor sets point to (1,1)
     */
    public Point() {
        this.x = 1.0;
        this.y = 1.0;
    }
    
    /**
     * Constructor with x and y coordinates
     * @param x x-coordinate of the point
     * @param y y-coordinate of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Get x coordinate
     * @return x coordinate value
     */
    public double getX() {
        return x;
    }
    
    /**
     * Get y coordinate
     * @return y coordinate value
     */
    public double getY() {
        return y;
    }
    
    /**
     * Set x coordinate
     * @param x new x coordinate value
     */
    public void setX(double x) {
        this.x = x;
    }
    
    /**
     * Set y coordinate
     * @param y new y coordinate value
     */
    public void setY(double y) {
        this.y = y;
    }
    
    /**
     * Move point by specified amounts in x and y directions
     * @param dx amount to move in x direction
     * @param dy amount to move in y direction
     */
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    
    /**
     * Rotate point 90 degrees clockwise around origin
     * Algorithm: (x,y) -> (y,-x)
     */
    public void rotate() {
        double oldX = this.x;
        this.x = this.y;
        this.y = -oldX;
    }
}
