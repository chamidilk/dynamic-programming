package com.dilshan.dynamicprogramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountConstructTest {

    private final CountConstruct countConstruct = new CountConstruct();

    @Test
    void countConstructWorstCase() {
        // given
        String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
        String[] wordBank = new String[]{"e", "ee", "eee", "eeee", "eeee", "eeeee", "f"};

        // when
        int result = countConstruct.countConstruct(target, wordBank, new HashMap<>());

        // then
        int expected = 153765886;
        assertThat(result).isEqualTo(expected);
    }
}