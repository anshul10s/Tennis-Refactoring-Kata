package oops.anshul;

public class PlayerScoreVO implements Comparable<PlayerScoreVO> {
    private final Player player;
    
    public PlayerScoreVO(Player player) {
        this.player = player;
    }
    
    /**
     * Need to be called only when game is not in advantage/deuce condition.
     * As the score display in that case is dependent on other player score and 
     * responsibility of Game
     * @return
     */
    public String getDisplayValue() {
        String displayName = null;
        switch(player.getScore())
        {
            case 0:
                displayName ="Love";
                break;
            case 1:
                displayName ="Fifteen";
                break;
            case 2:
                displayName ="Thirty";
                break;
            case 3:
                displayName ="Forty";
                break;
        }
        return displayName;
    }
    
    public int getRawScore() {
        return player.getScore();
    }

    public String getPlayerName() {
        return player.getName();
    }

    public int compareTo(PlayerScoreVO arg0) {
        return new Integer(this.getRawScore()).compareTo(arg0.getRawScore());
    }
    
}
