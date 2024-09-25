public class Ex3 {
    public static void main(String[] args) {
        Student st = new Student(52200075, "Nguyen", "Phuong");
        System.out.println("Name = " + st.getName());
        st.setFirstName("Quynh");
        st.setLastName("Chi");
        System.out.println("Name = " + st.getName());
        System.out.println(st);
    }
}