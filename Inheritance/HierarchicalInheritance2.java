class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area: πr²");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Square area: a²");
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.area();
        
        Square s = new Square();
        s.draw();
        s.area();
    }
}