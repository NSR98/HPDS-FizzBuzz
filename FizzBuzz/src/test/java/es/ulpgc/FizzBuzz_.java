package es.ulpgc;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzz_ {

    @Test
    public void given_1_should_return_1() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    public void given_2_should_return_2() {
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    public void given_a_number_multiple_of_3_should_return_fizz() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void given_a_number_multiple_of_5_should_return_buzz() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void given_a_number_multiple_of_3_and_5_should_return_fizzbuzz() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

}
