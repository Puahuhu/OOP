public class Carrot implements Vegetable {
    private String type;
    private double weight;

    public Carrot(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return "Carrot [type: " + type + ", weight: " + weight + "]";
    }
}