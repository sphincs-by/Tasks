package jc01_2020.zaretski.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String regexp = "^[a-zA-Z_]{1}[a-zA-Z0-9_]+[a-zA-Z0-9_]$";

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(str);

        System.out.println(matcher.find() ? "Да" : "Нет");
    }
}
