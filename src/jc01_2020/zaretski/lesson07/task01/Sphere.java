package jc01_2020.zaretski.lesson07.task01;

public class Sphere extends Shape {

	private double radius;

	public Sphere(final double radius) {
		this.radius = radius;
		setVolume(calculateVolume());
	}

	private double calculateVolume() {
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}
}
