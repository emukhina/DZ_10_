
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radioman = new Radio();
        radioman.setCurrentStation(4);

        int expected = 4;
        int actual = radioman.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationMoreThanMax() {
        Radio radioman = new Radio();
        radioman.setCurrentStation(12);

        int expected = 0;
        int actual = radioman.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentStationLessThanMax() {
        Radio radioman = new Radio();
        radioman.setCurrentStation(-2);

        int expected = 0;
        int actual = radioman.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radioman = new Radio();

        radioman.getNextStation(4);
        int expected = 5;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxStation1() {
        Radio radioman = new Radio();

        radioman.getNextStation(9);
        int expected = 0;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMaxStation2() {
        Radio radioman = new Radio();

        radioman.getNextStation(10);
        int expected = 0;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMinStation1() {
        Radio radioman = new Radio();

        radioman.getPreviosStation(0);
        int expected = 9;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetOverMinStation2() {
        Radio radioman = new Radio();

        radioman.getPreviosStation(-1);
        int expected = 9;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio radioman = new Radio();

        radioman.getPreviosStation(5);
        int expected = 4;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolume() {
        Radio radioman = new Radio();
        radioman.setCurrentVolume(7);

        int expected = 7;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreThanMaxVolume() {
        Radio radioman = new Radio();
        radioman.setCurrentVolume(11);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinVolume1() {
        Radio radioman = new Radio();
        radioman.setCurrentVolume(0);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinVolume2() {
        Radio radioman = new Radio();
        radioman.setCurrentVolume(-1);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMinVolume() {
        Radio radioman = new Radio();
        radioman.setIncreaseVolume(11);

        int expected = 0;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radioman = new Radio();
        radioman.setIncreaseVolume(5);

        int expected = 6;
        int actual = radioman.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}

