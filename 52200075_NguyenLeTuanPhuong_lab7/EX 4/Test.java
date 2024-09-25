public class Test {
    public static void main(String[] args) {
        Circle c = new ResizableCircle();
        Resizable r = (Resizable) c;
        System.out.println(c.getPerimeter());
        r.resize(50);
        System.out.println(c.getPerimeter());
    }
}