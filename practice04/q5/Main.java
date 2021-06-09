import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Team kyojin = new Team(args[0]);
    Team hanshin = new Team(args[1]);

    BaseballGame game = new BaseballGame(kyojin, hanshin);

    game.playBall();

    out.println("=====================");

    kyojin.result();

    out.println("=====================");

    hanshin.result();
  }
}
