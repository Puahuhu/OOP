public class Ex4 {
    public static void main (String[] args) {
        House h = new House("A01", 4, true, 100, 2500000);
        System.out.println(h.calculateSellingPrice());
        System.out.println(h);
    }
}