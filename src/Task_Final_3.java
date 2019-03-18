import java.util.Scanner;

public class Task_Final_3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);


        System.out.println("Необходимо ввести количество рублей: ");
        double r = a.nextDouble();
        System.out.println("Необходимо ввести курс обмена (стоимость 1 доллара США в рублях): ");
        double c = a.nextDouble();
        double result = convertRubToUsd(r, c);
        System.out.println(r+" рублей = " + (double)Math.round(result * 100d) / 100d + " $ США");

    }

    public static double convertRubToUsd(double rub, double course) {
        return rub/course;
    }
}