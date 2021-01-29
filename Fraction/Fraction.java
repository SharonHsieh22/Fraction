class Fraction {
    
    public int n, d;
    
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
        this.n = Integer.parseInt(f.substring(0, f.indexOf("/")));
        if(f.substring(f.indexOf("/") + 1) == "0") {
            System.out.println("Error: denominator is zero.");
            this.d = 1;
        } else {
            this.d = Integer.parseInt(f.substring(f.indexOf("/") + 1));
        }
        
        int slashIndex = f.indexOf("/");
        String n = f.substring(0, slashIndex);
        String d = f.substring(slashIndex+1);
        this.n = Integer.parseInt(n);
        //etc.
    }
 
}
