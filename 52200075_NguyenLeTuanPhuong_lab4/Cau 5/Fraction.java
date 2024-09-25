class Fraction {
    private int numerator;
    private int denominator;

    public int ucln(int num, int den) {
        int temp;
        while(den!=0)
        {
            temp = num % den;
            num = den;
            den = temp;
        }
        return num;
    }

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public Fraction add(Fraction f) {
        int newNumerator = this.numerator * f.denominator + f.numerator * this.denominator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sub(Fraction f) {
        int newNumerator = this.numerator * f.denominator - f.numerator * this.denominator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);    
    }

    public Fraction mul(Fraction f) {
        int newNumerator = this.numerator * f.numerator;
        int newDenominator = this.denominator * f.denominator;
        return new Fraction(newNumerator, newDenominator);   
    }

    public Fraction div(Fraction f) {
        int newNumerator = this.numerator * f.denominator;
        int newDenominator = this.denominator * f.numerator;
        return new Fraction(newNumerator, newDenominator);   
    }

    public void reduce() {
        int uoc = ucln(numerator, denominator);
        numerator /= uoc;
        denominator /= uoc;
    }

    public String toString() {
        return "Fraction[num=" + this.numerator +", den=" + this.denominator + "]";
    }
}