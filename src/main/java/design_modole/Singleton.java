package design_modole;

/**
 * @author douglas
 * @create 2020-11-19 16:57
 */
//单例设计模式
public class Singleton {
    private volatile static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
