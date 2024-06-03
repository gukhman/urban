package abstraction;

public class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("Жизнь, как пианино. С чёрными и белыми полосами, но живя, нельзя забывать, " +
                "что чёрные клавиши тоже создают музыку");
    }

    @Override
    public void tune() {
        System.out.println("Процесс настройки пианино требует наличия специальных знаний, навыков и долгих лет опыта. " +
                "Для этого лучше обратиться к мастеру.");
    }
}
