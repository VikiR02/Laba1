package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {
    @Test
    public void add() {
        Container first = new Container();
        String[] mas_1 = first.add("Mark", "Max", "Lena", "Kate");
        String[] expected = {"Mark", "Max", "Lena", "Kate", null};
        assertArrayEquals("Arrays are not equal", expected, mas_1);

    }

    @Test
    public void remove() {
        Container second = new Container();
        second.add("Mike", "Lee");
        second.remove(1);
        assertNull(second.get(1));

    }

    @Test
    public void testRemove() {
        Container third = new Container();
        third.add("Mike", "Lee", "Jack");
        third.remove("Lee");
        assertEquals("Jack", third.get(1));

    }

    @Test
    public void getSize() {
        {
            Container fourth = new Container();
            fourth.add("Mike", "Lee", "Jack");
            int expected = 3;
            int test_set = fourth.getSize();
            assertEquals(expected, test_set);

        }
    }


}