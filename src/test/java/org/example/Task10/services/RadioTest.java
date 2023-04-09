package org.example.Task10.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNextZeroStation() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationMinus() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationlimit() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(19);
        int expected = 0;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setValidStation() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(6);
        int expected = 6;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void next1() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(8);
        other.next();
        int expected = 9;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void next2() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(9);
        other.next();
        int expected = 0;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev1() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(9);
        other.prev();
        int expected = 8;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio other = new Radio();
        other.setCurrentRadioStationNumber(0);
        other.prev();
        int expected = 9;
        int actual = other.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setVolume1() {
        Radio other = new Radio();
        other.setSoundVolume(100);
        int expected = 100;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume2() {
        Radio other = new Radio();
        other.setSoundVolume(0);
        int expected = 0;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume3() {
        Radio other = new Radio();
        other.setSoundVolume(20);
        int expected = 20;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume4() {
        Radio other = new Radio();
        other.setSoundVolume(-1);
        int expected = 0;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume5() {
        Radio other = new Radio();
        other.setSoundVolume(101);
        int expected = 0;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume6() {
        Radio other = new Radio();
        other.setSoundVolume(99);
        int expected = 99;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume7() {
        Radio other = new Radio();
        other.setSoundVolume(1);
        int expected = 1;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void plusVolume1() {
        Radio other = new Radio();
        other.setSoundVolume(0);
        other.plusVolume();
        int expected = 1;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume2() {
        Radio other = new Radio();
        other.setSoundVolume(99);
        other.plusVolume();
        int expected = 100;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume3() {
        Radio other = new Radio();
        other.setSoundVolume(100);
        other.plusVolume();
        int expected = 100;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void minusVolume1() {
        Radio other = new Radio();
        other.setSoundVolume(100);
        other.minusVolume();
        int expected = 99;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume2() {
        Radio other = new Radio();
        other.setSoundVolume(1);
        other.minusVolume();
        int expected = 0;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume3() {
        Radio other = new Radio();
        other.setSoundVolume(0);
        other.minusVolume();
        int expected = 0;
        int actual = other.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
}
