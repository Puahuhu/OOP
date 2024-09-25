public class Employee extends Person {
    private String id;
    private int salary;

    public Employee(String name, int birthYear, String id, int salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + " " + id + " " + salary;
    }
} 