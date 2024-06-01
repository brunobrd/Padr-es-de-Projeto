package one.digitalinovation.gof.singleton;

public class SingletonPreso {
        private static class InstacePreso {
            public static SingletonPreso instancia = new SingletonPreso();
        }
    private SingletonPreso() {
            super();
    }
    public static SingletonPreso getInstance() {
        return InstacePreso.instancia;
    }
}
