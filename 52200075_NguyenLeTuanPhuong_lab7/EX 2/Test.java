public class Test {
    public static void main(String[] args) {
        Shape s = new Rectangle(5, 4, "white", true);
        Shape s2 = new Circle(4, "white", true);
        System.out.println(s.toString());
        System.out.println("Area = " + s.getArea());
        System.out.println(s.equals(s2));
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        double max = shapes[0].getArea();
        for(Shape temp : shapes) {
            if(temp.getArea() > max) {
                max = temp.getArea();
            }
        }
        System.out.println("max = " + max);
    }
}