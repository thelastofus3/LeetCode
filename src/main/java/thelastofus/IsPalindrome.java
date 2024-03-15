package thelastofus;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.reverse();
        return s1.contentEquals(sb);
    }
}
