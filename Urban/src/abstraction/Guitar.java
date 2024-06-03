package abstraction;

public class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Сперва учимся играть перебором. Затем переходим к изучению Баррэ́");
    }

    @Override
    public void tune() {
        System.out.println("Опытные мызуканты настраивают гитару на слух. Но мы можем использовать тюнер");
    }
}
