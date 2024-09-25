public class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this. length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2.0;
    }

    public String toString() {
        return "Rectangle{"  + super.toString() + ",width = " + this.width + ",length = " + this.length + "}";
    }
}