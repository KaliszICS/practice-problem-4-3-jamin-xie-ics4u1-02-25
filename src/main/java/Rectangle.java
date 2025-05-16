/**
 * Users of this Rectangle class can get the rectangle's length and width.
 * @author Jamin Xie
 * @version 2
 */

class Rectangle {
    private double length;
    private double width;

    /**
    * Intializes the values of the variables length and width
    * @param length double - the length of the rectangle
    * @param width double - the width of the rectangle
    */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Constructs a Rectangle object with the length as 4.0 and width as 8.0
     */
    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**
     * Constructs a Rectangle object with the variable legs and width as 8.0
     * @param length
     */
    public Rectangle(double length) {
        this.length = length;
        this.width = 8.0;
    }

    /**
     * Returns the length of the rectangle
     * @return the length of the rectangle as a double
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Returns the width of the rectangle
     * @return the length of the rectangle as a double
     */
    public double getWidth() {
        return this.width;
    }
}
