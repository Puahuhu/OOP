class ITStudent extends Student {
    private int sID;

    public ITStudent(String sName, double gpa, int sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    public String getRank() {
        if(this.gpa <= 5.0) {
            return "C";
        }
        else if(this.gpa <= 8.0) {
            return "B";
        }
        else {
            return "A";
        }
    }

    public String toString() {
        return super.toString() + ", " + this.sID + ", " + getRank();
    }
}