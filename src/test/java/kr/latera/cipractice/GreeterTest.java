package kr.latera.cipractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

    @Test
    void name() {
        // given
        String name = "John";

        // when
        String message = Greeter.greet(name);

        // then
        assertThat(message).isEqualTo("Hello, John!");
    }
}
