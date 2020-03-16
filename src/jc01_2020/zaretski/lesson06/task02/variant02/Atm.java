package jc01_2020.zaretski.lesson06.task02.variant02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Atm {

    private static final List<Integer> BANKNOTES = Arrays.asList(100, 50, 20);

    private int banknote20;
    private int banknote50;
    private int banknote100;

    private Map<Integer, Integer> atmBanknotesMap = new HashMap<>();
    private Map<Integer, Integer> resultMapOfBanknotes;
    private boolean canWithdraw;

    public Atm(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        atmBanknotesMap.put(20, banknote20);
        atmBanknotesMap.put(50, banknote50);
        atmBanknotesMap.put(100, banknote100);
    }

    public void addBanknotes(int banknote20, int banknote50, int banknote100) {
        this.banknote20 += banknote20;
        this.banknote50 += banknote50;
        this.banknote100 += banknote100;
        atmBanknotesMap.put(20, this.banknote20);
        atmBanknotesMap.put(50, this.banknote50);
        atmBanknotesMap.put(100, this.banknote100);
    }

    public boolean withdraw(int amount) {
        canWithdraw = false;
        resultMapOfBanknotes = new HashMap<>();

        withdraw(0, amount, "");

        if (canWithdraw) {
            System.out.printf("Купюр по 100 - %s, купюр по 50 - %s, купюр по 20 - %s",
                    parse(resultMapOfBanknotes.get(100)), parse(resultMapOfBanknotes.get(50)), parse(resultMapOfBanknotes.get(20)));
            System.out.println();
        } else {
            System.out.println("Недопустимая сумма");
        }

        return canWithdraw;
    }

    private void withdraw(int index, int amount, String money) {
        if (canWithdraw) {
            return;
        }
//        System.out.println("index = " + index + ", amount = " + amount + ", money = " + money);
        if (amount == 0) {
            List<Integer> listOfBanknotesToWithdraw = parseStringToListOfBanknotes(money);
            canWithdraw = isEnoughMoneyInAtm(listOfBanknotesToWithdraw);
            return;
        }
        if (index == BANKNOTES.size()) {
            return;
        }

        int nominal = BANKNOTES.get(index);
//        System.out.println("Try " + nominal);
        if (nominal <= amount) {
            withdraw(index, amount - nominal, money + " " + nominal);
        }
        withdraw(index + 1, amount, money);
    }

    private List<Integer> parseStringToListOfBanknotes(String money) {
        return Arrays.stream(money.split(" "))
                .filter(s -> !s.isEmpty())
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    private boolean isEnoughMoneyInAtm(List<Integer> list) {
        for (Integer bill : list) {
            if (resultMapOfBanknotes.containsKey(bill)) {
                resultMapOfBanknotes.put(bill, resultMapOfBanknotes.get(bill) + 1);
            } else {
                resultMapOfBanknotes.put(bill, 1);
            }
        }

        boolean canWithdraw = resultMapOfBanknotes.entrySet()
                .stream()
                .allMatch(entry -> entry.getValue() <= atmBanknotesMap.get(entry.getKey()));

        if (canWithdraw) {
            if (resultMapOfBanknotes.get(20) != null) {
                banknote20 -= resultMapOfBanknotes.get(20);
                atmBanknotesMap.put(20, banknote20);
            }
            if (resultMapOfBanknotes.get(50) != null) {
                banknote50 -= resultMapOfBanknotes.get(50);
                atmBanknotesMap.put(50, banknote50);
            }
            if (resultMapOfBanknotes.get(100) != null) {
                banknote100 -= resultMapOfBanknotes.get(100);
                atmBanknotesMap.put(100, banknote100);
            }
        }
        return canWithdraw;
    }

    private Integer parse(Integer value) {
        return value == null ? 0 : value;
    }

}
