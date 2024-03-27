package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int currentSound;
    private int maxSound = 100;

    public Radio (int maxStation){
        this.maxStation = maxStation -1;
    }
    public Radio (){
        this.maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setStation(int newStation){
        if (newStation > maxStation) {
            return;
        }
        if (newStation < 0){
            return;
        }
        currentStation = newStation;
    }
    public void nextStation() {
        currentStation++;
        if (currentStation > maxStation) {
            currentStation = 0;
        }
    }
    public void prevStation() {
        currentStation--;
        if (currentStation < 0) {
            currentStation = maxStation;
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
        if (newCurrentSound > maxSound) {
            newCurrentSound = maxSound;
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
