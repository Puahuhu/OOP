import java.util.ArrayList;

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
    }
}