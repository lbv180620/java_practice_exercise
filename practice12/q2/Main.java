public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    System.out.printf("%d / %d = %d ", i, j, i / j);
                } catch (ArithmeticException e) {
                    System.out.println("0で割り算はできません。");
                }
            }
            System.out.println();
        }

    }
}

// try{}の内側の処理が終了して、次にcatch{}の処理が実行される。その後はcatch{}のあとの処理が実行される。
