package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        station.getNextRadioStation();


        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-5);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNoValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(15);

        station.getNextRadioStation();

        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrewMinRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrewNoValidRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(15);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetPrewRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(-4);

        station.getPrevRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrewAverRadioStation() {
        Radio station = new Radio();

        station.setCurrentRadioStation(5);

        station.getPrevRadioStation();

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {

        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetincreaseMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetincreaseMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetincreaseAverVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(5);

        volume.increaseVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetincreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(150);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetreduceMinVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetreduceMaxVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        volume.reduceVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetreduceAverVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        volume.reduceVolume();

        int expected = 6;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetreduceNovalidNegVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(-5);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetreduceNovalidVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(150);

        volume.reduceVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
