public class VegetableFactory {
    public Vegetable getVegetable(String type) {
        if (type.equalsIgnoreCase("carrot")) {
            return new Carrot("Orange", 0.2);
        } 
        else if (type.equalsIgnoreCase("pumpkin")) {
            return new Pumpkin(1.5);
        } 
        else if (type.equalsIgnoreCase("cabbage")) {
            return new Cabbage("Green");
        }
        return null;
    }
}