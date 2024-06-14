package Debugger.task2;

/*Дана строка "Привет, Александр, с праздником, с Новым Годом".
Написать программу, которая поменяет регистр символов.
Т.е. результат должен быть таким: пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ*/
public class Main {
    public static void main(String[] args) {
        String str = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println("Исходная строка:\n" + str);
        //получаем из строки массив char[]
        char[] chars = str.toCharArray();
        String res = "";
        //System.out.println("пРИВЕТ, аЛЕКСАНДР, С ПРАЗДНИКОМ, С нОВЫМ гОДОМ");  //готово=)
        /*Если применение toUpperCase не меняет char,
         то к нему надо применить toLowerCase и наоборот*/
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == Character.toUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else {
                chars[i] = Character.toUpperCase(chars[i]);
            }
            res+=chars[i];
        }
        System.out.println("Строка с обратным регистром:\n" + res);
    }
}
