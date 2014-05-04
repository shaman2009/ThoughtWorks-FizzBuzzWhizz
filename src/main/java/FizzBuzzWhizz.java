import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouroc on 5/4/14.
 */
public class FizzBuzzWhizz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public List<String> count(int x, int y, int z, int sum) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= sum; i++) {
            if((i >= 10 * x && i < 10 * (x + 1))) {
                list.add(FIZZ);
                continue;
            }
            if((i - x) % 10 == 0) {
                list.add(FIZZ);
                continue;
            }

            if(i % x == 0 && i % y == 0 & i % z == 0) {
                list.add(FIZZ + BUZZ + WHIZZ);
                continue;
            }
            if(i % x == 0 && i % y == 0) {
                list.add(FIZZ + BUZZ);
                continue;
            }
            if(i % x == 0 && i % z == 0) {
                list.add(FIZZ + WHIZZ);
                continue;
            }
            if(i % y == 0 && i % z == 0) {
                list.add(BUZZ + WHIZZ);
                continue;
            }
            if(i % x == 0) {
                list.add(FIZZ);
                continue;
            }
            if(i % y == 0) {
                list.add(BUZZ);
                continue;
            }
            if(i % z == 0) {
                list.add(WHIZZ);
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }
}
