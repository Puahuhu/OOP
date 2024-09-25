class RegularPolygon {

    private String name;
    private int egdeAmount;
    private double egdeLength;

    public RegularPolygon() {
        this.name = "";
        this.egdeAmount = 3;
        this.egdeLength = 1.0;
    }

    public RegularPolygon(String name, int egdeAmount, double egdeLength) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }

    public RegularPolygon(String name, int egdeAmount) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = 1.0;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.egdeAmount = polygon.egdeAmount;
        this.egdeLength = polygon.egdeLength;
    }

    public String getName() {
        return name;
    }

    public int getEdgeAmount() {
        return egdeAmount;
    }
    
    public double getEdgeLength() {
        return egdeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int num) {
        this.egdeAmount = num;
    }

    public void setEdgeLength (double length) {
        this.egdeLength = length;
    }

    public String getPolygon() {
        if(egdeAmount == 3) {
            return "Triangle";
        }
        if(egdeAmount == 4) {
            return "Quadrangle";
        }
        if(egdeAmount == 5) {
            return "Pentagon";
        }
        if(egdeAmount == 6) {
            return "Hexagon";
        }
        return "Polygon has the number of edges greater than 6";
    }

    public double getPerimeter() {
        return egdeLength * (egdeAmount * 1.0);
    }

    public double getArea() {
        double a = 0;
        double area;
        if(egdeAmount == 3) {
            a = 0.433;
        }
        if(egdeAmount == 4) {
            a = 1.0;
        }
        if(egdeAmount == 5) {
            a = 1.72;
        }
        if(egdeAmount == 6) {
            a = 2.595;
        }
        area = (egdeLength * egdeLength) * a;
        if(egdeAmount > 6) {
            area = -1.0;
        }
        return area;
    }

    public String toString() {
        return name + " - " + getPolygon() + " - " + getArea();
    }
    
}