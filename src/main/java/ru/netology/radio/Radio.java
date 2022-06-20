package ru.netology.radio;

public class Radio {

    public int currentRadioStation;

    public int currentVolume;

    public void nextRadioStation() {
        if (currentRadioStation >= 0) {
            if (currentRadioStation < 9) {
                currentRadioStation = currentRadioStation + 1;
            } else {
                currentRadioStation = 0;
            }
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 9) {
            if (currentRadioStation > 0) {
                currentRadioStation = currentRadioStation - 1;
            } else {
                currentRadioStation = 0;
            }
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}