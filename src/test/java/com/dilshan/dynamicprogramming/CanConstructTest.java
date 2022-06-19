package com.dilshan.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.*;

class CanConstructTest {

    private final CanConstruct canConstruct = new CanConstruct();

    @Test
    public void canConstruct() {
        // given
        String target = "potato";
        String[] wordBank = new String[]{"pot", "a", "ato"};

        // when
        boolean result = canConstruct.canConstruct(target, wordBank, new HashMap<>());

        // then
        boolean expected = true;
        assertThat(result).isEqualTo(expected);

    }

    @Test
    public void canConstructWorstCase() {
        // given
        String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
        String[] wordBank = new String[]{"e", "ee", "eee", "eeee", "eeee", "eeeee"};

        // when
        boolean result = canConstruct.canConstruct(target, wordBank, new HashMap<>());

        // then
        boolean expected = false;
        assertThat(result).isEqualTo(expected);

    }

}