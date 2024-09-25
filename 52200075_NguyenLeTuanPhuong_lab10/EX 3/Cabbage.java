public class Cabbage implements Vegetable {
    private String type;

    public Cabbage(String type) {
        this.type = type;
    }

    @Override
    public String getInfo() {
        return "Cabbage [type: " + type + "]";
    }
}