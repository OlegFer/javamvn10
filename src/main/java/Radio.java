public class Radio {
    private int numberStations = 10;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }

    // Конструктор с параметром для задания количества радиостанций
    public Radio(int numberStations) {
        this.numberStations = numberStations;
        this.currentStation = 0; // По умолчанию текущая станция - 0
        this.currentVolume = 0; // По умолчанию уровень громкости - 0
    }

    // Конструктор без параметров, устанавливающий количество радиостанций по умолчанию равным 10
    public Radio() {
        this.numberStations = 10;
        this.currentStation = 0; // По умолчанию текущая станция - 0
        this.currentVolume = 0; // По умолчанию уровень громкости - 0
    }

    // Сеттер для установки текущей радиостанции
    public void setCurrentStation(int station) {
        if (station >= 0 && station < numberStations) {
            currentStation = station;
        }
    }

    // Метод для переключения на следующую радиостанцию
    public void nextStation() {
        currentStation = (currentStation + 1) % numberStations;
    }

    // Метод для переключения на предыдущую радиостанцию
    public void previousStation () {
        currentStation = (currentStation - 1 + numberStations) % numberStations;
    }

    public int getCurrentVolume () {
        return currentVolume;
    }

    public void setCurrentVolume ( int currentVolume){
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume () {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume () {
        if (currentVolume > 0) {
            currentVolume--;

        }
    }


}