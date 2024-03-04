
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class HandleClassCastException {
    public static void main(String[] args) {
        Shape shape = new Circle();
         
        Circle c1=(Circle) shape;
        c1.draw();
        System.out.println("-------------");
        
        Shape shape1 = new Rectangle();
        Rectangle r1=(Rectangle) shape1;
        r1.draw();
        
    
    }
}


