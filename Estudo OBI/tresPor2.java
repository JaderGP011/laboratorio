import java.util.Arrays;
import java.util.Scanner;

public class tresPor2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int valorF = 0;
        int[] p = new int[n];
        
        for(int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        Arrays.sort(p);
        for(int i = n - 1; i >= 0; i -= 3) {
            if (i - 1 >= 0) {
                valorF += p[i] + p[i - 1];
            } else {
                valorF += p[i];
            }
        }

        System.out.println(valorF);
    }
}
