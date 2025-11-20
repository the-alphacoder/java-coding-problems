public class MinimizeBinaryInfinite {
    public static void main(String[] args) {
        String s = "111010111";

        char arr[] = s.toCharArray();

        int zeros = 0;

        for (char c : arr) {
            if (c == '0') {
                zeros++;
            }
        }

        int ones = s.length() - zeros;

        System.out.println("0".repeat(zeros)+"1".repeat(ones));
    }
}
