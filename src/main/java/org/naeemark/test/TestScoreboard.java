package org.naeemark.test;

import org.naeemark.gsl.Scoreboard;
import org.naeemark.gsl.models.Game;

import java.util.List;

public class TestScoreboard {
    public static void main(String[] args) throws InterruptedException {
        /*
        Input:
         a. Mexico 0 - Canada 5
         b. Spain 10 - Brazil 2
         c. Germany 2 - France 2
         d. Uruguay 6 - Italy 6
         e. Argentina 3 - Australia 1
         ----------------------------
         Output:
         1. Uruguay 6 - Italy 6
         2. Spain 10 - Brazil 2
         3. Mexico 0 - Canada 5
         4. Argentina 3 - Australia 1
         5. Germany 2 - France 2
         */

        Scoreboard scoreboard = new Scoreboard();

        Game mexicoCanadaGame = scoreboard.startNewGame("Mexico", "Canada");
        Game spainBrazilGame = scoreboard.startNewGame("Spain", "Brazil");
        Game germanyFranceGame = scoreboard.startNewGame("Germany", "France");
        Game uruguayItalyGame = scoreboard.startNewGame("Uruguay", "Italy");
        Game argentinaAustrailiaGame = scoreboard.startNewGame("Argentina", "Australia");
        printGamesSummary(scoreboard);

        scoreboard.updateScore(mexicoCanadaGame, 0, 5);
        scoreboard.updateScore(spainBrazilGame, 10, 2);
        scoreboard.updateScore(germanyFranceGame, 2, 2);
        scoreboard.updateScore(uruguayItalyGame, 6, 6);
        scoreboard.updateScore(argentinaAustrailiaGame, 3, 1);
        System.out.println("----------------------------");
        printGamesSummary(scoreboard);
    }

    private static void printGamesSummary(Scoreboard scoreboard) {
        List<Game> games = scoreboard.getGamesSummary();
        games.forEach(System.out::println);
    }
}