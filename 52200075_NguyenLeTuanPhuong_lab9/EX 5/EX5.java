import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class EX5 {
    public static void main(String[] args) {
        File in = new File("input.txt");
        int arr[] = new int[100];
        int i = 0, s = 0;
        try {
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                arr[i] = value;
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int j = 0; j < i; j++) {
            s = s + arr[j];
        }
        try {
            FileWriter out = new FileWriter("output.txt");
            out.write(s + "");
            out.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}