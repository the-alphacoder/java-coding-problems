public class MinimizeByFlips {
    public static void main(String[] args) {
        String s = "111010";
        System.out.println(minimizeByFlips(s));
    }

    public static String minimizeByFlips(String s){

        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == '0') {
                break;
            }else{
                arr[i] = '0';
            }
            

        }

        return new String(arr);
    }
}
