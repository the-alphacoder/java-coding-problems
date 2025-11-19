import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        String str = "882333459";
        int[] freq = new int[10];
        int ansDigit = Integer.MIN_VALUE,maxFreq = 0;
        for (char c : str.toCharArray()) {
            int digit = c - '0';
            freq[digit]++;
            if (freq[digit]>maxFreq){
                maxFreq=freq[digit];
                ansDigit=digit;
            }else if(freq[digit] == maxFreq){
                if (digit>ansDigit) {
                    ansDigit=digit;
                }
            }

        }
        System.out.println(ansDigit);

        
    }
}
