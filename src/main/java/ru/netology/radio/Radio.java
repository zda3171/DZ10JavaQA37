package ru.netology.radio;

public class Radio {
    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadiostation) {
        if (newCurrentRadiostation < 0) {
            newCurrentRadiostation = 0;
        }
        if (newCurrentRadiostation > 9) {
            newCurrentRadiostation = 9;
        }
        currentRadioStation = newCurrentRadiostation;
    }


    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }

        currentVolume = newCurrentVolume;
    }


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
            currentVolume = 10;
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