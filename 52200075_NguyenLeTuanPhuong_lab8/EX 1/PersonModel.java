import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();
    
    public void add(T obj) {
        al.add(obj);
    }
    
    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> list = new PersonModel<Student>();
        Student st1 = new Student("Vjp", 9000, "Pro no 1", 1000.0);
        Student st2 = new Student("Pro", 6000, "Vjp no 2", 900.0);
        list.add(st1);
        list.add(st2);
        list.display();
        PersonModel<Employee> list2 = new PersonModel<Employee>();
        Employee e1 = new Employee("Gke", 456, "Giesu", 1000000);
        Employee e2 = new Employee("Hok", 900, "Kratos", 0);
        list2.add(e1);
        list2.add(e2);
        list2.display();
        PersonModel<Person> list3 = new PersonModel<Person>();
        Person p1 = new Person("Ares", 500);
        Person p2 = new Person("Poseidon", 9);
        list3.add(p1);
        list3.add(p2);
        list3.display();
    }
}