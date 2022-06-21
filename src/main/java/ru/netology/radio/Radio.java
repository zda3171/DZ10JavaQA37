package ru.netology.radio;

public class Radio {

    public int currentRadioStation;

    public int currentVolume;

    public void getNextRadioStation() {
        if (currentRadioStation >= 0) {
            if (currentRadioStation < 9) {
                currentRadioStation = currentRadioStation + 1;
            } else {
                currentRadioStation = 0;
            }
        } else {
            currentRadioStation = 0;
        }
    }

    public void getPrevRadioStation() {
        if (currentRadioStation <= 9) {
            if (currentRadioStation > 0) {
                currentRadioStation = currentRadioStation - 1;
            } else {
                currentRadioStation = 9;
            }
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume =10;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

}