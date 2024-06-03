package abstraction2;

public class Hawk extends Bird {
    public Hawk(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Характерная черта полета ястребов (тетеревятника и перепелятника)—необычайно высокая маневренность.\n" +
                "Скорость Ястреба сравнима со скоростью орла и составляет около " + flySpeed + " км/ч");
    }

    @Override
    public void makeSound() {
        System.out.println("Многие люди думают, что ястребы кричат только тогда, когда летают в небе, " +
                "но ястребы также прекрасно поют");
    }
}
