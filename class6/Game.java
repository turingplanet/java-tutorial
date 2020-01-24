public class Game {
    private int score;
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        if(score < 0 || score > 100) {
            System.out.println("Score Error");
            return;
        }
        this.score = score;
    }
}