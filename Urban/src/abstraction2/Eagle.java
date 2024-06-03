package abstraction2;

public class Eagle extends Bird{
    public Eagle(int flySpeed) {
        super(flySpeed);
    }

    @Override
    public void fly() {
        System.out.println("Орёл летает на большой высоте и может пикировать. " +
                "Скорость во время пикирования составляет до " + flySpeed + " км/ч");
    }

    @Override
    public void makeSound() {
        System.out.println("Степные орлы издают звук, похожий на восклицание 11-летней пианистки, " +
                "когда ей крышкой рояля прищемляют палец!");
    }
}
