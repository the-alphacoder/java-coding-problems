public class CustomStringEncryption {
    public static void main(String[] args) {
        String str = "abc";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            int base = c - 'a';

            int shifted = (base + i) % 26;

            char newChar = (char)('a' + shifted);

            sb.append(newChar);


        }
        System.out.println(sb);
        
    }
}
