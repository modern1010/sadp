interface Shape { void draw(); }

class Circle implements Shape { public void draw() { System.out.println("Drawing a Circle"); } }
class Rectangle implements Shape { public void draw() { System.out.println("Drawing a Rectangle"); } }
class Square implements Shape { public void draw() { System.out.println("Drawing a Square"); } }

interface ShapeFactory { Shape createShape(); }

class CircleFactory implements ShapeFactory { public Shape createShape() { return new Circle(); } }
class RectangleFactory implements ShapeFactory { public Shape createShape() { return new Rectangle(); } }
class SquareFactory implements ShapeFactory { public Shape createShape() { return new Square(); } }

public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory squareFactory = new SquareFactory();

        circleFactory.createShape().draw();
        rectangleFactory.createShape().draw();
        squareFactory.createShape().draw();
    }
}
