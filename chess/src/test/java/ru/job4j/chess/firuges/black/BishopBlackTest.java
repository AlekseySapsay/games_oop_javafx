package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest extends TestCase {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(bishopBlack.position(),Cell.C1);
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertEquals(bishopBlack.copy(Cell.D2).position(),Cell.D2);
    }

    @Test
    public void testWay(){

    }
}