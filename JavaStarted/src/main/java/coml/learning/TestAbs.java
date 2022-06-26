package coml.learning;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing shape Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing shape Square");
    }
}

public class TestAbs {
    public static void main(String[] args) {
        Shape s = new Square();
        s.draw();
    }
}
