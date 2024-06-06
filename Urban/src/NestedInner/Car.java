package NestedInner;

import java.util.Scanner;
/*
Создать класс Car(Машина). Написать поля carBrand (марка автомобиля), speed(скорость), weight(вес).
Написать внутренние классы, характеризующие составные части автомобиля,
например, Engine (двигатель) с методами, описывающими поведение данного класса.
Создать не менее двух локальных классов со своими методами, описывающими их деятельность,
например, у класса Engine в методе isRunning(работать) может быть создан класс Piston (Поршень)
с методом преобразования энергии горения топлива в механическую энергию
 */

public class Car {
    String carBrand;
    int speed;
    int length;

    public Car(String carBrand, int speed, int length) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.length = length;
    }

    private int maxRangeCalculation(int fuel) {
        return fuel * 2;
    }

    private boolean startMoving(int range, int maxRange) {
        return range <= maxRange;
    }

    public void carStart() {                //Для движения автомобиля запускаем двигатель
        CarBody carBody = new CarBody(1200);
        Engine engine = new Engine(4, 400);

        System.out.println("Едем на автомобиле " + carBrand + " с макимальной скоростью " + speed + " км/ч");
        int c = engine.EngineNumberOfCylinders();
        int w = engine.EngineWeight() + carBody.carBodyWeight();
        System.out.println("Автомобиль длиной " + length + "мм с общим весом " + w + "кг, включая вес " + c + "-хцилиндрового двигателя и кузова ");

        System.out.print("Сколько литров топлива в баке?: ");
        Scanner in = new Scanner(System.in);
        int fuel = in.nextInt();
        if (fuel < 1) {
            System.out.println("Добавьте топлива!");
            System.exit(0);
        }

        int maxRange = maxRangeCalculation(fuel);

        System.out.print("Длина маршрута в километрах(запаса топлива хватит на " + maxRange + " км): ");
        Scanner in1 = new Scanner(System.in);
        int range = in1.nextInt();       //Километраж поездки

        if (startMoving(range, maxRange)) {
            System.out.println("$Начинаем поездку. Ниже будут показаны такты двигателя:");
            int i = 1;                       //одометр
            while (i <= range) {
                engine.Running(i);
                i++;
            }
            System.out.println("$Мы прибыли в пункт назначения!");
        } else {
            System.out.println("Не хватит топлива для поездки");
        }
    }

    private class Engine {
        int numberOfCylinders;
        int weight;

        public Engine(int numberOfCylinders, int weight) {
            this.numberOfCylinders = numberOfCylinders;
            this.weight = weight;
        }

        public int EngineWeight() {
            return weight;
        }

        public int EngineNumberOfCylinders() {
            return numberOfCylinders;
        }

        public void Running(int Range) {

            class EngineStrokes {
                //Работа двигателя описывается 4-мя тактами, ходом поршня вверх/вниз
                //а также открытием и закрытием впускного и выпускного клапана

                private void PistonMoveUp() {
                    System.out.println("    Поршень движется вверх");
                }

                private void PistonMoveDown() {
                    System.out.println("    Поршень движется вниз");
                }

                private void intakeOpen() {
                    System.out.println("    Впускной клапан открыт");
                }

                private void intakeClose() {
                    System.out.println("    Впускной клапан закрыт");
                }

                private void exhaustOpen() {
                    System.out.println("    Выпускной клапан открыт");
                }

                private void exhaustClose() {
                    System.out.println("    Выпускной клапан закрыт");
                }

                private void Intake() {      //Впуск
                    System.out.println("--Такт впуска:");
                    intakeOpen();
                    exhaustClose();
                    PistonMoveDown();
                }

                private void Compression() {   //Сжатие
                    System.out.println("--Такт сжатия:");
                    intakeClose();
                    exhaustClose();
                    PistonMoveUp();
                }

                private void Combustion() {   //Рабочий ход
                    System.out.println("--Такт рабочего хода:");
                    intakeClose();
                    exhaustClose();
                    PistonMoveDown();
                }

                private void Exhaust() {   //Выпуск
                    System.out.println("--Такт выпуска:");
                    intakeClose();
                    exhaustOpen();
                    PistonMoveUp();
                }
            }
            EngineStrokes intakeStroke = new EngineStrokes();
            intakeStroke.Intake();
            intakeStroke.Compression();
            intakeStroke.Combustion();
            intakeStroke.Exhaust();
            System.out.println("!Автомобиль проехал " + Range + " км");
        }
    }

    private class CarBody {
        int weight;

        public CarBody(int weight) {
            this.weight = weight;
        }

        public int carBodyWeight() {
            return weight;
        }
    }
}
