package one.digitalinovation.gof.singleton;

public class SingletonVeloz {
    private static SingletonVeloz instancia = new SingletonVeloz();

    private SingletonVeloz() {
        super();
    }

    public static SingletonVeloz getInstance() {
        return instancia;
    }
}
