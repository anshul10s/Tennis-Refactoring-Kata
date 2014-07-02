package oops.anshul;


public class ScoreRendrer  {

    final PlayerScoreVO playerScoreVO1;
    final PlayerScoreVO playerScoreVO2;
    
    public ScoreRendrer(Player player1, Player player2) {
        super();
        this.playerScoreVO1 = new PlayerScoreVO(player1);
        this.playerScoreVO2 = new PlayerScoreVO(player2);
    }

    public String getDisplayScore() {
        int result = playerScoreVO1.compareTo(playerScoreVO2);
        if(result == 0) {
            return handleTie();
        } else {
            PlayerScoreVO leading = result > 0 ? playerScoreVO1 : playerScoreVO2;
            PlayerScoreVO trailing = result < 0 ? playerScoreVO1 : playerScoreVO2;
            
            if(isWining(leading, trailing)) {
                return "Win for "+ leading.getPlayerName();
            }
            if(hasAdvantage(leading, trailing)) {
                return "Advantage "+ leading.getPlayerName();
            }

            return playerScoreVO1.getDisplayValue()+"-"+playerScoreVO2.getDisplayValue();
        }
    }

    private boolean hasAdvantage(PlayerScoreVO leading, PlayerScoreVO trailing) {
        return leading.getRawScore() > 3 ;
    }

    private boolean isWining(PlayerScoreVO leading, PlayerScoreVO trailing) {
        return leading.getRawScore() > 3 && (leading.getRawScore() - trailing.getRawScore()) >= 2;
    }

    private String handleTie() {
        if(playerScoreVO1.getRawScore() < 3) {
            return playerScoreVO1.getDisplayValue()+"-All";
        } else {
            return "Deuce";
        }
    }
}
