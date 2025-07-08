/**
* Class representing a right triangle with two legs
* @author Brent Barrows
*/


public class RightTriangle {
    // Private fields for the legs of the right triangle
    private double legA;
    private double legB;
    
    /**
     * No-argument constructor sets both legs to 1
     */
    public RightTriangle() {
        this.legA = 1.0;
        this.legB = 1.0;
    }
    
    /**
     * Constructor with leg lengths
     * @param legA length of first leg
     * @param legB length of second leg
     * @throws IllegalArgumentException if either leg is 0 or negative
     */
    public RightTriangle(double legA, double legB) throws IllegalArgumentException {
        if (legA <= 0 || legB <= 0) {
            throw new IllegalArgumentException("Legs must be positive");
        }
        this.legA = legA;
        this.legB = legB;
    }
    
    /**
     * Get length of leg A
     * @return length of leg A
     */
    public double getLegA() {
        return legA;
    }
    
    /**
     * Get length of leg B
     * @return length of leg B
     */
    public double getLegB() {
        return legB;
    }
    
    /**
     * Set length of leg A
     * @param legA new length for leg A
     * @throws IllegalArgumentException if length is 0 or negative
     */
    public void setLegA(double legA) throws IllegalArgumentException {
        if (legA <= 0) {
            throw new IllegalArgumentException("Leg A must be positive");
        }
        this.legA = legA;
    }
    
    /**
     * Set length of leg B
     * @param legB new length for leg B
     * @throws IllegalArgumentException if length is 0 or negative
     */
    public void setLegB(double legB) throws IllegalArgumentException {
        if (legB <= 0) {
            throw new IllegalArgumentException("Leg B must be positive");
        }
        this.legB = legB;
    }
    
    /**
     * Calculate hypotenuse using Pythagorean theorem
     * @return length of hypotenuse
     */
    public double getHypotenuse() {
        return Math.sqrt(legA * legA + legB * legB);
    }
    
    /**
     * Calculate area of right triangle
     * @return area of triangle
     */
    public double getArea() {
        return (legA * legB) / 2.0;
    }
    
    /**
     * Calculate perimeter of right triangle
     * @return perimeter of triangle
     */
    public double getPerimeter() {
        return legA + legB + getHypotenuse();
    }
    
    /**
     * String representation of right triangle
     * @return string in format "legA = X.X, legB = Y.Y"
     */
    @Override
    public String toString() {
        return String.format("legA = %.1f, legB = %.1f", legA, legB);
    }
}
