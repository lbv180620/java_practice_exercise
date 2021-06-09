import static java.lang.System.*;
import java.util.*;

public class Team {
  private String taemName;

  List<int[]> scores = new ArrayList<>();

  Map<Integer, String> opponents = new LinkedHashMap<>(); // キー：ｘ試合目、値：対戦相手
  int numOfGames = 0;

  public Team(String teamName) {
    this.taemName = teamName;
  }

  public String getTeamName() {
    return this.taemName;
  }

  public void result() {
    out.printf("%sの対戦成績\n", this.taemName);
    for (int key : opponents.keySet()) {
      out.printf("%d試合目 対戦相手:%s\n", key, opponents.get(key));
      if (scores.get(key - 1)[0] > scores.get(key - 1)[1]) {
        out.printf("%d対%dで勝ち\n", scores.get(key - 1)[0], scores.get(key - 1)[1]);
      } else if (scores.get(key - 1)[0] < scores.get(key - 1)[1]) {
        out.printf("%d対%dで負け\n", scores.get(key - 1)[0], scores.get(key - 1)[1]);
      } else {
        out.printf("%d対%dで引き分け\n", scores.get(key - 1)[0], scores.get(key - 1)[1]);
      }
      out.println("--------------------------");
    }
  }
}
