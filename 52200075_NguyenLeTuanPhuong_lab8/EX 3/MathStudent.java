class MathStudent extends Student {
    private String sID;

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getRank() {
        if(this.gpa >= 5.0) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }

    public String toString() {
        return super.toString() + ", " + this.sID + ", " + getRank();
    }
}