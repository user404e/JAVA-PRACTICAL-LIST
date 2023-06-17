abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    private double base = 7;
    private double height = 10;

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    private double length = 4;
    private double width = 11;

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius = 9.9;

    double area() {
        return 3.141 * radius * radius;
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle(); 
        
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());
    }
}