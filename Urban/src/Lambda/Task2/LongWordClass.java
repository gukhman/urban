package Lambda.Task2;

import java.util.ArrayList;

public class LongWordClass {
    public static String[] LongWordMethod(ArrayList<String> arrList) {
        int Len = 0;
        String Word = "";
        String[] res = new String[2];
        for (String element : arrList) {
            if (element.length()>Len){
                Word = element;
                Len = element.length();
            }
        }
        res[0] = Word;
        res[1] = Integer.toString(Len);
        return res;
    }
}
