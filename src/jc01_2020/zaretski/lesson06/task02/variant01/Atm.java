package jc01_2020.zaretski.lesson06.task02.variant01;

import java.util.Arrays;

public class Atm {

    final static int INF = 1_000_000;

    private int bill20;
    private int bill50;
    private int bill100;
    private int totalAmount;

    public Atm() {
    }

    public Atm(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
        totalAmount = calculateTotalAmount();
    }

    public void addBills(int bill20, int bill50, int bill100) {
        this.bill20 += bill20;
        this.bill50 += bill50;
        this.bill100 += bill100;
        totalAmount = calculateTotalAmount();
    }

    public boolean withdrawal(int amount) {

        int billCount = 3;
        int[] minCountOfBills = new int[amount + 1];
        minCountOfBills[0] = 0;
        int[] faceValues = {20, 50, 100};
        for (int currentAmount = 1; currentAmount <= amount ; currentAmount++) {
            minCountOfBills[currentAmount] = INF;
            for (int k = 0; k < billCount; k++) {
                if (currentAmount >= faceValues[k] && minCountOfBills[currentAmount - faceValues[k]] + 1 < minCountOfBills[currentAmount])
                    minCountOfBills[currentAmount] = minCountOfBills[currentAmount -faceValues[k]] + 1;
            }
        }

        if (minCountOfBills[amount] == INF) {
            System.out.println("Недопустимая сумма");
            return false;
        }

        int[] result = new int[minCountOfBills[amount]];
        int counter = 0;
        while (amount > 0) {
            for (int i = 0; i < 3; i++) {
                if (minCountOfBills[amount - faceValues[i]] == minCountOfBills[amount] - 1) {
                    result[counter] = faceValues[i];
                    counter++;
                    amount -= faceValues[i];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(result));
        return true;
    }

    private int calculateTotalAmount() {
        return bill20 * 20 + bill50 * 50 + bill100 * 100;
    }


}
