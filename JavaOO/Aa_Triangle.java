package LearnJava.JavaOO;

public class Aa_Triangle {
    
    double sideA;
    double sideB;
    double sideC;
    double height;

    void area()
    {
        double area;
        area = (sideA * height) / 2;
        System.out.println("The area of the Triangle is: " + area);
    }

    void pythagoras(int side)
    {
        if(side == 3)
        {
            sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
            System.out.println("The Hypothenues is: " + sideC);
        }
        if(side == 1)
        {
            sideA = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideB, 2));
            System.out.println("The catheter A is: " + sideA);
        }
        if(side == 2)
        {
            sideB = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2));
            System.out.println("The catheter B is: " + sideB);
        }
    }
}

