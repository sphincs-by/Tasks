package jc01_2020.zaretski.test01;

/*
*
* Написать программу для умножения произвольных матриц. Вывести в консоль матрицу А, матрицу В и результирующую матрицу С.
*
* Теория:
* 1) количество строк матрицы А должно быть равно количеству столбцов матрицы В
* 2) Результатом умножения матрицы Am×n на матрицу Bn×k будет матрица Cm×k такая, что элемент матрицы C,
* стоящий в i-той строке и j-том столбце (Сij), равен сумме произведений элементов i-той строки матрицы A на
* соответствующие элементы j-того столбца матрицы B.
*
*
*    A
* 1  2  3
* 4	 5	6
* 7	 8	9
*
*    B
* 1  2  3  4
* 4  3  2  1
* 1  2  3  4
*
* С = A * B
* 12  14  16  18
* 30  35  40  45
* 48  56  64  72
*
*/

import java.util.Scanner;

public class MatrixMultiplication {

	static int[][] a;
	static int[][] b;
	static int[][] c;
	static int rowsA;
	static int columnsA;
	static int rowsB;
	static int columnsB;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Кол-во строк матрицы А
		rowsA = scanner.nextInt();
//		Кол-во столбцов матрицы А
		columnsA = scanner.nextInt();
//		Кол-во строк матрицы B
		rowsB = scanner.nextInt();
//		Кол-во столбцов матрицы B
		columnsB = scanner.nextInt();

		a = new int[rowsA][columnsA];
		b = new int[rowsB][columnsB];
		c = new int[rowsA][columnsB];

		// Заполнить массивы А и В с помощью scanner.nextInt(). Тестовые данные заполняются построчно для каждого массива
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

		// Вывести в консоль матрицу А
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.println(a[i][j]);
            }
        }

		// Вывести в консоль матрицу В
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.println(b[i][j]);
            }
        }

		// Перемножить матрицы
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                c[i][j] = calculate(i, j);
            }
        }

		// Вывести результирующую матрицу по одному значению через пробел (порядок вывода - построчно)
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print(c[i][j] + " ") ;
            }
        }
	}

    private static int calculate(int row, int column) {
	    int result = 0;
        for (int k = 0; k < columnsA; k++) {
            result += a[row][k] * b[k][column];
        }
        return result;
    }

}
