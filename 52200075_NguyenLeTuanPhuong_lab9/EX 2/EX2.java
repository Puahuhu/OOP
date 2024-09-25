import java.io.File; 
import java.io.FileWriter; 
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Scanner; 

public class EX2 {
    public static void main(String[] args) {
        try {
            File myObj = new File("input.txt");
            FileWriter myWriter = new FileWriter("output.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myWriter.write(data.toUpperCase() + "\n");
            }
            myReader.close();
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}