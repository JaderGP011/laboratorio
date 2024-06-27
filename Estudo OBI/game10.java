import java.util.Scanner;

public class game10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a = in.nextInt();
        int cont = 0;

        while (a != d) {
            a++;
            cont++;
            if (a > n) {
                a = 1;
            }
        }
        System.out.println(cont);
        in.close();
    }
}