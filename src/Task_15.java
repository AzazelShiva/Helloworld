import java.util.Scanner;

public class Task_15 {
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
            System.out.print (array[i] + " "); // Выводим на экран введенный массив
        }

        for (int i = 0; i < array.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i+1; j < array.length; j++) {
                //Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        System.out.println("\nМассив, полученный после сортировки:");
// Выводим на экран массив после сортировки
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}