import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        System.out.println("Необходимо ввести число:");
        String s = l.nextLine();

        double d = Double.parseDouble(s);
        int x=(int)d;
        System.out.println( "Число типа String:\n" + s);
        System.out.println( "Число типа int:\n" + x);
        System.out.println( "Число типа double:\n" + d);
    }
}