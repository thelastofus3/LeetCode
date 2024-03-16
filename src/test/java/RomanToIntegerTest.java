import org.junit.jupiter.api.Test;
import thelastofus.RomanToInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {
    @Test
    public void romanToIntegerExample1(){
        RomanToInteger solution = new RomanToInteger();
        String s = "III";
        int expected = 3;
        assertEquals(expected,solution.romanToInt(s));
    }
    @Test
    public void romanToIntegerExample2(){
        RomanToInteger solution = new RomanToInteger();
        String s = "LVIII";
        int expected = 58;
        assertEquals(expected,solution.romanToInt(s));
    }
    @Test
    public void romanToIntegerExample3(){
        RomanToInteger solution = new RomanToInteger();
        String s = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected,solution.romanToInt(s));
    }
}
