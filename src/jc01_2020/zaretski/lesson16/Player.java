package jc01_2020.zaretski.lesson16;

import static jc01_2020.zaretski.lesson16.Result.DRAW;

public class Player extends Thread {

    private volatile Table table;
    private String figure;

    public Player(Table table, String figure) {
        this.table = table;
        this.figure = figure;
    }

    @Override
    public void run() {
        Thread.currentThread().setName("Player " + figure);
        System.out.println("Player \"" + figure + "\" has been created");
        synchronized (table) {
            try {
                while (!table.isGameEnds()) {
                    Thread.sleep(500);
                    table.notifyAll();

                    System.out.println("Player's \"" + figure + "\" turn");

                    if (table.hasAvailableTurn()) {
                        table.makeRandomTurn(figure);
                    } else {
                        table.setResult(DRAW);
                    }

                    table.printField();
                    System.out.println("Player \"" + figure + "\" ended his turn");

                    table.wait();
                }
                table.notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
