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

    private class Engine {
        private String numberOfCylinders;
        private int weight;

        private void Running() {
            class engineStrokes{

            }
            class Piston {
                private void MoveUp(){
                    System.out.println();
                }
                private void MoveDown(){

                }
            }
        }
    }

    private class carBody {
        private int length;
        private int weight;
    }
}
