import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {

    Radio servise = new Radio();
    @Test
    void nextStation() {

        Radio radio = new Radio(5);
        servise.setStation(8);
        servise.nextStation();
        int expected = 9;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void nextStation2() {

        servise.setStation(9);
        servise.nextStation();
        int expected = 0;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevStation() {

        servise.setStation(8);
        servise.prevStation();
        int expected = 7;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevStation2() {

        servise.setStation(0);
        servise.prevStation();
        int expected = 9;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation() {

        servise.setStation(5);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation2() {


        servise.setStation(5);
        servise.setStation(20);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation3() {

        servise.setStation(5);
        servise.setStation(-4);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume() {

        servise.setCurrentSound(150);
        servise.increaseUpSound();
        int expected = 100;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume2() {

        servise.setCurrentSound(98);
        servise.increaseUpSound();
        int expected = 99;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume3() {

        servise.setCurrentSound(-3);
        servise.increaseDownSound();
        int expected = 0;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}
