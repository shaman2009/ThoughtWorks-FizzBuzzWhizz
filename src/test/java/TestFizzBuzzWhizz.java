import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ouroc on 5/4/14.
 */
public class TestFizzBuzzWhizz {

    @Test
    public void return_1_10_with_3_5_7() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        List<String> actual = fizzBuzzWhizz.count(3, 5, 7, 10);
        List<String> expect = new ArrayList<String>();
        expect.add("1");
        expect.add("2");
        expect.add("Fizz");
        expect.add("4");
        expect.add("Buzz");
        expect.add("Fizz");
        expect.add("Whizz");
        expect.add("8");
        expect.add("Fizz");
        expect.add("Buzz");
        Assert.assertEquals(expect, actual);
    }

    @Test
    public void return_1_20_with_3_5_7() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        List<String> actual = fizzBuzzWhizz.count(3, 5, 7, 20);
        List<String> expect = new ArrayList<String>();
        expect.add("1");
        expect.add("2");
        expect.add("Fizz");
        expect.add("4");
        expect.add("Buzz");
        expect.add("Fizz");
        expect.add("Whizz");
        expect.add("8");
        expect.add("Fizz");
        expect.add("Buzz");
        expect.add("11");
        expect.add("Fizz");
        expect.add("Fizz");
        expect.add("Whizz");
        expect.add("FizzBuzz");
        expect.add("16");
        expect.add("17");
        expect.add("Fizz");
        expect.add("19");
        expect.add("Buzz");
        Assert.assertEquals(expect, actual);
    }


    @Test
    public void return_1_100_with_3_5_7() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();
        List<String> actual = fizzBuzzWhizz.count(3, 5, 7, 100);
        for (String s : actual) {
            System.out.println(s);
        }
    }
}
