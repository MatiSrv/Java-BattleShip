package ar.edu.utn.frc.tup.lciii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {

    @Test
    void testEquals() {
        Position p = new Position( 0, 0);
        Ship s = new Ship(p, ShipStatus.AFLOAT);

        Position position = new Position(0,0);
        Ship ship = new Ship(position,ShipStatus.AFLOAT);
        boolean actual =  s.equals(ship);
        boolean expected = true;

        assertEquals(expected, actual);
    }
}