package NestedInner;

/*
Создать класс Car(Машина). Написать поля carBrand (марка автомобиля), speed(скорость), weight(вес).
Написать внутренние классы, характеризующие составные части автомобиля,
например, Engine (двигатель) с методами, описывающими поведение данного класса.
Создать не менее двух локальных классов со своими методами, описывающими их деятельность,
например, у класса Engine в методе isRunning(работать) может быть создан класс Piston (Поршень)
с методом преобразования энергии горения топлива в механическую энергию
 */

public class Car {
    private String carBrand;
    private int speed;
    private int weight;
    private int length;

    public void move() {                //Для движения автомобиля запускаем двигатель
        Engine engine = new Engine();
        engine.Running();
    }

    public class Engine {
        private String numberOfCylinders;
        private int weight;

        public void Running() {

            class EngineStrokes {       //Почему этому классу нельзя задать модификатор доступа?
                                        //Почему не могу объекты этого класса?
                                        //Работа двигателя описывается 4-мя тактами, ходом поршня вверх/вниз
                                        //а также открытием и закрытием впускного и выпускного клапана


                public void Intake() {      //Впуск
                    System.out.println("Такт впуска:");
                    EngineStrokes intakeStroke = new EngineStrokes();
                    IntakeValve.open();
                    ExhaustValve.close();
                    intakeStroke.PistonMoveDown();
                }

                public void Compression() {   //Сжатие
                    System.out.println("Такт сжатия:");
                    EngineStrokes compressionStroke = new EngineStrokes();
                    IntakeValve.close();
                    ExhaustValve.close();
                    compressionStroke.PistonMoveDown();
                }

                public void Combustion() {   //Рабочий ход
                    System.out.println("Такт рабочего хода:");
                    EngineStrokes combustionStroke = new EngineStrokes();
                    IntakeValve.close();
                    ExhaustValve.open();
                    combustionStroke.PistonMoveDown();
                }

                public void Exhausting() {   //Выпуск
                    System.out.println("Такт выпуска:");
                }


                private void PistonMoveUp() {
                    System.out.println("Поршень движется вверх");
                }

                private void PistonMoveDown() {
                    System.out.println("Поршень движется вниз");
                }

                private class IntakeValve {
                    static private void open() {
                        System.out.println("Впускной клапан открыт");
                    }

                    static private void close() {
                        System.out.println("Впускной клапан закрыт");
                    }
                }

                private class ExhaustValve {
                    static private void open() {
                        System.out.println("Выпускной клапан открыт");
                    }

                    static private void close() {
                        System.out.println("Выпускной клапан закрыт");
                    }
                }

            }
        }
    }

    public class carBody {
        private int length;
        private int weight;
    }
}
