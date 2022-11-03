package ru.netology.radio;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int numberOfStations = 9;
    private int maxVolume = 10;

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {

        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber >= numberOfStations) {
            return;
        }
        this.currentStationNumber = newCurrentStationNumber;
    }


    public int getNumberOfStations() {
        return numberOfStations;
    }


    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setVolumeToMaximum() {
        this.currentVolume = maxVolume;
    }

    public void setStationNumberToMaximum() {
        this.currentStationNumber = numberOfStations;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }

    }

    public void increaseStationNumber() {
        if (currentStationNumber < numberOfStations) {
            this.currentStationNumber++;
        } else {
            this.currentStationNumber = 0;
        }
    }


    public void decreaseStationNumber() {
        if (currentStationNumber > 0) {
            this.currentStationNumber--;
        } else {
            this.currentStationNumber = numberOfStations;
        }

    }

}
