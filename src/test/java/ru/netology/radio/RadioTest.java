package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {

    @Test
    void shouldUseNumberOfStations() {
        Radio rad1 = new Radio(7);

        assertEquals(7, rad1.getNumberOfStations());
    }


    @Test
    public void setCurrentStationNumber() {
        Radio rad1 = new Radio(7);

        rad1.setCurrentStationNumber(5);

        assertEquals(5, rad1.getCurrentStationNumber());
    }

    @Test
    public void setCurrentStationNumberOverLimit() {
        Radio rad1 = new Radio(7);

        rad1.setCurrentStationNumber(6);

        assertEquals(6, rad1.getCurrentStationNumber());
    }

    @Test
    public void getCurrentStationNumber() {
        Radio rad1 = new Radio(7);

        assertEquals(0, rad1.getCurrentStationNumber());
    }

    @Test
    public void setCurrentStationNumberUnderLimit() {
        Radio rad1 = new Radio(7);

        rad1.setCurrentStationNumber(-1);

        assertEquals(0, rad1.getCurrentStationNumber());
    }


    @Test
    public void getCurrentVolume() {
        Radio rad2 = new Radio();

        assertEquals(0, rad2.getCurrentStationNumber());
    }

    @Test
    public void setCurrentVolume() {
        Radio rad2 = new Radio();
        rad2.setCurrentVolume(7);

        assertEquals(7, rad2.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUnderLimit() {
        Radio rad2 = new Radio();

        rad2.setCurrentVolume(-1);

        assertEquals(0, rad2.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverLimit() {
        Radio rad2 = new Radio();

        rad2.setCurrentVolume(11);

        assertEquals(0, rad2.getCurrentVolume());
    }

    @Test
    void setVolumeToMaximum() {
        Radio rad = new Radio();
        rad.setVolumeToMaximum();

        assertEquals(10, rad.getCurrentVolume());
    }

    @Test
    void increaseVolumeFromMax() {
        Radio rad2 = new Radio();
        rad2.setCurrentVolume(10);

        rad2.increaseVolume();

        assertEquals(10, rad2.getCurrentVolume());

    }

    @Test
    void increaseVolumeFrom50() {
        Radio rad2 = new Radio();
        rad2.setCurrentVolume(5);

        rad2.increaseVolume();

        assertEquals(6, rad2.getCurrentVolume());

    }

    @Test
    void increaseVolumeToMaximum() {
        Radio rad2 = new Radio();
        rad2.setVolumeToMaximum();


        assertEquals(10, rad2.getCurrentVolume());

    }

    @Test
    void increaseStationNumberFromMaximum() {
        Radio rad2 = new Radio();
        rad2.setStationNumberToMaximum();
        rad2.increaseStationNumber();


        assertEquals(0, rad2.getCurrentStationNumber());

    }

    @Test
    void increaseVolumeToMin() {
        Radio rad2 = new Radio();
        rad2.setCurrentVolume(-1);


        assertEquals(0, rad2.getCurrentVolume());

    }


    @Test
    void decreaseVolume() {
        Radio rad2 = new Radio();
        rad2.setCurrentVolume(7);
        rad2.decreaseVolume();

        assertEquals(6, rad2.getCurrentVolume());

    }

    @Test
    void decreaseVolumeToMinimum() {
        Radio rad = new Radio(7);
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        assertEquals(0, rad.getCurrentVolume());

    }


    @Test
    void increaseStationNumber() {
        Radio rad = new Radio(7);
        rad.setCurrentStationNumber(5);
        rad.increaseStationNumber();

        assertEquals(6, rad.getCurrentStationNumber());

    }

    @Test
    void increaseStationNumberToMaximum() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(7);
        rad1.increaseStationNumber();

        assertEquals(1, rad1.getCurrentStationNumber());

    }

    @Test
    void increaseStationNumberToMaximum2() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(6);
        rad1.increaseStationNumber();

        assertEquals(7, rad1.getCurrentStationNumber());

    }

    @Test
    void increaseStationNumberOverMaximum() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(9);
        rad1.increaseStationNumber();

        assertEquals(1, rad1.getCurrentStationNumber());

    }

    @Test
    void increaseStationNumberToMinimum() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(-2);
        rad1.increaseStationNumber();

        assertEquals(1, rad1.getCurrentStationNumber());

    }

    @Test
    void decreaseStationNumber() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(2);
        rad1.decreaseStationNumber();

        assertEquals(1, rad1.getCurrentStationNumber());

    }

    @Test
    void decreaseStationNumberToMinimum() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(-1);
        rad1.decreaseStationNumber();

        assertEquals(7, rad1.getCurrentStationNumber());

    }

    @Test
    void decreaseStationNumberToMinimum2() {
        Radio rad1 = new Radio(7);
        rad1.setCurrentStationNumber(0);
        rad1.decreaseStationNumber();

        assertEquals(7, rad1.getCurrentStationNumber());

    }

}