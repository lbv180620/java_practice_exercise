public class Main {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2 };

        try {
            for (int i = 0; i < 4; i++) {
                System.out.printf("a[%d] = %d\n", i, a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています");
        }
    }
}
