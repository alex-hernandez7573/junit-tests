import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class MyFirstTest {

    @Test
    public void isCodeUpCodeUp() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        assertNotEquals(correct,commonly);

    }
    @Test
    public void listAreDifferent () {
//        List<String> languages = new ArrayList<>();
//        List<String> morelanguages = new ArrayList<>();
//
//        assertNotSame(languages, morelanguages);

    }
    @Test
    public void arraysAreEqual () {

        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

    }

    @Test
    public void funWithPHP () {
        String language = "PHP";
        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }


}
