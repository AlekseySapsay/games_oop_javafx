package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest) {
        throw new IllegalStateException(
                String.format("Could not way by diagonal from %s to %s", source, dest)
        );
    }

    /**
     Мы добавили новое поведение. Ваша задача написать на него тесты.
     Нужно проверить, что если мы передали начальную и конечную ячейки,
     через которые нельзя провести диагональ, нужно выкинуть исключение.
    **/


//    @Override
//    public Cell[] way(Cell dest) {
//        if (!isDiagonal(position, dest)) {
//            throw new ImpossibleMoveException(String.format("Could not move by diagonal from %s to %s" +
//                    "", source, dest));
//        }
//
//        int size = Math.abs(dest.getX() - source.getX()); //  do refactor
//        Cell[] steps = new Cell[size];
//        int deltaX = 0;//  do refactor
//        int deltaY = 0;//  do refactor
//        for (int index = 0; index < size; index++) {
//            int x = 0; // do refactor
//            int y = 0; // do refactor
//            steps[index] = Cell.findBy(x,y);//  do refactor
//        }
//        return steps;
//    }

    public boolean isDiagonal(Cell source, Cell dest) {
        /* TODO check diagonal */
        return false;
    }

    /**
     * Этот метод создаст объект класса с позицией dest.
     * Все фигуры в нашем проекте будут одноразовые.
     * При переходе из одной клетки в другую, мы будем
     * создавать новый объект с новой позицией, а старый
     * будем удалять.
     */
    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
