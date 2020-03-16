package jc01_2020.zaretski.lesson10.task05;

/*
 *
 * Считать из консоли информацию вида "Покупатель товар количество", где Покупатель — имя покупателя (строка без пробелов),
 * товар — название товара (строка без пробелов), количество — количество приобретенных единиц товара. Сохранить эти
 * данные в карту. Имена покупателей и товаров уникальные. Для каждого покупателя вывести в консоль следующую информацию:
 * "Имя:
 * товар - общее купленное количество этого товара,
 * товар2 - общее купленное количество этого товара"
 *
 * Вся выходная информация должна быть отсортирована в алфавитном порядке
 *
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// Объявить список
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> map = new TreeMap<>();

		for (int i = 0; i < 5; i++) {
			// Заполнить список
            String[] split = scanner.nextLine().split(" ");
            String name = split[0];
            String good = split[1];
            int quantity = Integer.valueOf(split[2]);
            purchase(map, name, good, quantity);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, Integer> innerEntry : entry.getValue().entrySet()) {
                System.out.println(innerEntry.getKey() + " - " + innerEntry.getValue());
            }
        }

	}

    private static void purchase(Map<String, Map<String, Integer>> map, String name, String good, int quantity) {
        if (map.containsKey(name)) {
            map.put(name, addGood(name, good, quantity, map));
        } else {
            map.put(name, addGood(good, quantity));
        }
    }

    private static Map<String, Integer> addGood(String name, String good, int quantity, Map<String, Map<String, Integer>> map) {
        Map<String, Integer> previousGoods = map.get(name);
        if (previousGoods.containsKey(good)) {
            previousGoods.put(good, previousGoods.get(good) + quantity);
        } else {
            previousGoods.put(good, quantity);
        }
        return previousGoods;
    }

    private static Map<String, Integer> addGood(String good, int quantity) {
        Map<String, Integer> goods = new TreeMap<>();
        goods.put(good, quantity);
        return goods;
    }

}
