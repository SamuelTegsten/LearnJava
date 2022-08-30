package Course1027.Föreläsning2;

public class Time {

    private int h, m, s;

    public Time(int h, int m, int s){
        this.h = h; this.m = m; this.s = s;
        adjust();
    }

    public Time(int h, int m){
        this(h,m,0);
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void tic(int s){
        this.s += s;
        adjust();
    }

    public void tic (){
        tic(1);
    }

    @Override
    public String toString() {
        return " Time {" +
                "h = " + h +
                ", m = " + m +
                ", s = " + s +
                '}';
    }

    private void adjust(){
        m += s / 60;
        h += m / 60;

        s = s % 60;
        m = m % 60;
        h = h & 24;
    }

}
