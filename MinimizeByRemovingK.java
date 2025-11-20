public class MinimizeByRemovingK {
    public static void main(String[] args) {
        String s = "1101001";
        int k = 4;

        System.out.println(minimizeByRemovingK(s, k));

    }

    public static String minimizeByRemovingK(String s, int k){

        StringBuilder stack = new StringBuilder();


        for (char c : s.toCharArray()) {
            
            while (k>0 && stack.length() > 0 && stack.charAt(stack.length()-1)=='1' && c == '0' ) {
                stack.deleteCharAt(stack.length()-1);
                k--;
            }

            stack.append(c);

        }

        while (k>0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length()-1);
            k--;
        }

        return  stack.toString();
    }
}
