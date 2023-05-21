import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio= new Radio();

    @Test
    void shouldStation() {
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNextStation() {
        radio.setCurrentStation(6);
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        radio.setCurrentStation(4);
        radio.previousStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void test() {
        Radio radio = new Radio(10);

        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    void shouldChangeVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());

    }

    @Test
    void shouldIncreaseVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void shouldIncreaseVolume2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void shouldOverMaxVolume1() {
        radio.setCurrentVolume(21);
        radio.increaseVolume();
        assertEquals(22, radio.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolume2() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(12, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    void MinVolume1() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void MinVolume2() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void MaxVolume() {
        radio.setCurrentVolume(101);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }


}