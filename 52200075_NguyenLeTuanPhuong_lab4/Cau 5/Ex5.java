public class Ex5 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction sum = f1.add(f2);
        Fraction sub = f1.sub(f2);
        Fraction mul = f1.mul(f2);
        Fraction div = f1.div(f2);
        System.out.println(sum);
        sum.reduce();
        System.out.println(sum);
        System.out.println(sub);
        sub.reduce();
        System.out.println(sub);
        mul.reduce();
        System.out.println(mul);
        div.reduce();
        System.out.println(div);
    }
}