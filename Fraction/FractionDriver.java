class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction("5/18");
        Fraction f2 = new Fraction("0/6");
        Fraction f3 = Fraction.multiply(f1, f2);
        Fraction f4 = Fraction.divide(f1, f2);
        Fraction f5 = Fraction.add(f1, f2);
        Fraction f6 = Fraction.subtract(f1, f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
    }
}
