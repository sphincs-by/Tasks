package jc01_2020.zaretski.lesson07.task01;

public class Parallelepiped extends Shape {

	private double length;
	private double width;
	private double height;

	public Parallelepiped(final double length, final double width, final double height) {
		this.length = length;
		this.width = width;
		this.height = height;
		setVolume(calculateVolume());
	}

	private double calculateVolume() {
		return length * width * height;
	}
}
