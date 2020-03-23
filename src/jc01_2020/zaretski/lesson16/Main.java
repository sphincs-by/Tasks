package jc01_2020.zaretski.lesson16;

/*
 *
 * Написать игру крестики нолики, где два игрока-потока играют друг с другом
 * Ходят по очереди.
 * Вывести в консоль результат партии и итоговое игровое поле
 *
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Table table = new Table();

        Player player1 = new Player(table, "x");
        Player player2 = new Player(table, "o");

        player1.start();
        player2.start();
        player1.join();
        player2.join();

        System.out.println("Result: " + table.getResult() + " - \"" + table.getResult().getFigure() + "\"");

    }

}
