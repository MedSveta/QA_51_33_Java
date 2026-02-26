package my_array_tests;

import lesson_10.MyArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayTests {
    MyArray numbers;
    MyArray strings;
    Integer[] arNumbers = {10, 7, 11, -2, 13, 10, 2000};
    String[] arStrings = {"abc", "lmn", "po", "abc"};

    @BeforeEach
    void setUp() throws Exception {
        numbers = new MyArray();
        for (Integer num : arNumbers) {
            numbers.add(num);
        }
        strings = new MyArray();
        for (String str : arStrings) {
            strings.add(str);
        }
    }

    @Test
    void testAddObject() {
        int sizeNumbers = numbers.size();
        int sizeStrings = strings.size();
        assertEquals(arNumbers.length, sizeNumbers);
        assertEquals(arStrings.length, sizeStrings);
        for (int i = 0; i < arNumbers.length; i++) {
            assertEquals(arNumbers[i], numbers.get(i));
        }
        for (int i = 0; i < arStrings.length; i++) {
            assertEquals(arStrings[i], strings.get(i));
        }
        assertFalse(numbers.add(null));
        assertEquals(arNumbers.length, sizeNumbers);

        assertTrue(numbers.add("Cat"));
        assertEquals(arNumbers.length + 1, numbers.size());
    }

    @Test
    void testGet() {
        assertEquals(10, numbers.get(0));
        assertEquals(2000, numbers.get(numbers.size() - 1));
        assertNull(numbers.get(-1));
        assertNull(numbers.get(numbers.size()));
    }

    @Test
    void testAddIndexObject() {
        int value = 100;
        int index = 0;
        assertTrue(numbers.add(index, value));
        assertEquals(arNumbers.length + 1, numbers.size());
        assertEquals(100, numbers.get(index));
        Integer[] numExp = {100, 10, 7, 11, -2, 13, 10, 2000};
        assertArrayEquals(numExp, numbers.toArray());

        assertFalse(numbers.add(-1, 123));
        assertArrayEquals(numExp, numbers.toArray());

        assertFalse(numbers.add(numbers.size() + 1, 123));
        assertArrayEquals(numExp, numbers.toArray());

        assertFalse(numbers.add(1, null));
        assertArrayEquals(numExp, numbers.toArray());
    }

    @Test
    void testSize() {
        assertEquals(arNumbers.length, numbers.size());
        assertTrue(numbers.add(678));
        assertEquals(arNumbers.length + 1, numbers.size());
        assertTrue(numbers.remove((Integer)678));
        assertEquals(arNumbers.length, numbers.size());
    }

    @Test
    void testRemoveInt(){
        int index = 0;
        Integer[] arExp = {7, 11, -2, 13, 10, 2000};
        assertEquals(10, numbers.remove(index));
        assertArrayEquals(arExp, numbers.toArray());

        assertNull(numbers.remove(-1));
        assertArrayEquals(arExp, numbers.toArray());

    }

    @Test
    void testRemoveObject(){
        Integer[] arExp = {10, 7, 11, 13, 10, 2000};
        Integer value = -2;
        assertTrue(numbers.remove(value));
        assertArrayEquals(arExp, numbers.toArray());

        value = 8;
        assertFalse(numbers.remove(value));
        assertArrayEquals(arExp, numbers.toArray());
        assertFalse(numbers.remove(null));
        assertArrayEquals(arExp, numbers.toArray());
    }
}
