package File;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class FileWork {
    public void main() throws IOException {
        boolean flag = true;          //флаг начала записи
        String text = "";
        while (!text.equals("0")) {
            text = input(flag);
            write(text, flag);
            flag = false;
        }
        System.out.print("Файл создан");
    }

    public String input(boolean firstFlag) {
        if (firstFlag) {
            System.out.print("Вводите данные для записи: //для окончания записи введите '0' (ноль)");
        } else {
            System.out.print("Введите что-нибудь еще: //для окончания записи введите '0' (ноль)");
        }
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public void write(String Data, boolean firstFlag) {
        if (!Data.equals("0")) {
            String filePath = "C:\\Users\\gukhm\\IdeaProjects\\urban\\Urban\\src\\File\\text.txt";
            File file = new File(filePath);
            try {
                FileWriter writer;
                if (firstFlag) {
                    writer = new FileWriter(file);
                } else {
                    writer = new FileWriter(file, true);
                }
                writer.write(Data + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл");
            }
        }

        //System.out.println(Data);
    }
}
