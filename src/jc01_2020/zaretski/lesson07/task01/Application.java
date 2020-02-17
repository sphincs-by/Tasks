package jc01_2020.zaretski.lesson07.task01;

/*
 *
 * Собираем чемодан
 *
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Реализовать в нем конструктор, в который
 * передается объем коробки, и метод add(), который принимает на вход Shape и кладет в коробку.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватает места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 * Все сущности должны являть наследниками класса Shape.
 * Параллелепипед - прямоугольный
 *
 */

public class Application {

	public static void main(String[] args) {
		Box box = new Box(5000);

		Shape sphere = new Sphere(8);
		Shape pyramid = new Pyramid(10, 5);
		Shape parallelepiped = new Parallelepiped(11, 6, 12);
		Shape cylinder = new Cylinder(8, 15);

		System.out.println(box.add(sphere));
		System.out.println(box.add(pyramid));
		System.out.println(box.add(parallelepiped));
		System.out.println(box.add(cylinder));
	}

}
