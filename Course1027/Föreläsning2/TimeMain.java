package Course1027.Föreläsning2;

public class TimeMain {
    public static void main(String[] args){
        Time time1 = new Time(12,15,75);

        System.out.println(time1.toString());

        time1.tic(100);

        System.out.println(time1.toString());
    }
}
