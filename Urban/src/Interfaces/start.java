package Interfaces;

public class start {
    public static void main() {
        Human human = new Human("Алексей", 53);
        human.swim();
        human.fly();

        Delimeter.delimiter();

        Fish fish = new Fish("Нетопырь", 3);
        fish.swim();

        Fish fish2 = new Fish("Угорь", 5);
        fish2.swim();

        Delimeter.delimiter();

        Bird bird = new Bird("Ворона","Черная",1);
        bird.swim();
        bird.fly();
    }
}
