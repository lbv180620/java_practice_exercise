import static java.lang.System.*;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        Something target = new Something();

        try {
            Class<?> clazz = target.getClass();

            Method m = clazz.getDeclaredMethod("getHoge");
            m.setAccessible(true);
            String s = (String) m.invoke(null); // staicメソッドにアクセスする場合は、引数はnull
            out.println(s);

            Field f = clazz.getDeclaredField("hoge");
            f.setAccessible(true);
            f.set(null, "fuga"); // staicメソッドにアクセスする場合は、引数はnull
            String s2 = (String) f.get(null); // staicメソッドにアクセスする場合は、引数はnull
            out.println(s2);

            Method m2 = clazz.getDeclaredMethod("setHoge", Something.class, String.class); // ここでこのメソッドがprivateかどうか判定したい
            m2.setAccessible(true);
            m2.invoke(null, target, "Hello!");
            String s3 = (String) m.invoke(null);
            out.println(s3);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}

class Something {

    private static String hoge = "test";

    private static String getHoge() {
        return Something.hoge; // staticフィールドのゲッター
    }

    private static void setHoge(Something obj, String hoge) { // staticメソッドの内部でインスタンスからstaticフィールドにアクセス
        obj.hoge = hoge; // staticフィールドはインスタンスからもアクセスはできる
    }
}
