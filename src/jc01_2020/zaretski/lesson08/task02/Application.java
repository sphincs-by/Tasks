package jc01_2020.zaretski.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

import java.util.Arrays;

public class Application {

	static class Cat {
	}

	interface Filter {
		boolean apply(Object o);
	}

	public static <T> T[] filter(Object[] objects, Filter filter) {

		Object[] result = new Object[objects.length];
		int index = 0;
		for (Object o : objects) {
			if (filter.apply(o)) {
				result[index++] = o;
			}
		}
		return (T[]) result;
	}

	public static void main(String[] args) {
		Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat()};
		Object[] filterResult = filter(array, new Filter() {
			@Override
			public boolean apply(final Object o) {
				return o instanceof Number;
			}
		});

		int size = 0;
		for (Object current: filterResult) {
			if (current != null) {
				size++;
			}
		}

		Object[] result = new Object[size];
		for (int i = 0; i < size; i++) {
			if (filterResult[i] != null) {
				result[i] = filterResult[i];
			}
		}
		System.out.println(Arrays.toString(result));
	}


}
