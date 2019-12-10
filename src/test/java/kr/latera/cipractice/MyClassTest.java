package kr.latera.cipractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyClassTest {

    @Test
    void plus_int() {
        assertThat(new MyClass().plusInt(1, 10)).isEqualTo(11);
    }
}
