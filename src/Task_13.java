import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Необходимо ввести первую строку:");
        String str1 = l.nextLine();

        System.out.println("Необходимо ввести вторую строку:");
        String str2 = l.nextLine();


        if (str1.length() > str2.length())
            System.out.println( "Длиннее первая строка:\n" + str1);
        else if (str1.length() < str2.length())
            System.out.println( "Длинее вторая строка:\n" + str2);
        else
            System.out.println( "Строки равны по длине");

    }
}