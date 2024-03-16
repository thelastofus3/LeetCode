package thelastofus;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int inverted_number = 0;
        int copy_of_x = x;
        if(x == 0){
            return false;
        }
        if(x < 0){
            return false;
        }
        if(x % 10 == 0 && x != 0){
            return false;
        }
        while(copy_of_x != 0){
            inverted_number = inverted_number * 10 + copy_of_x % 10;
            copy_of_x = copy_of_x / 10;
        }
        return inverted_number == x;
    }
}
