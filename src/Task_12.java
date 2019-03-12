import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("Необходимо ввести строку:");
        String str = l.nextLine();
        String result = str.replaceAll("\\s","");
        System.out.println( "Строка без пробелов:\n" + result);

    }
}