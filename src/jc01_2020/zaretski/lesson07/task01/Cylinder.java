package jc01_2020.zaretski.lesson07.task01;

public class Cylinder extends Shape {

	private double radius;
	private double height;

	public Cylinder(final double radius, final double height) {
		this.radius = radius;
		this.height = height;
		setVolume(calculateVolume());
	}

	private double calculateVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
}
