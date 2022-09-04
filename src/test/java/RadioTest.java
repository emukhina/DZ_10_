
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
        Radio radioman = new Radio();
        Radio radioman1 = new Radio(10);

        @Test
        public void shouldSetStation() {
            radioman.setCurrentStation(4);

            Assertions.assertEquals(4, radioman.getCurrentStation());
        }

        @Test
        public void currentStationMoreThanMax() {
            radioman.setCurrentStation(10);
            Assertions.assertEquals(0, radioman.getCurrentStation());
        }

        @Test
        public void currentStationLessThanMax() {
            radioman.setCurrentStation(-2);
            Assertions.assertEquals(0, radioman.getCurrentStation());
        }

        @Test
        public void nextStation() {

            radioman.setCurrentStation(6);
            radioman.getNextStation();

            Assertions.assertEquals(7, radioman.getCurrentStation());

        }

        @Test
        public void prevStation() {

            radioman.setCurrentStation(4);
            radioman.getPreviosStation();

            Assertions.assertEquals(3, radioman.getCurrentStation());
        }

        @Test
        public void shouldSetOverMaxStation1() {

            radioman.setCurrentStation(9);
            radioman.getNextStation();

            Assertions.assertEquals(0, radioman.getCurrentStation());
        }


        @Test
        public void shouldSetOverMinStation1() {

            radioman.setCurrentStation(0);
            radioman.getPreviosStation();

            Assertions.assertEquals(9, radioman.getCurrentStation());
        }

        @Test
        public void shouldSetOverMinStation2() {

            radioman.setCurrentStation(-1);

            Assertions.assertEquals(0, radioman.getCurrentStation());

        }

        @Test
        public void ShouldSetVolume() {

            radioman.setCurrentVolume(7);

            Assertions.assertEquals(7, radioman.getCurrentVolume());
        }

        @Test
        public void MoreThanMaxVolume() {

            radioman.setCurrentVolume(101);
            radioman.increaseVolume();

            Assertions.assertEquals(1, radioman.getCurrentVolume());
        }

        @Test
        public void lessThanMinVolume1() {

            radioman.setCurrentVolume(0);
            radioman.increaseVolume();

            Assertions.assertEquals(1, radioman.getCurrentVolume());
        }

        @Test
        public void lessThanMinVolume2() {
            radioman.setCurrentVolume(-1);
            radioman.decreaseVolume();

            Assertions.assertEquals(0, radioman.getCurrentVolume());
        }

        @Test
        public void moreThanMaxVolume() {
            radioman.setCurrentVolume(100);
            radioman.increaseVolume();

            Assertions.assertEquals(100, radioman.getCurrentVolume());
        }

        @Test
        public void shouldIncreaseVolume() {

            radioman.setCurrentVolume(5);
            radioman.increaseVolume();

            Assertions.assertEquals(6, radioman.getCurrentVolume());
        }

        @Test
        public void shouldDecreaseVolume() {

            radioman.setCurrentVolume(18);
            radioman.decreaseVolume();

            Assertions.assertEquals(17, radioman.getCurrentVolume());
        }
    }

