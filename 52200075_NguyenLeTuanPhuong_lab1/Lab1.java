import java.util.*;
public class Lab1 {
    public static double reminderOfDivision(double a, double b) {
        return a/b;
    }
    public static double cToF(double c) {
        return (c * (9.0/5)) + 32;
    }
    public static double fToC(double f) {
        return (5.0/9) * (f - 32);
    }
    public static int isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int minimunOfThree(int a, int b, int c) {
        int min = a;
        if (c < min) {
            min = c;
        }
        if (b < min) {
            min = b;
        }
        return min;
    }
    public static int isAlphanumeric(char a) {
        if (a >= '0' && a <= '9') {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static long sumOfA(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    public static long mutiOfB(int n) {
        long sum = 1;
        for (int i = 1; i <= n; i++){
            sum *= i;
        }
        return sum;
    }
    public static long sumOfC(int n) {
        long sum = 0;
        for (int i = 0; i <= n; i++){
            sum += Math.pow(2,i);
        }
        return sum;
    }
    public static double sumOfD(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            sum += (1.0/(2*i));
        }
        return sum;
    }
    public static long sumOfE(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(i,2);
        }
        return sum;
    }
    public static int sumOfTwoDigit(int n) {
        int last = n%10;
        int first, count = 0;
        int s = n;
        while (n != 0) {
            count++;
            n /= 10;
        }
        first = s / (int)(Math.pow(10,count-1));
        return first + last;
    }
    public static void hailstoneSequence(int n) {
        while (n != 1){
            if (n % 2 != 0) {
                System.out.print(n +" is odd, so we take 3*n+1: ");
                n = 3*n+1;
                System.out.println(n);
            }
            else {
                System.out.print(n +" is even, so we take n/2: ");
                n = n/2;
                System.out.println(n);
            }
        }
    }
    public static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static int reverseInput(int n) {
        int s = 0;
        while(n != 0) {
            s = (s * 10) + (n % 10);
            n /= 10;
        }
        return s;
    }
    public static int isPalindrome(int n) {
        if (reverseInput(n) == n) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter date of birth: ");
        String date = sc.nextLine();
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Date of birth: "+date);
        System.out.println("Student ID: "+id);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = (1.0/2) * base * height;
        System.out.println("The area of triangle: "+area);
        double division = reminderOfDivision(12.5,4.5);
        System.out.println(division);
        System.out.println("C to F: "+cToF(0));
        System.out.println("F to C: "+fToC(32));
        if (isLeapYear(2017) == 1) {
            System.out.println("Is leap year");
        }
        else {
            System.out.println("Is not leap year");
        }
        System.out.println(minimunOfThree(5,9,8));
        if (isAlphanumeric('p') == 1) {
            System.out.println("Is alphanumeric");
        }
        else {
            System.out.println("Is not alphanumeric");
        }
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("8a. " + sumOfA(n));
        System.out.println("8b. " + mutiOfB(n));
        System.out.println("8c. " + sumOfC(n));
        System.out.println("8d. " + sumOfD(n));
        System.out.println("8e. " + sumOfE(n));
        hailstoneSequence(5);
        System.out.println(sumOfTwoDigit(342616));
        System.out.println(countDigit(12345));
        System.out.println(reverseInput(12345));
        if (isPalindrome(12321) == 1) {
            System.out.println("Is palindrome");
        }
        else {
            System.out.println("Is not palindrome");
        }
        System.out.println("14. ");
        System.out.println("----Menu----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.print("The price of Coca is: 2$, please enter the amount of money: ");
            double amount = sc.nextDouble();
            if (amount >= 2.0) {
                System.out.println("Your change is " + (amount - 2.0) + "$");
            }
            else {
                System.out.println("Not enough money to buy this item. Please select again.");
            }
        }
        if (num == 2) {
            System.out.print("The price of Pepsi is: 3$, please enter the amount of money: ");
            double amount = sc.nextDouble();
            if (amount >= 3.0) {
                System.out.println("Your change is " + (amount - 3.0) + "$");
            }
            else {
                System.out.println("Not enough money to buy this item. Please select again.");
            }
        }
        if (num == 3) {
            System.out.print("The price of Sprite is: 2$, please enter the amount of money: ");
            double amount = sc.nextDouble();
            if (amount >= 3.0) {
                System.out.println("Your change is " + (amount - 3.0) + "$");
            }
            else {
                System.out.println("Not enough money to buy this item. Please select again.");
            }
        }
        if (num == 4) {
            System.out.print("The price of Snack is: 4$, please enter the amount of money: ");
            double amount = sc.nextDouble();
            if (amount >= 4.0) {
                System.out.println("Your change is " + (amount - 4.0) + "$");
            }
            else {
                System.out.println("Not enough money to buy this item. Please select again.");
            }
        }
        if (num == 5) {
            System.out.println("Machine is shutting down");
        }
    }
}