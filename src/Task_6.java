

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //поиск среднего арифметического 3х чисел
        System.out.println("Введите число Х");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Введите число Y");
        int y = Integer.parseInt(br.readLine());
        System.out.println("Введите число Z");
        int z = Integer.parseInt(br.readLine());
        double average = (double) (x + y + z) / 3;
        System.out.print("Среднее арифметическое трех чисел: ");
        System.out.println(average);

        //деление average на 2 без остатка
        int a = (int) average / 2;
        System.out.println("Деление среднего арифметического на 2 без остатка: " + a);

        if(a > 3) System.out.println("Программа выполнена корректно"); 
    }
}
