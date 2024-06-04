import java.util.Scanner;
public class Cinema {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id1 = in.nextInt();
        int soma = 0, soma2 = 0;
        if (id1 <=17) {
            soma += 15;
        } else if (id1 >= 60){
            soma += 20;
        }else {
            soma += 30;
        }
        int id2 = in.nextInt();
        if (id2 <=17) {
            soma2 += 15;
        } else if (id2 >= 60){
            soma2 += 20;
        }else {
            soma2 += 30;
        }
        System.out.println((soma + soma2));
        in.close();
    }
    
}