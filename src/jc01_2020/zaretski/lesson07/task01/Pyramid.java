package jc01_2020.zaretski.lesson07.task01;

public class Pyramid extends Shape {

	private double side;
	private double height;

	public Pyramid(final double side, final double height) {
		this.side = side;
		this.height = height;
		setVolume(calculateVolume());
	}

	private double calculateVolume() {
		return Math.pow(side, 2) * height / 3;
	}
}
