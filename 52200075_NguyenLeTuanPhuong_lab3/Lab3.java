public class Lab3 {
    public static boolean firstSpecific(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                } 
                arr[arr.length - 1] = 0;
                return true;
            }
        }
        return false;
    }
    public static void insertElement(int arr[], int k, int index) {
        int temp;
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];

        }
        arr[index] = k;
    }
    public static void findDuplicate(int arr[]) {
        int i, j, flag;
        for (i = 0; i < arr.length; i++) {
            flag = 0;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                int k;
                for (k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        flag = 0;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
    public static void removeDuplicate(int arr[]) {
        int i, j, k;
        int new_size = arr.length;
        for (i = 0; i < new_size; i++) {
            for (j = i + 1; j < new_size; ) {
                if (arr[j] == arr[i]) {
                    new_size --;
                    for (k = j; k < new_size; k++) {
                        arr[k] = arr[k + 1];
                    }
                } else {
                    j++;
                }
            }
        }
        for (i = 0; i < new_size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void addMatrix(int matrix[][], int matrix2[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] += matrix2[i][j];
            }
        }
        printMatrix(matrix);
    }
    public static void multiMatrix(int matrix[][], int k) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] *= k;
            }
        }
        printMatrix(matrix);
    }
    public static String returnFirstLast(String[] s) {
        return s[0] + " " + s[s.length - 1];
    }
    public static String[] returnMiddleName(String s[]) {
        String vjp[] = new String[s.length - 2];
        for (int i = 0; i < vjp.length; i++) {
            vjp[i] = s[i + 1];
        }
        return vjp;
    }
    public static void printString(String s[]) {
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
    public static void capitalizeName(String s[]) {
        for (int i = 0; i < s.length; i++) {
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }
        printString(s);
    }
    public static void upercaseGke(String s[]) {
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                if (s[i].charAt(j) == 'u' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'o' || s[i].charAt(j) == 'a' || s[i].charAt(j) == 'i') {
                    s[i] = s[i].substring(0, j) + s[i].substring(j, j + 1).toUpperCase() + s[i].substring(j + 1);
                } else {
                    s[i] = s[i].substring(0, j) + s[i].substring(j, j + 1).toLowerCase() + s[i].substring(j + 1);
                }
            }
        }
        printString(s);
    }
    public static boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
    public static boolean checkKyTu(char s) {
        if (s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z' || s == ' ')
            return true;
        return false;
    }
    public static void deleteCounted(String[] s, String word) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase(word) == true) {
                s[i] = "#";
            }
        }
    }
    public static void countString(String s[]) {
        int count = 1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != "#") {
                for (int j = i + 1; j < s.length; j++) {
                if (s[i].equalsIgnoreCase(s[j]) == true) {
                    count++;
                }
            }
            System.out.println("'" + s[i] + "': " + count);
            deleteCounted(s, s[i]);
            count = 1;
            }    
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4, 3, 6, 7};
        int arr3[] = {1, 3, 1, 3, 2, 4};
        // 1.1
        // System.out.println(firstSpecific(arr, 1));
        // print(arr);
        // 1.2
        // insertElement(arr2, 5, 2);
        // print(arr2);
        // 1.3
        // findDuplicate(arr3);
        // 1.4
        // removeDuplicate(arr3);
        // 2.1
        // int matrix1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int matrix2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // addMatrix(matrix1, matrix2);
        // 2.2
        // multiMatrix(matrix1, 3);
        // 2.3 
        // printMatrix(matrix1);
        // 3.1
        String name = "Nguyen Hong Quynh Chi";
        String name2 = "yeu Nguyen Le Tuan Phuong";
        String[] s = name.split(" ");
        // System.out.print(returnFirstLast(s));
        // 3.2
        // printString(returnMiddleName(s));
        // 3.3
        // capitalizeName(s);
        // 3.4
        // upercaseGke(s);
        // 4
        // System.out.println(name.length());
        // System.out.println(s.length);
        // System.out.println(name + " " + name2);
        // String check = "abcbd";
        // System.out.println(checkPalindrome(check));
        // 5
        String exam = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        for (int i = 0; i < exam.length(); i++) {
            if (checkKyTu(exam.charAt(i)) == false) 
                exam = exam.substring(0, i) + exam.substring(i + 1);
        }
        String[] f = exam.split(" ");
        countString(f);
    }
}