package jc01_2020.zaretski.lesson05;

/*
 *
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
 * "abc cde def", то должно быть выведено "abcdef".
 *
 * Формат вывода:
 * строка
 *
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        char[] chars = str.toCharArray();

        for (char current : chars) {
            if (current == ' ') {
                continue;
            }
            if (!result.toString().contains(String.valueOf(current))) {
                result.append(current);
            }
        }
        System.out.println(result.toString());

    }
}
