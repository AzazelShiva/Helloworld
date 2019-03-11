import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Необходимо ввести размер матрицы, сначала введем количество строк, затем количество столбцов: ");
        int rows = input.nextInt(); // Читаем с клавиатуры количество строк и записываем в rows
        int cols = input.nextInt(); // Читаем с клавиатуры количество столбцов и записываем в cols
        int array[][] = new int[rows][cols]; // Создаём матрицу размером в rows*cols
        System.out.println("Необходимо ввести элементы матрицы");

        /*Пробежимся по всей матрице и заполним ее*/
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Необходимо ввести элемент [" + i + "][" + j + "]:");
                array[i][j] = input.nextInt();
            }
        }
        System.out.print ("Вывод первой строки матрицы, в котором каждый элемент умножен на 3: \n");
        for (int j = 0; j < rows; j++) {
            System.out.print(array[0][j]*3 + " ");
        }
        System.out.println();
    }
} 