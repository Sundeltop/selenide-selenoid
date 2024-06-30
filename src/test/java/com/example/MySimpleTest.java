package com.example;

import com.codeborne.selenide.junit5.BrowserPerTestStrategyExtension;
import com.example.jupiter.SelenoidExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith({BrowserPerTestStrategyExtension.class, SelenoidExtension.class})
public class MySimpleTest {

    @Test
    void openGooglePageTest() {
        open("https://www.google.com");

        sleep(1000);
        assertThat(title()).isEqualTo("Google");
    }

    @Test
    void openYouTubePageTest() {
        open("https://www.youtube.com/");

        sleep(1000);
        assertThat(title()).isEqualTo("YouTube");
    }
}
