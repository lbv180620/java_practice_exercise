import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class BaseballGame {
  private Team battingFirst;
  private Team fieldingFirst;
  private int battingFirstSum = 0;
  private int fieldingFirstSum = 0;

  public BaseballGame(Team battingFirst, Team fieldingFirst) {
    this.battingFirst = battingFirst;
    this.fieldingFirst = fieldingFirst;
    battingFirst.numOfGames++;
    battingFirst.opponents.put(battingFirst.numOfGames, fieldingFirst.getTeamName());
    fieldingFirst.numOfGames++;
    fieldingFirst.opponents.put(fieldingFirst.numOfGames, battingFirst.getTeamName());
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
        out.printf("%d回%s、%sの得点は: ", i, key, order.get(key).getTeamName());
        String score = br.readLine();
        while (!(score.matches("[0-9]|1[0-9]|20"))) {
          out.print("0~20の半角数字: ");
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
    out.println("試合終了！結果は………");
    if (battingFirstSum > fieldingFirstSum) {
      out.printf("%s%d点、%s%d点で%sの勝ち!\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, battingFirst.getTeamName());
    } else if (battingFirstSum < fieldingFirstSum) {
      out.printf("%s%d点、%s%d点で%sの勝ち!\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, fieldingFirst.getTeamName());
    } else {
      out.printf("%s%d点、%s%d点で引き分け\n", battingFirst.getTeamName(), battingFirstSum, fieldingFirst.getTeamName(),
          fieldingFirstSum, fieldingFirst.getTeamName());
    }
    for (String key : order.keySet()) {
      order.get(key).scores.add(order.get(key).numOfGames - 1, new int[2]);
      switch (key) {
        case "表":
          order.get(key).scores.get(order.get(key).numOfGames - 1)[0] = battingFirstSum;
          order.get(key).scores.get(order.get(key).numOfGames - 1)[1] = fieldingFirstSum;
          break;
        case "裏":
          order.get(key).scores.get(order.get(key).numOfGames - 1)[0] = fieldingFirstSum;
          order.get(key).scores.get(order.get(key).numOfGames - 1)[1] = battingFirstSum;
          break;
      }
    }

  }
}
