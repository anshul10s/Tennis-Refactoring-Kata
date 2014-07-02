package oops.anshul;

public class Player {
    
    private final String name;
    private int score = 0;
    
    public Player(String name) {
        super();
        this.name = name;
    }

    public void scoredPoint() {
        score++;
    }
    
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    
}
