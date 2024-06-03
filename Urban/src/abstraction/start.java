package abstraction;

public class start {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        guitar.tune();
        guitar.play();
        guitar.music();

        System.out.println("--------");

        Instrument piano = new Piano();
        piano.tune();
        piano.play();
        piano.music();
    }
}
