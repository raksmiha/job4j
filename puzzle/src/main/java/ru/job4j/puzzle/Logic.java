package ru.job4j.puzzle;

import ru.job4j.puzzle.firuges.Cell;
import ru.job4j.puzzle.firuges.Figure;

/**
 * //TODO add comments.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final int size;
    private final Figure[] figures;
    private int index = 0;

    public Logic(int size) {
        this.size = size;
        this.figures = new Figure[size * size];
    }

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (this.isFree(steps)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
            }
        }
        return rst;
    }

    public boolean isFree(Cell ... cells) {
        boolean result = cells.length > 0;
        for (Cell cell : cells) {
            if (this.findBy(cell) != -1) {
               result = false;
               break;
            }
        }
        return result;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public boolean isWin() {
        int[][] table = this.convert();
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            int a = 0;
            int b = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == 1) {
                    a++;
                }
                if (table[j][i] == 1) {
                    b++;
                }
            }
            if (a == table.length || b == table.length) {
                result = true;
                break;
            }
        }
//        if (table[0][0] == 1) {
//                result = true;
//                if (table[0][0] == table[1][0]) {
//                    for (int i = 2; i < table.length; i++) {
//                        if (table[i - 1][0] != table[i][0]) {
//                            result = false;
//                            break;
//                        }
//                    }
//                    return result;
//                }
//                if (table[0][0] == table[0][1]) {
//                    for (int i = 2; i < table.length; i++) {
//                        if (table[0][i - 1] != table[0][i]) {
//                            result = false;
//                            break;
//                        }
//                    }
//                    return result;
//                }
//                result = false;
//                return result;
//            }
//        for (int n = 1; n != table.length; n++) {
//            if (table[n][n] == 1) {
//                result = true;
//                if (table[0][n] == table[n][n]) {
//                    for (int i = 1; i < table.length; i++) {
//                        if (table[i - 1][n] != table[i][n]) {
//                            result = false;
//                            break;
//                        }
//                    }
//                    break;
//                }
//                if (table[n][0] == table[n][n]) {
//                    for (int i = 1; i < table.length; i++) {
//                        if (table[n][i - 1] != table[n][i]) {
//                            result = false;
//                            break;
//                        }
//                    }
//                    break;
//                }
//                result = false;
//                break;
//            }
//        }
        return result;
    }

    public int[][] convert() {
        int[][] table = new int[this.size][this.size];
        for (int row = 0; row != table.length; row++) {
            for (int cell = 0; cell != table.length; cell++) {
                int position = this.findBy(new Cell(row, cell));
                if (position != -1 && this.figures[position].movable()) {
                    table[row][cell] = 1;
                }
            }
        }
        return table;
    }
}
