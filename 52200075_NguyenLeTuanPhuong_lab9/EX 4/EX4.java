import java.io.File;

class EX4 {
    
    public static boolean isExist(File f) {
        return f.exists();
    }

    public static void main(String[] args) {
        File f = new File("input.txt");
        System.out.println(isExist(f));
    }
}