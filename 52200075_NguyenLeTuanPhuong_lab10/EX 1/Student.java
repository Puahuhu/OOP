class Student {
    private String name;
    private String address;
    private String sex;
    private double score;
    
    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }
    
    static class StudentOperator {
        public void print(Student student) {
            System.out.println("Student [" + student.name + ", " + student.address + ", " + student.sex + ", " + student.score + "]");
        }
        
        public String type(Student student) {
            if (student.score > 8) {
                return "A";
            } else if (student.score >= 5 && student.score <= 8) {
                return "B";
            } else {
                return "C";
            }
        }
    }
    
    public static void main(String[] args) {
        Student student1 = new Student("John", "123 Main St", "Male", 7.5);
        Student student2 = new Student("Jane", "456 Elm St", "Female", 9.2);
        
        StudentOperator operator = new StudentOperator();
        
        operator.print(student1);
        System.out.println("Rank: " + operator.type(student1));
        
        operator.print(student2);
        System.out.println("Rank: " + operator.type(student2));
    }
}
