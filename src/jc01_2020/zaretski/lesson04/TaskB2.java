package jc01_2020.zaretski.lesson04;

/*
 *
 * Вывести на экран индексы всех минимальных элементов матрицы.
 * Номер столбца будет определяться первым индексом.
 * Т.е. в исходной матрице int[4][3] 4 столбца по 3 строки
 *
 * Формат вывода (ошибки недопустимы):
 * строка: 1, столбец: 2
 * строка: 2, столбец: 0
 *
 */

import java.util.Scanner;

public class TaskB2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[4][3];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = scanner.nextInt();
			}
		}

		int min = array[0][0];
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] < min) {
					min = array[j][i];
				}
			}
		}

		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j][i] == min) {
					System.out.println("строка: " + i +", столбец: " + j);
				}
			}
		}

	}
}
