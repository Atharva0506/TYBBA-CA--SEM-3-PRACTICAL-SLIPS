import java.util.Scanner;

abstract class Shape {
    double pi = Math.PI;
    abstract double area(double r, double h);
    abstract double volume(double r, double h);
}

class Cone extends Shape {
    @Override
    double area(double r, double h) {
        return pi * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
    }

    @Override
    double volume(double r, double h) {
        return (1.0 / 3.0) * pi * Math.pow(r, 2) * h;
    }

}

class Cylinder extends Shape {
    @Override
    double area(double r, double h) {
        return 2 * pi * r * (r + h);
    }

    @Override
    double volume(double r, double h) {
        return pi * Math.pow(r, 2) * h;
    }

}

public class Slip3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cone c = new Cone();
        Cylinder ci = new Cylinder();

        System.out.println("Enter Radius");
        double r = sc.nextDouble();
        System.out.println("Enter Height");
        double h = sc.nextDouble();

        System.out.println("Area of Cone is: " + c.area(r, h));
        System.out.println("Volume of Cone is: " + c.volume(r, h));
        System.out.println("Area of Cylinder is: " + ci.area(r, h));
        System.out.println("Volume of Cylinder is: " + ci.volume(r, h));


        sc.close();
    }
}
