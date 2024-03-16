package thelastofus;

public class RomanToInteger {
    public int romanToInt(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if(c == 'I'){
                count += 1;
            }else if(c == 'V'){
                count +=5;
            }else if(c == 'X'){
                count += 10;
            }else if(c == 'L'){
                count += 50;
            }else if(c == 'C'){
                count += 100;
            }else if(c == 'D'){
                count += 500;
            }else if(c == 'M'){
                count += 1000;
            }
        }
        return count;
    }
}
