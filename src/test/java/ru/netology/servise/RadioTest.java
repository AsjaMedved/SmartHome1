package ru.netology.servise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setValidVolume() {  //актуальный звук
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinVolume() { // установка мин звука
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() { // установка макс звука
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToOneMore() {  // увеличение звука на +1
        Radio radio = new Radio();
        radio.setCurrentVolume(75);
        radio.increaseVolume();
        int expected = 76;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setVolumeToOneLower() { // уменьшение звука на -1
        Radio radio = new Radio();
        radio.setCurrentVolume(36);
        radio.decreaseVolume();
        int expected = 35;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMoreMaxVolume() { // переключение больше макс на +1
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMoreMinVolume() {  // переключение зука меньше мин на -1
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

// ВОЛНА

    @Test
    public void setValidWave() {  // актуальная волна
        Radio radio = new Radio();
        radio.setCurrentWave(7);
        int expected = 7;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxWave() {  // установка макс волны
        Radio radio = new Radio();
        radio.setCurrentWave(10);
        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMinWave() {  // установка мин волны
        Radio radio = new Radio();
        radio.setCurrentWave(-1);
        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setWaveToOneMore() {  // увеличение волны на +1
        Radio radio = new Radio();
        radio.setCurrentWave(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextWaveFromMaxToMin() {  // переход с 9 на 0
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setWaveToOneLower() { // уменьшение волны на -1
        Radio radio = new Radio();
        radio.setCurrentWave(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevWaveFromMinToMax() { // переход с 0 на 9
        Radio radio = new Radio();
        radio.setCurrentWave(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentWave();
        Assertions.assertEquals(expected, actual);
    }
}