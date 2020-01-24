package hw6;

public class VideoGame extends Game{
    public void displayInfo() {
        System.out.printf("Type: video, Score: " + this.getScore());
    }
}