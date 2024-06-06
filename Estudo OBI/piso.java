import java.util.Scanner;

public class piso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Leitura dos valores de L e C
        int L = in.nextInt();
        int C = in.nextInt();

        // Calcular o número de lajotas do tipo 1
        int numLajotasTipo1 = (L * C) + ((L - C) * (C - 1));

        // Calcular o número de lajotas do tipo 2
        int numLajotasTipo2 = 2 * (L - 1) + 2 * (C - 1);

        // Imprimir os resultados
        System.out.println(numLajotasTipo1);
        System.out.println(numLajotasTipo2);
        in.close();
    }
}
