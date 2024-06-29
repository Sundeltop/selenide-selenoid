package com.example;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class GoogleTest {

    @Test
    void openGooglePageTest() {
        open("https://www.google.com");

        assertThat(title()).isEqualTo("Google");
    }
}
