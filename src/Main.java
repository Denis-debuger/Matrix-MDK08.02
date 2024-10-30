/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for(int i = 0;i < n;i++){
            for (int j = 0;j < n; j++){
                if (i < j){
                    matrix[i][j] = 1;
                } else if (i == j) {
                    matrix[i][j] = 2;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Полученная матрица");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Создание двумерного массива
        int[][] matrix = new int[rows][cols];

        // Заполнение массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Вывод массива в табличной форме
        System.out.println("Двумерный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d ", matrix[i][j]); // Форматирование вывода
            }
            System.out.println();
        }

        scanner.close();
    }
}

