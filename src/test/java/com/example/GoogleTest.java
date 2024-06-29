package com.example;

import com.example.jupiter.SelenoidExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SelenoidExtension.class)
public class GoogleTest {

    @Test
    void openGooglePageTest() {
        open("https://www.google.com");

        assertThat(title()).isEqualTo("Google");
    }
}
