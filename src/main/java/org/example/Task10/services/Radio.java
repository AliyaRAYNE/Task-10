package org.example.Task10.services;

public class Radio {
    private int currentRadioStationNumber;
    private int soundVolume;
    private int maxRadioStation = 10;

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            return;
        }
        if (newCurrentRadioStationNumber > maxRadioStation - 1) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == maxRadioStation - 1) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber++;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStation - 1;
        } else {
            currentRadioStationNumber--;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void plusVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void minusVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
