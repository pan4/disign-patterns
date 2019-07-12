package patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private final String value;

    private Singleton(String str) {
        value = str;
    }

    public static Singleton getInstance(String str) {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(str);
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(getRunnable("foo")).start();
        new Thread(getRunnable("bar")).start();
    }

    private static Runnable getRunnable(String val){
        return () -> {
            Singleton foo = Singleton.getInstance(val);
            System.out.println(foo.value);
        };
    }
}
