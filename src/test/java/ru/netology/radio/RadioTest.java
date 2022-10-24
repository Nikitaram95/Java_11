package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    private int minVolume = 0;
    private int maxVolume = 10;
    private int minStation = 0;
    private int maxStation = 10;

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio(1, 9, minStation, maxStation, minVolume, maxVolume);
        int expected = 9;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldInvalidMaxSetCurrentVolume() {
        int expected = 10;
        Radio radio = new Radio(1, expected);
        radio.setCurrentVolume(10);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldInvalidMinSetCurrentVolume() {
        int expected = 10;
        Radio radio = new Radio(1, 10);
        radio.setCurrentVolume(-1);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseCurrentVolume() {
        Radio radio = new Radio(1, 1, minStation, maxStation, minVolume, maxVolume);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio(1, 8, minStation, maxStation, minVolume, maxVolume);
        int expected = 5;
        radio.setCurrentStation(expected);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldInvalidMinSetCurrentStation() {
        int expected = 5;
        Radio radio = new Radio(expected, 8);
        radio.setCurrentStation(-1);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldInvalidMaxSetCurrentStation() {
        int expected = 9;
        Radio radio = new Radio(expected, 10);
        radio.setCurrentStation(12);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldNextRadioStation() {
        Radio radio = new Radio(10, 8, minStation, maxStation, minVolume, maxVolume);
        radio.nextStation();
        radio.nextStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radio radio = new Radio(1, 8, minStation, maxStation, minVolume, maxVolume);
        radio.prevStation();
        radio.prevStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }
}