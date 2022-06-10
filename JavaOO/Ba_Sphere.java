package LearnJava.JavaOO;

public class Ba_Sphere {
    
    double radius, pi;
    double volume;

    Ba_Sphere(double radius, double pi){
        this.radius = radius;
        this.pi = pi;

        volume = (4 * pi * Math.pow(radius, 3))/3;
        System.out.println(volume);
    }

}
