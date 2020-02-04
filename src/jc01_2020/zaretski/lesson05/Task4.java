package jc01_2020.zaretski.lesson05;

/*
 *
 * Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы. Требуется все числа, которые
 * встречаются в строке, поместить в отдельный целочисленный массив. Например, если дана строка
 * "data 48 call 9 read13 blank0a", то в массиве должны оказаться числа 48, 9, 13 и 0. Каждый эдемент массива вывести
 * в консоль с новой строки
 *
 * Формат вывода:
 * число
 * число
 * число
 * ...
 *
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] result = new int[str.length()];
        int quantity = 0;
        int currentNumber = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currentSymbol = chars[i];
            if (isNumber(currentSymbol)) {
                if (i != chars.length - 1) {
                    if (!isNumber(chars[i + 1])) {
                        currentNumber += parseToInt(currentSymbol);
                        result[quantity] = currentNumber;
                        quantity++;
                        currentNumber = 0;
                    } else {
                        currentNumber = parseToInt(currentSymbol) * 10;
                    }
                } else {
                    currentNumber += parseToInt(currentSymbol);
                    result[quantity] = currentNumber;
                    quantity++;
                    currentNumber = 0;
                }
            }
        }

        for (int i = 0; i < quantity; i++) {
            System.out.println(result[i]);
        }
    }

    public static boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }

    public static int parseToInt(char symbol) {
        return Integer.parseInt(String.valueOf(symbol));
    }
}
