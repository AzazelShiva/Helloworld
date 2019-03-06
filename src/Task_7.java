import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.println("Необходимо ввести число t и нажать Enter:");

        float t = l.nextFloat();

        float x = 9;
        float y = 7;
        float z = 12;

        if (t==x || t==y || t==z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}