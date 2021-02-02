class Fraction { 
    //Instance Variables
    private int n, d;
    
    //Interface: all public methods
    
    //Constructors    
    public Fraction() {
        this.n = 1;
        this.d = 1;
    }
    
    public Fraction(int n, int d) {
        this.n = n;
        if(d == 0) {
            System.out.println("Error: denominator is zero.");
            this.d = 1;
        } else {
            this.d = d;
        }
    }
    
    public Fraction(String f) {
        int slashIndex = f.indexOf("/");
        String n = f.substring(0, slashIndex);
        String d = f.substring(slashIndex+1);
        this.n = Integer.parseInt(n);
        if(d.equals("0")) {
            System.out.println("Error: denominator is zero.");
            this.d = 1;
        } else {
            this.d = Integer.parseInt(d);
        }
    }
    
    public Fraction(Fraction f) {
        this.n = f.n;
        this.d = f.d;
    }
    
    //Accessors 
    public int getNum() {
        return this.n;
    }
    
    public int getDenom() {
        return this.d;
    }
    
    public double toDouble() {
        return (double)n/d;
    }
    
    public String toString() {
        return this.n + "/" + this.d;
        //toString gets automatically called when a String is needed
    }
    
    //Mutators      
    public void setNum(int n) {
        this.n = n;
    }
    
    public void setDenom(int d) {
        if(d == 0) {
            System.out.println("Error: denominator is zero.");
            this.d = 1;
        } else {
            this.d = d;
        }
    }
    
    //Helpers

}
