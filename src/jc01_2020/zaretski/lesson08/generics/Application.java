package jc01_2020.zaretski.lesson08.generics;

public class Application {

    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello");
        box1.setField("Bye");

        Box<Integer> box2 = new Box<>(5);
        box2.setField(8);
    }

}
