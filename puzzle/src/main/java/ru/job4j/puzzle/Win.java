package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return isWin(board);
    }

    public static boolean monoHorizontal(int[][] board, int row) {
        for (int cell = 0; cell < board.length; cell++) {
            int value = board[row][cell];
            if (value != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(int[][] board, int column) {
        for (int row = 0; row < board.length; row++) {
            int value = board[row][column];
            if (value != 1) {
                return false;
            }
        }
        return true;
    }

    public static int[] extractDiagonal(int[][] board) {
        int[] rsl = new int[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    //for socoban
    public static boolean isWin(int[][] board) {
        int indexElement = 0;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1) {
                indexElement = index;
                break;
            }
        }
        return ((monoHorizontal(board, indexElement)) || (monoVertical(board, indexElement)));
    }
}
