interface FlyingBehavior { void fly(); }
interface QuackingBehavior { void quack(); }

class FlyWithWings implements FlyingBehavior { public void fly() { System.out.println("Flying with wings"); } }
class FlyNoWay implements FlyingBehavior { public void fly() { System.out.println("Cannot fly"); } }
class Quack implements QuackingBehavior { public void quack() { System.out.println("Quacking"); } }
class MuteQuack implements QuackingBehavior { public void quack() { System.out.println("Mute quack"); } }

class Duck {
    private FlyingBehavior flyingBehavior;
    private QuackingBehavior quackingBehavior;
    Duck(FlyingBehavior fb, QuackingBehavior qb) { flyingBehavior = fb; quackingBehavior = qb; }
    void performFly() { flyingBehavior.fly(); }
    void performQuack() { quackingBehavior.quack(); }
}

public class StrategyPatternExample {
    public static void main(String[] args) {
        Duck duck1 = new Duck(new FlyWithWings(), new Quack());
        duck1.performFly(); duck1.performQuack();
        
        Duck duck2 = new Duck(new FlyNoWay(), new MuteQuack());
        duck2.performFly(); duck2.performQuack();
    }
}
