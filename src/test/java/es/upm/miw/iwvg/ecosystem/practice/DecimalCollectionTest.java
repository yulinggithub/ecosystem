package es.upm.miw.iwvg.ecosystem.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import static java.util.Collections.*;
import static org.junit.jupiter.api.Assertions.*;

class DecimalCollectionTest {
    private DecimalCollection d;
    @Test
    void add() {
        d = new DecimalCollection();
        d.getCollection().add(12.00);
        System.out.print(d.getCollection().get(0));
    }

    @Test
    void size() {
        d = new DecimalCollection();
        d.getCollection().add(12.00);
        System.out.print(d.getCollection().size());
        assertEquals(1, d.getCollection().size());
    }
