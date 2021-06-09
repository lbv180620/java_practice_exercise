import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class BaseballGame {
  private Team battingFirst;
  private Team fieldingFirst;
  private int battingFirstScore = 0;
  private int fieldingFirstScore = 0;

  private int battingFirstSum = 0;
  private int fieldingFirstSum = 0;

  public BaseballGame(Team battingFirst, Team fieldingFirst) {
    this.battingFirst = battingFirst;
    this.fieldingFirst = fieldingFirst;
    battingFirst.opponents.put(battingFirst.numOfGames + 1, fieldingFirst.getTeamName());
    fieldingFirst.opponents.put(fieldingFirst.numOfGames + 1, battingFirst.getTeamName());
  }

  public void playBall() throws IOException {
    out.printf("先行: %s\n", battingFirst.getTeamName());
    out.println("プレイボール！");
    out.println("---------------------");

    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    Map<String, Team> order = new LinkedHashMap<>();
    order.put("表", battingFirst);
    order.put("裏", fieldingFirst);

    for (int i = 1; i <= 9; i++) {
      for (String key : order.keySet()) {
        out.printf("%d回%s、%sの得点は", i, key, order.get(key).getTeamName());
        String score = br.readLine();
        while (!(score.matches("[0-9]|1[0-9]|20"))) {
          score = br.readLine();
        }
        int scoreInt = Integer.valueOf(score);
        out.printf("%d点\n", scoreInt);
        out.println("--------------------");
        if (key.matches("表")) {
          battingFirstSum += scoreInt;
        } else if (key.matches("裏")) {
          fieldingFirstSum += scoreInt;
        }
      }
    }
    if (battingFirstSum > fieldingFirstSum) {
      out.printf("%s:%d点、%s:%d点で%sの勝ち\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, battingFirst.getTeamName());
    } else if (battingFirstSum < fieldingFirstSum) {
      out.printf("%s:%d点、%s:%d点で%sの勝ち\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, fieldingFirst.getTeamName());
    } else {
      out.printf("%s:%d点、%s:%d点で引き分け\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, fieldingFirst.getTeamName());
    }
  }
}
