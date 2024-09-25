public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super();
    }

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (this.base * this.height) / 2;
    }

    public String toString() {
        return "Triangle{base = " + this.base + ",height = " + this.height + ",color = " + this.color + "}";
    }
}