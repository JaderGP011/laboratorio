import java.util.*;

public class quiz {
    public static void main(String[] args) {
        int resp, acerto=0, erro=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("HTML é uma liguagem de marcação?\n 1 = Verdadeiro, 2 = Falso");
        resp = ler.nextInt();

            if (resp == 1) {
                acerto++;
                System.out.println("Acertou!");
            } else if (resp == 2) {
                erro++;
                System.out.println("Errou!");
            }
        
        ler.close();
    }
}