public class Radio {

    public int currentStation;
    public int minStation = 0;
    public int maxStation = 9;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

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

    public void getNextStation(int newCurrentStation) {
        if (maxStation <= newCurrentStation) {
            newCurrentStation = minStation;
        } else {
            setCurrentStation(newCurrentStation = newCurrentStation + 1);
        }
        currentStation = newCurrentStation;
    }

    public void getPreviosStation(int newCurrentStation) {
        if (minStation >= newCurrentStation) {
            newCurrentStation = maxStation;
        } else {
            setCurrentStation(newCurrentStation = newCurrentStation - 1);
        }
        currentStation = newCurrentStation;
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

    public void setIncreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        } else {
            setCurrentVolume(newCurrentVolume = newCurrentVolume + 1);
        }
    }
}
