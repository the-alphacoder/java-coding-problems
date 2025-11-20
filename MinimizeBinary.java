public class MinimizeBinary {
    public static void main(String[] args) {
        String s = "101100";

        char arr[] = s.toCharArray();

        int n = s.length();

        int firstOne = -1;
        int lastZero = -1;

        for (int i = 0; i < n; i++) {
            if(arr[i]=='1'){
                firstOne=i;
                break;
            }        
        }
        for (int j = n-1; j >=0; j--) {
            if(arr[j]=='0'){
                lastZero=j;
                break;
            }        
        }

        if(firstOne != -1 && lastZero != -1 && firstOne<lastZero){
            char temp = arr[firstOne];
            arr[firstOne] = arr[lastZero];
            arr[lastZero] = temp;
        }

        System.out.println(new String(arr));
    }
}
