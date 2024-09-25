public class Main {
    public static void main(String[] args) {
        VegetableFactory vegetableFactory = new VegetableFactory();

        Vegetable carrot = vegetableFactory.getVegetable("carrot");
        if (carrot != null) {
            System.out.println(carrot.getInfo());
        }

        Vegetable pumpkin = vegetableFactory.getVegetable("pumpkin");
        if (pumpkin != null) {
            System.out.println(pumpkin.getInfo());
        }

        Vegetable cabbage = vegetableFactory.getVegetable("cabbage");
        if (cabbage != null) {
            System.out.println(cabbage.getInfo());
        }
    }
}