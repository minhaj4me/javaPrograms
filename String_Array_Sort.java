import java.sql.Array;
import java.util.Arrays;

public class String_Array_Sort {
    public static void main(String[] args) {
        String[] s = { "10", "3", "c", "1", "a", "b", "4", "7" };
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}
