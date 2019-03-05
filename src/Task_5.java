import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {


        Scanner l = new Scanner(System.in);

        System.out.println("Введите число и нажмите Enter:");
        int x = l.nextInt();
        System.out.println(" Отображена таблица умножения для числа " + x);
        System.out.println(x + "*1 = " +x);
        System.out.println(x + "*2 = " +x*2);
        System.out.println(x + "*3 = " +x*3);
        System.out.println(x + "*4 = " +x*4);
        System.out.println(x + "*5 = " +x*5);
        System.out.println(x + "*6 = " +x*6);
        System.out.println(x + "*7 = " +x*7);
        System.out.println(x + "*8 = " +x*8);
        System.out.println(x + "*9 = " +x*9 );
        System.out.println(x + "*10 = " +x*10);
    }
}