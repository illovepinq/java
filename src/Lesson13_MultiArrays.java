// УРОК 13. Многомерные массивы
public class Lesson13_MultiArrays {
    public static void main(String[] args) {
        // Двумерный массив: 3 строки, 4 столбца
        int[][] matrix = new int[3][4];

        // Заполняем вложенным циклом: внешний по строкам, внутренний по столбцам
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        // Вывод таблицей
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // print - без переноса
            }
            System.out.println(); // перенос строки после каждой строки таблицы
        }

        // Сразу со значениями
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(grid[1][2]);  // 6 (строка 1, столбец 2)

        // Сумма главной диагонали: 1 + 5 + 9
        int diag = 0;
        for (int i = 0; i < grid.length; i++) {
            diag += grid[i][i];
        }
        System.out.println("Диагональ: " + diag); // 15

        // for each тоже работает
        for (int[] row : grid) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
