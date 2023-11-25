interface Shape { void draw(); }

class Circle implements Shape { public void draw() { System.out.println("Drawing a Circle"); } }
class Square implements Shape { public void draw() { System.out.println("Drawing a Square"); } }
class Rectangle implements Shape { public void draw() { System.out.println("Drawing a Rectangle"); } }

interface ShapeFactory { Shape createShape(); }

class CircleFactory implements ShapeFactory { public Shape createShape() { return new Circle(); } }
class SquareFactory implements ShapeFactory { public Shape createShape() { return new Square(); } }
class RectangleFactory implements ShapeFactory { public Shape createShape() { return new Rectangle(); } }

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory squareFactory = new SquareFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();

        circleFactory.createShape().draw();
        squareFactory.createShape().draw();
        rectangleFactory.createShape().draw();
    }
}
