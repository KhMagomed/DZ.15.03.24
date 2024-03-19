package ru.netology;

public class Radio {
    private int currentStation;
    private int currentSound;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int newStation){
        if (newStation > 9) {
            return;
        }
        if (newStation < 0){
            return;
        }
        currentStation = newStation;
    }
    public void nextStation() {
        currentStation++;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }
    public void prevStation() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }


    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int newCurrentSound) {
        checkCurrentSound(newCurrentSound);
    }
    public void checkCurrentSound(int newCurrentSound) {
        if (newCurrentSound < 0) {
            newCurrentSound = 0;
        }
        if (newCurrentSound > 100) {
            newCurrentSound = 100;
        }
        currentSound = newCurrentSound;
    }

    public void increaseUpSound() {
        setCurrentSound(currentSound + 1);
    }
    public void increaseDownSound() {
        setCurrentSound(currentSound - 1);
    }
}
