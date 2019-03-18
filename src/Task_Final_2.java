import java.util.Scanner;

public class Task_Final_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Необходимо ввести размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Необходимо ввести элементы массива:");

        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.println("Введенный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); // Выводим на экран введенный массив
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("\nМассив, полученный после сортировки:");
// Выводим на экран массив после сортировки
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}