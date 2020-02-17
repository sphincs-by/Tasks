package jc01_2020.zaretski.lesson07.task01;

public class Box extends Shape {

	public Box(double volume) {
		setVolume(volume);
	}

	public boolean add(Shape shape) {
		double restVolume = getVolume() - shape.getVolume();
		if (restVolume >= 0) {
			setVolume(restVolume);
			System.out.println("restVolume = " + restVolume);
			return true;
		}
		return false;
	}

}
