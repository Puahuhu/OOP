public class TestClub {
    public static void main(String[] args) {
        Club c1 = new Club("MU", 10, 5, 0);
        System.out.println(c1.isFinish());
        c1.setDraws(10);
        System.out.println(c1);
        System.out.println(c1.getLosses());
        System.out.println(c1.numMatchesPlayed());
    }
}