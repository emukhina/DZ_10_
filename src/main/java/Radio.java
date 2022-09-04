public class Radio {

    public int currentStation;
    public int minStation = 0;
    public int maxStation = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;
    public int amountStation = 10;

    public Radio() {
        this.amountStation = amountStation;
        this.maxStation = amountStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void getNextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
            return;
        } else {
            currentStation++;
        }
    }

    public void getPreviosStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
            return;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            return;
        } else {
            currentVolume++;
        }
    }
        public void decreaseVolume() {
            if (currentVolume <= minVolume) {
                return;
            } else {
                currentVolume--;
            }

        }
    }

