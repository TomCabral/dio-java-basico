public class Tv {
    boolean power = false;
    int chanel = 1;
    int volume = 25;
    
    public void turnOn(){
        power = true;
    }
    public void turnOff(){
        power = false;
    }
    public void increaseVolume(){
        volume++;
    }
    public void decreaseVolume(){
        volume--;
    }
    public void nextChanel(){
        chanel++;
    }
    public void prevChanel(){
        chanel--;
    }
    public void defineChanel(int input){
        chanel = input;
    }
}

