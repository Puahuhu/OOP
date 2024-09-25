import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Find {
    public static ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> list = new ArrayList<Student>();
        for(Student s : lstStu) {
            if(s.getRank().equals("A") || s.getRank().equals("Passed")) {
                list.add(s);
            }
        }
        return list;
    }

    public static<E> boolean writeFile(String path, ArrayList<E> lst) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (E item : lst) {
                writer.write(item.toString());
                writer.newLine();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> lstStu = new ArrayList<Student>();
        lstStu.add(new ITStudent("Gke", 9.0, 522009));
        lstStu.add(new MathStudent("Vjp", 5.2, "H2311231"));
        lstStu.add(new ITStudent("No1", 5.65, 3232123));
        lstStu.add(new MathStudent("Pro", 2.3, "37457473"));
        ArrayList<Student> list = findStudent(lstStu);
        for(Student s : list) {
            System.out.println(s);
        }
        boolean success = writeFile("output.txt", lstStu);
        if (success) {
            System.out.println("Write operation successful.");
        } else {
            System.out.println("Error occurred while writing.");
        }
    }
}