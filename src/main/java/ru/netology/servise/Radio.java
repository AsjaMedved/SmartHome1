package ru.netology.servise;

public class Radio {
    // ЗВУК

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // ВОЛНА

    private int currentWave;

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int newCurrentWave) {
        if (newCurrentWave < 0) {
            currentWave = 9;
            return;
        }
        if (newCurrentWave > 9) {
            currentWave = 0;
            return;
        }
        currentWave = newCurrentWave;
    }

    public void next() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave > 0) {
            currentWave = currentWave - 1;
        } else {
            currentWave = 9;
        }
    }
}
