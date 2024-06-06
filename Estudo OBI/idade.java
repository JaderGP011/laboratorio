import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, a, b, c, soma;

        m = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();

        soma = a+b;
        c = m-soma;

        if (c>a && c>b) {
            System.out.println(c);
        }else if (b>c && b>a) {
            System.out.println(b);
        }else {
            System.out.println(a);
        }
        
        in.close();
    }
}
