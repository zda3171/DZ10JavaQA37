package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.currentRadioStation = 5;

        int expected = 5;
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio();

        station.currentRadioStation = 9;

        station.nextRadioStation();

        int expected = 0;
        int actual = station.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 7;

        int expected = 7;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);


    }
}
