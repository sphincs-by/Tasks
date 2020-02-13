package jc01_2020.zaretski.lesson08.factory.car.audi;

import jc01_2020.zaretski.lesson08.factory.car.Car;

public class AudiWithExtends extends Car {
    int protectedField = Car.protectedField;
    int packagePrivateField = Car.packagePrivateField;
    String publicField = Car.publicField;
}
