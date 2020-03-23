package jc01_2020.zaretski.lesson16;

import java.util.Arrays;

public enum Result {
    WIN_1("x"),
    WIN_2("o"),
    DRAW("");

    private String figure;

    Result(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public static Result getResultByFigure(String figure) {
        return Arrays.stream(Result.values())
                .filter(result -> result.figure.equals(figure))
                .findAny()
                .get();
    }

}
