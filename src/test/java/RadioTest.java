import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    void nextStation() {
        Radio servise = new Radio();

        servise.setStation(8);
        servise.nextStation();
        int expected = 9;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void nextStation2() {
        Radio servise = new Radio();

        servise.setStation(9);
        servise.nextStation();
        int expected = 0;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevStation() {
        Radio servise = new Radio();

        servise.setStation(8);
        servise.prevStation();
        int expected = 7;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void prevStation2() {
        Radio servise = new Radio();

        servise.setStation(0);
        servise.prevStation();
        int expected = 9;

        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation() {
        Radio servise = new Radio();

        servise.setStation(5);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation2() {
        Radio servise = new Radio();

        servise.setStation(5);
        servise.setStation(20);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void setterStation3() {
        Radio servise = new Radio();

        servise.setStation(5);
        servise.setStation(-4);
        int expected = 5;
        int actual = servise.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume() {
        Radio servise = new Radio();

        servise.setCurrentSound(150);
        servise.increaseUpSound();
        int expected = 100;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume2() {
        Radio servise = new Radio();

        servise.setCurrentSound(98);
        servise.increaseUpSound();
        int expected = 99;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void increaseVolume3() {
        Radio servise = new Radio();

        servise.setCurrentSound(-3);
        servise.increaseDownSound();
        int expected = 0;
        int actual = servise.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}
