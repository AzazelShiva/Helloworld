import java.io.*;

public class Task_16 {
    public static void main(String[] args) {
        String s;
        System.out.println("Вывод текста из файла:\n");
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\File.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода вывода:"+exc);
        }

    }
}