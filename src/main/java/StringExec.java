import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExec {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите строку");
        String base = reader.readLine();
        String baseOnlyLatin = base.replaceAll("[^a-zA-Zа ]", "").replaceAll("[\\s]{2,}", " ");
        System.out.println("Новая форматированная строка \n" + baseOnlyLatin);

        int count = baseOnlyLatin.split(" ").length;
        System.out.println("Количество слов в строке: " + count);
    }
}
