
// Question 3: Define an abstract class Shape with an abstract method area().
// Create two subclasses (Rectangle and Circle) that implement the area() method.

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double width, height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double area() {
        return width * height;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rect.area());
        
        Shape circle = new Circle(7);
        System.out.println("Circle area: " + circle.area());
    }
}
