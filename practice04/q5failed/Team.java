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

  }
}
