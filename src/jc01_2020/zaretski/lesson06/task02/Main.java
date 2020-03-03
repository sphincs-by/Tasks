package jc01_2020.zaretski.lesson06.task02;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm(30, 30, 30);
        System.out.print("Запрашиваемая сумма 110 - ");
        atm.withdrawal(110);
        System.out.print("Запрашиваемая сумма 10 - ");
        atm.withdrawal(10);
        System.out.print("Запрашиваемая сумма 200 - ");
        atm.withdrawal(200);
        System.out.print("Запрашиваемая сумма 630 - ");
        atm.withdrawal(630);
        System.out.print("Запрашиваемая сумма 855 - ");
        atm.withdrawal(855);
        System.out.print("Запрашиваемая сумма 1450 - ");
        atm.withdrawal(1450);
        System.out.print("Запрашиваемая сумма 2890 - ");
        atm.withdrawal(2890);
    }
}
