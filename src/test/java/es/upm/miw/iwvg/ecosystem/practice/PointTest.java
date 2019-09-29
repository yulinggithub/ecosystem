package es.upm.miw.iwvg.ecosystem.practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PointTest {
    private Point point;

    @Test
    void testModule(){
        point = new Point(1,1,1);
        System.out.print(point.module());
        assertEquals(Math.sqrt(2), point.module());
    }

    @Test
    void testPhase(){
        point = new Point(1,1,1);
        System.out.print(point.phase());
        assertEquals( Math.atan(1), point.phase());
    }


    @Test
    void testTranslateOrigin(){
        point = new Point(1,1,1);
        Point origin;
        origin = new Point(0,0,0);
        point.translateOrigin(origin);
        System.out.print(point.getX());
        System.out.print(point.getY());
        System.out.print(point.getZ());
        assertEquals( 1, point.getX());
        assertEquals( 1, point.getY());
        assertEquals( 0, point.getZ());
    }

    @Test
    void testToString(){
        point = new Point(1,1,1);
        System.out.print(point.toString());
        assertEquals( "Point{x=1, y=1, z=0}", point.toString());
    }
}