package jc01_2020.zaretski.lesson05;

/*
 *
 * Проверить, что введенная фамилия является двойной, т.е. пишется через дефис. Фамилия может быть написана как
 * кириллицей, так и латиницей, но НЕ одновременно с помощью двух алфавитов. Остальные требования к фамилиям адекватные
 * (только буквы)
 *
 * Вывести в консоль логический результат проверки (boolean)
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean result = false;

        String latinRegexp = "[a-zA-Z]+-[a-zA-Z]+[a-zA-Z]$";
        String cyrillicRegexp = "[а-яА-Я]+-[а-яА-Я]+[а-яА-Я]$";

        Pattern latinPattern = Pattern.compile(latinRegexp);
        Pattern cyrillicPattern = Pattern.compile(cyrillicRegexp);
        Matcher latinMatcher = latinPattern.matcher(str);
        Matcher cyrillicMatcher = cyrillicPattern.matcher(str);

        result = latinMatcher.find() || cyrillicMatcher.find();

        System.out.println(result);
    }
}
