package jc01_2020.zaretski.lesson04;

/*
 *
 * Найти в массиве те элементы, значение которых больше среднего арифметического, взятого от всех элементов массива.
 *
 * Пример: {1, 2, 8, 4, 16, 10, 6}. Среднее: 6,71.
 * Вывод:
 * 8
 * 16
 * 10
 *
 * Формат вывода:
 * каждое число с новой строки. Сохранить порядок следования чисел в массиве
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		float average = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			average += array[i];
		}
		average /= array.length;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > average) {
				System.out.println(array[i]);
			}
		}

//		for (int value : array) {
//			if (value > average) {
//				System.out.println(value);
//			}
//		}

	}
}
