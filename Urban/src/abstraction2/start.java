package abstraction2;

public class start {
    public static void main() {
        Bird eagle = new Eagle(180);
        Bird hawk = new Hawk(200);

        eagle.fly();
        eagle.makeSound();
        System.out.println("\n$$$$$$$$\n");
        hawk.fly();
        hawk.makeSound();
    }
}
