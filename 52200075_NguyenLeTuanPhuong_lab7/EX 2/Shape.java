public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "";
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean equals(Shape s) {
        if(s.getArea() == this.getArea()) {
            return true;
        }
        return false;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "color = " + this.color + ",filled = " + this.filled;
    }
}
