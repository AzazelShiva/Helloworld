import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Необходимо ввести число в бинарном формате и нажать Enter:");
        String Str = a.nextLine();

        int decimal = Integer.parseInt(Str, 2);

        System.out.printf("Число в десятичном формате = %d\n",decimal);
    }
}