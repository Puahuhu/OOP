import java.util.Scanner;
import java.util.Vector;

class TestVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int n = sc.nextInt();

        Vector<Integer> X = new Vector<Integer>(n);
        Vector<Integer> Y = new Vector<Integer>(n);

        System.out.println("Enter the elements of the vector X: ");
        for (int i = 0; i < n; i++) {
            X.add(sc.nextInt());
            Y.add(2 * X.get(i) * X.get(i) + 1);
        }
        System.out.println("The value of vector Y is: " + Y);
    }
}