package com.twaran.saqib;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    @Test
    void shouldReturnFizzIfNumberIsMultipleOf3()  throws NonPositiveNumberException{
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String convertedNumber = fizzBuzz.convert(number);

        assertThat(convertedNumber, is("fizz"));
    }

    @Test
    void shouldReturnBuzzIfNumberIsMultipleOf5()  throws NonPositiveNumberException{
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);
        assertThat(convertedNumber, is("buzz"));
    }

    @Test
    void shouldReturnFizzBuzzIfNumberIsMultipleOf3And5()  throws NonPositiveNumberException{
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);
        assertThat(convertedNumber, is("fizzbuzz"));
    }

    @Test
    void shouldReturnSameNumberIfNumberIsNotMultipleOf3And5()  throws NonPositiveNumberException{
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);
        assertThat(convertedNumber, is(String.valueOf(number)));
    }

    @Test
    void shouldReturnNonPositiveNumberExceptionIfNumberIsNegative() throws NonPositiveNumberException{
        int number = -1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThrows(NonPositiveNumberException.class, () -> fizzBuzz.convert(number));
    }
}
