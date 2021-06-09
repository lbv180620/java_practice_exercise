import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Team team1 = new Team(args[0]);

    Team team2 = new Team("阪神");
    BaseballGame game1 = new BaseballGame(team1, team2);
    out.printf("%d試合目:", team1.numOfGames);

    game1.playBall();

    out.println("=====================");

    team1.result();

    out.println("=====================");

    team2.result();

    out.println("~~~~~~~~~~~~~~~~~~~~~~");

    Team team3 = new Team("中日");
    BaseballGame game2 = new BaseballGame(team1, team3);
    out.printf("%d試合目", team1.numOfGames);

    game2.playBall();

    out.println("=====================");

    team1.result();

    out.println("=====================");

    team3.result();
  }
}
