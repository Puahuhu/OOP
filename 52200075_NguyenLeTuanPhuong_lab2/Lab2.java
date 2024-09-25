import java.math.BigDecimal;

public class Lab2 {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int sumEven(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return s;
    }
    public static int countSpecific(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }
    public static int isPrime(int a) {
        if (a <= 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static int countPrime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i]) == 1) {
                count++;
            }
        }
        return count;
    }
    public static int find(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
    public static void square(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static BigDecimal findMax(BigDecimal []arr) {
        BigDecimal max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) == 1) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] divisibleNumbers(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % k == 0)
                count++;
        int[] a = new int[count];
        int s = 0;
        for (int i = 0; i < count; i++) {
            for (int j = s; j < arr.length; j++) {
                if (arr[j] % k == 0) {
                    a[i] = arr[j];
                    s = j + 1;
                    break;
                }
            }
        }
        return a;
    }
    public static int findThirdMax(int arr[]) {
        int max = arr[0], max2 = arr[0], max3 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max2 && arr[j] < max) {
                max2 = arr[j];
            }
        }
        for (int a = 1; a < arr.length; a++) {
            if (arr[a] > max3 && arr[a] < max2) {
                max3 = arr[a];
            }
        }
        return max3;
    }
    public static void main (String[] args) {
        int[] arr = {1, 2, 7, 4, 5, 9, 7, 3, 9, 10, 1, 9, 10};
        int[] arr2 = {1, 2, 4, 3, 10, 9, 20, 5, 3, 10, 20};
        System.out.println("1. " + findMax(arr));
        System.out.println("2. " + findMin(arr));
        System.out.println("3. " + sumEven(arr));
        System.out.println("4. " + countSpecific(arr, 3));
        System.out.println("5. " + countPrime(arr));
        System.out.println("6. " + find(arr, 7));
        square(arr);
        System.out.println("7.");
        print(arr);
        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(7);
        BigDecimal num3 = new BigDecimal(9);
        BigDecimal[] arrvjp = {num1, num2, num3};
        System.out.println();
        System.out.println("8. " + findMax(arrvjp));
        int[] arr3 = divisibleNumbers(arr2, 5);
        System.out.print("9.");
        print(arr3);
        System.out.println();
        System.out.println("10. " + findThirdMax(arr2));
    }
}