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
    
    public void reduce() {
        int gcf = gcf(this.n, this.d);
        this.n = this.n/gcf;
        this.d = this.d/gcf;
    }
    
    //Static methods
    public static String multiply(Fraction f1, Fraction f2) {
        int n = f1.n*f2.n;
        int d = f1.d*f2.d;
        return n + "/" + d;
    }
    
    //Helpers
    private int gcf(int n1, int n2) {
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        while(max != min) {
          int dif = 0;
          dif = max - min;
          max = Math.max(dif, min);
          min = Math.min(dif, min);
        }
        return min;
    }
    
    
}
