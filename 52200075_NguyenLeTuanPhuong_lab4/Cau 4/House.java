class House {
    private String houseCode;
    private int numOfBedRooms;
    private boolean hasSwimmingPool;
    private double area;
    private double costPerSquareMeter;

    public House() {
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.hasSwimmingPool = false;
        this.area = 0;
        this.costPerSquareMeter = 0;
    }

    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String getHouseCode() {
        return this.houseCode;
    }

    public int getNumOfBedRooms() {
        return this.numOfBedRooms;
    }

    public boolean getHasSwimmingPool() {
        return this.hasSwimmingPool;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double calculateSellingPrice() {
        double SubTotal = area * costPerSquareMeter;
        double SellingPrice = 0.0;
        if (!hasSwimmingPool) {
            SellingPrice = SubTotal + ((15.0/100) * SubTotal);
        }
        else {
            SubTotal += SubTotal*(10.0/100);
            SellingPrice = SubTotal + ((15.0/100) * SubTotal);
        }
        return SellingPrice;
    }

    public String toString() {
        return "House[" + houseCode + ", " + numOfBedRooms + ", " + hasSwimmingPool + ", " + calculateSellingPrice() + "]";
    }
}