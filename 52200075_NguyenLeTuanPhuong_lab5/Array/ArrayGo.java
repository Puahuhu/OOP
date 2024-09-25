public class ArrayGo {

    public static int maxEven(int[] a) {
        int max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] > max && a[i] % 2 == 0) {
                max = a[i];
            } 
        }
        return max;
    }

    public static int minOdd(int[] a) {
        int min = a[0];
        for(int i = 1; i < a.length; i++) {
            if(a[i] < min && a[i] % 2 != 0) {
                min = a[i];
            } 
        }
        return min;
    }

    public static int sumMEMO(int[] a) {
        return maxEven(a) + minOdd(a);
    }

    public static int sumEven(int[] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a) {
        int product = 1;
        for(int i = 0; i< a.length; i++) {
            if(a[i] % 2 != 0) {
                product *= a[i];
            }
        }
        return product;
    }

    public static int idxFirstEven(int[] a) {
        int temp = 0;
        for(int i = 0; i< a.length; i++) {
            if(a[i] % 2 == 0) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    public static int idxLastOdd(int[] a) {
        int temp = 0;
        for(int i = 0; i< a.length; i++) {
            if(a[i] % 2 != 0) {
                temp = i;
            }
        }
        return temp;
    }

    public static int[] input(int n) {
        int a[] = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        return a;
    }

    public static void printArr(int a[]) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    // i

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 3, 5, 9, 12};
        // a 
        System.out.println(maxEven(arr));
        // b
        System.out.println(minOdd(arr));
        // c
        System.out.println(sumMEMO(arr));
        // d
        System.out.println(sumEven(arr));
        // e
        System.out.println(prodOdd(arr));
        // f
        System.out.println(idxFirstEven(arr));
        // g
        System.out.println(idxLastOdd(arr));
        // h
        int a[] = input(9);
        printArr(a);
    }
}