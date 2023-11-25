abstract class Pizza {
    void prepare() { System.out.println("Prepare " + getClass().getSimpleName()); }
    void bake() { System.out.println("Bake " + getClass().getSimpleName()); }
    void cut() { System.out.println("Cut " + getClass().getSimpleName()); }
    void box() { System.out.println("Box " + getClass().getSimpleName()); }
}

class NyStyleCheesePizza extends Pizza {}

abstract class PizzaStore {
    abstract Pizza createPizza();

    Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

class NyPizzaStore extends PizzaStore {
    Pizza createPizza() {
        return new NyStyleCheesePizza();
    }
}

public class PizzaFactoryMethodExample {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        Pizza cheesePizza = nyStore.orderPizza();
        System.out.println("Ordered a " + cheesePizza.getClass().getSimpleName());
    }
}
