package com.twaran.saqib;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfNumberIsMultipleOf3() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber, is("fizz"));


    }
}
