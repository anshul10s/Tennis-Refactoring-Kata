package oops.anshul;

import kata.problem.TennisGame;

public class TennisGameSolution implements TennisGame {

    final Player player1;
    final Player player2;
    final ScoreRendrer scoreRendrer;
    
    public TennisGameSolution(String player1Name, String player2Name) {
        super();
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.scoreRendrer = new ScoreRendrer(player1, player2);
    }

    public void wonPoint(String playerName) {
        if(playerName.equals(player1.getName())) {
            player1.scoredPoint();
        } else if(playerName.equals(player2.getName())) {
            player2.scoredPoint();
        } else {
            throw new IllegalArgumentException("Player name is not valid");
        }
    }

    public String getScore() {
        return scoreRendrer.getDisplayScore();
    }

}
