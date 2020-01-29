package jc01_2020.zaretski.lesson04;

/*
 *
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму и вывести в консоль его индекс.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода:
 * одно число
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[4][3];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = scanner.nextInt();
			}
		}

		int sum = 0;
		int maxSum = 0;
		int resultIndex = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				sum += array[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				resultIndex = i;
			}
			sum = 0;
		}

		System.out.println(resultIndex);

	}
}
