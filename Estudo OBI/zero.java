import java.util.Scanner;
public class zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int index = 0;

        for(int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x == 0 && index > 0) {
                index--; //
            } else {
                a[index] = x;
                index++;
            }
        }

        int valorF = 0;
        for(int i = 0; i < index; i++) {
            valorF += a[i];
        }

        System.out.println(valorF);
    }
}