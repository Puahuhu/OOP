public class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int birthYear, String id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return super.toString() + " " + id + " " + score;
    }
}