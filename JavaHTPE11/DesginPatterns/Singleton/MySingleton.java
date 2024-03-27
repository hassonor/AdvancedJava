package JavaHTPE11.DesginPatterns.Singleton;


public final class MySingleton {
    private static MySingleton Me;

    static {
        Me = new MySingleton();
    }

    public static MySingleton getInstance() {
        return Me;
    }

    public void doSomething() {
        System.out.println("Singleton does something");
    }

    private MySingleton() {
        System.out.println("Private Constructor Invoked");
    }
}
