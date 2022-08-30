package Course1027.Task1;

public class Rational {
    private double numerator, denominator;

    public Rational(double numerator, double denominator){
        this.numerator = gcd(denominator , numerator) / numerator;
        this.denominator = (denominator / numerator);
        if(denominator <= 0){
            throw new RuntimeException();
        }
    }

    public Rational(double numerator){
        this.numerator = numerator;
        this.denominator = 1;
        if(denominator <= 0){
            throw new RuntimeException();
        }
    }

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
        if(denominator <= 0){
            throw new RuntimeException();
        }
    }

    public Rational add(Rational a)
    {
        Rational result;
        double simplify;
        result = new Rational( numerator * a.denominator + a.numerator * denominator, denominator * a.denominator );
        simplify = gcd(result.numerator, result.denominator);
        result.numerator /= simplify;
        result.denominator /= simplify;
        return result;
    }

    private double gcd( double m, double n ) { // Greatest Common Divisor
        m = Math.abs(m);
        n = Math.abs(n);
        while (m != n) {
            if (m > n)
                m -= n;
            else
                n -= m;
        }
        return m;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    @Override
    public String toString()
    {
        return "(" + numerator + "/" + denominator + ")";
    }
}
