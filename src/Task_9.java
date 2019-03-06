import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Необходимо ввести размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Необходимо ввести элементы массива:");

        /*Пробежимся по всему массиву заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполним массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Выводим массив, в котором каждый элемент умножен на 2: \n");
        for (int i = 0; i < size; i++) {
            System.out.print (array[i]*2 + " "); // Выводим на экран каждый элемент массива, умноженный на 2
        }
        System.out.println();
    }
}