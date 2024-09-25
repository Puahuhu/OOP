public class Ex2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0f, 4.0f);
        System.out.println(r);
        r.setLength(6.0f);
        r.setWidth(6.0f);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}