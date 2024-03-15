import org.junit.jupiter.api.Test;
import thelastofus.IsPalindrome;
import static org.junit.jupiter.api.Assertions.*;
public class IsPalindromeTest {
    @Test
    public void isPalindromeExample1(){
        IsPalindrome solution = new IsPalindrome();
        int x = 121;
        boolean expected = true;
        assertEquals(expected,solution.isPalindrome(x));
    }
    @Test
    public void isPalindromeExample2(){
        IsPalindrome solution = new IsPalindrome();
        int x = -121;
        boolean expected = false;
        assertEquals(expected,solution.isPalindrome(x));
    }
    @Test
    public void isPalindromeExample3(){
        IsPalindrome solution = new IsPalindrome();
        int x = 10;
        boolean expected = false;
        assertEquals(expected,solution.isPalindrome(x));
    }
}
