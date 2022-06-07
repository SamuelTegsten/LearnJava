package LearnJava.JavaOO;

import java.util.Scanner;

public class A_JavaObjects {
    public static void main(String[] args){

        Aa_Triangle triangle = new Aa_Triangle();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int sideA, sideB, sideC;

        while(loop)
        {
            System.out.println("Press 1 to calculate the area of a triangle");
            System.out.println("Press 2 to calculate the length of a side");
            System.out.println("Press 3 to exit");
            int choise = scanner.nextInt();

            switch(choise)
            {
                case 1: 
                System.out.println("Enter the height of the Triangle");
                int height = scanner.nextInt();
                triangle.height = height;
                System.out.println("Enter the base of the Triangle");
                int base = scanner.nextInt();
                triangle.sideA = base;
                triangle.area();
                break;

                case 2: 
                System.out.println("Choose what to calculate: side A (1), side B (2) or hypothenues C (3)");
                int triangleChoise = scanner.nextInt();
                switch(triangleChoise)
                {
                    case 1: 
                    System.out.println("Enter side B");
                    sideB = scanner.nextInt();
                    triangle.sideB = sideB;
                    System.out.println("Enter side C");
                    sideC = scanner.nextInt();
                    triangle.sideC = sideC;
                    triangle.pythagoras(triangleChoise);
                    break;

                    case 2: 
                    System.out.println("Enter side A");
                    sideA = scanner.nextInt();
                    triangle.sideA = sideA;
                    System.out.println("Enter side C");
                    sideC = scanner.nextInt();
                    triangle.sideC = sideC;
                    triangle.pythagoras(triangleChoise);
                    break;
                    
                    case 3: 
                    System.out.println("Enter side A");
                    sideA = scanner.nextInt();
                    triangle.sideA = sideA;
                    System.out.println("Enter side B");
                    sideB = scanner.nextInt();
                    triangle.sideB = sideB;
                    triangle.pythagoras(triangleChoise);
                    break;
                }

                break;

                case 3:
                loop = false;
            }
        }
    }
}
