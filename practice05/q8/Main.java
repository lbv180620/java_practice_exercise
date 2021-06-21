import static java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Random().nextInt(10);
            }
        }
        out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                out.print(matrix[i][j] + " ");
            }
            out.println("");
        }
    }
}
