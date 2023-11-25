interface Car { void assemble(); }

class BasicCar implements Car { public void assemble() { System.out.print("Basic Car"); } }

abstract class CarDecorator implements Car { protected Car car; public CarDecorator(Car car) { this.car = car; } public void assemble() { car.assemble(); } }

class SportsCar extends CarDecorator { public SportsCar(Car car) { super(car); } public void assemble() { super.assemble(); System.out.print(" + Sports Features"); } }

class LuxuryCar extends CarDecorator { public LuxuryCar(Car car) { super(car); } public void assemble() { super.assemble(); System.out.print(" + Luxury Features"); } }

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car sportsCar = new SportsCar(new BasicCar());
        Car luxuryCar = new LuxuryCar(new BasicCar());

        basicCar.assemble(); System.out.println();
        sportsCar.assemble(); System.out.println();
        luxuryCar.assemble();
    }
}
