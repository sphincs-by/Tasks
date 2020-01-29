package jc01_2020.zaretski.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */

import java.util.Scanner;

public class TaskB1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int index = 0;
		int currentArrayLength = array.length;
		while (index < currentArrayLength){
			if (array[index] >= a && array[index] <= b) {
				currentArrayLength--;
				for (int j = index; j < currentArrayLength; j++) {
					array[j] = array[j+1];
				}
			} else {
				index++;
			}
		}
		for (int i = currentArrayLength; i < array.length; i++) {
			array[i] = 0;
		}
		for (int value : array) {
			System.out.println(value);
		}
	}
}
