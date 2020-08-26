package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {
    @Test
    void shouldScoreOnes() {
        assertEquals(4, new YatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, new YatzyGame().score(YatzyCategory.ONES, new int[]{1, 1, 2, 3, 5}));
    }

    @Test
    void shouldScoreTwo() {
        assertEquals(6, new YatzyGame().score(YatzyCategory.TWOS, new int[]{2, 2, 2, 4, 4}));
        assertEquals(4, new YatzyGame().score(YatzyCategory.TWOS, new int[]{1, 2, 2, 3, 5}));

    }
    @Test
    void shouldScoreThree() {
        assertEquals(9, new YatzyGame().score(YatzyCategory.THREES, new int[]{2, 3, 2, 3, 3}));
        assertEquals(4, new YatzyGame().score(YatzyCategory.THREES, new int[]{3, 3, 2, 3, 3));

    }
}