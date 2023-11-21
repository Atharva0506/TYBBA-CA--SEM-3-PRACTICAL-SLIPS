interface Shape {
    double area();
}
final class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Sphere implements Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }
}
public class Slip8a {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(3.0);

        // Calculate and display the area of the circle
        System.out.println("Area of Circle: " + circle.area());

        // Calculate and display the surface area of the sphere
        System.out.println("Surface Area of Sphere: " + sphere.area());
    }
}
