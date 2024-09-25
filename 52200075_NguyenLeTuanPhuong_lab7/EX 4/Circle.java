public class Circle implements GeometricObject {
    protected double radius;

    public Circle() {
        this.radius = 5.0;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}