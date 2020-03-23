package jc01_2020.zaretski.lesson16;

public class Table {

    private Result result = null;
    private String[][] field;

    public Table() {
        this.field = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void printField() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append(field[i][j]);
                if (j != 2) {
                    sb.append("|");
                }
            }
            sb.append("\n");
            if (i != 2) {
                sb.append("-----").append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public boolean isGameEnds() {
        return result != null;
    }

    public boolean hasAvailableTurn() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }

    public void makeRandomTurn(String figure) {
        makeTurn(figure);
        checkResult(figure);
    }

    private void makeTurn(String figure) {
        int row = -1;
        int column = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals(" ")) {
                    row = i;
                    column = j;
                    break;
                }
            }
        }
        field[row][column] = figure;
    }

    private void checkResult(String figure) {
        for (int i = 0; i < 3; i++) {
            checkRows(i, figure);
            checkColumns(i, figure);
        }
        checkDiagonals(figure);
    }

    private void checkRows(int row, String figure) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (field[row][i].equals(figure)) {
                counter++;
            }
        }
        if (counter == 3) {
            setResult(Result.getResultByFigure(figure));
        }
    }

    private void checkColumns(int column, String figure) {
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][column].equals(figure)) {
                counter++;
            }
        }
        if (counter == 3) {
            setResult(Result.getResultByFigure(figure));
        }
    }

    private void checkDiagonals(String figure) {
        int primaryDiagonalCounter = 0;
        int secondaryDiagonalCounter = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i].equals(figure)) {
                primaryDiagonalCounter++;
            }
            if (field[i][2 - i].equals(figure)) {
                secondaryDiagonalCounter++;
            }
        }
        if (primaryDiagonalCounter == 3 || secondaryDiagonalCounter == 3) {
            setResult(Result.getResultByFigure(figure));
        }
    }

}
