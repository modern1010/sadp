class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}
    static Singleton getInstance() {
        if (instance == null) synchronized (Singleton.class) {
            if (instance == null) instance = new Singleton();
        }
        return instance;
    }
    void doSomething() { System.out.println("Singleton instance is doing something."); }
}

public class SingletonExample {
    public static void main(String[] args) {
        Runnable task = () -> Singleton.getInstance().doSomething();
        new Thread(task).start();
        new Thread(task).start();
    }
}
