package jc01_2020.zaretski.lesson08.generics;

public class Box<T> {

    T field;

    public Box(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

}
