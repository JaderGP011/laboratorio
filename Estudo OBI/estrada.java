import java.util.Arrays;
import java.util.Scanner;

public class estrada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        int T = scanner.nextInt();
        int N = scanner.nextInt();
        int[] distancias = new int[N];

        for (int i = 0; i < N; i++) {
            distancias[i] = scanner.nextInt();
        }

        // Ordena as distâncias dos centros das cidades
        Arrays.sort(distancias);

        // Lista para armazenar os tamanhos das vizinhanças
        double[] vizinhancas = new double[N];

        // Calcular a vizinhança para cada cidade
        double vizinhanca;
        for (int i = 0; i < N; i++) {
            if (i == 0) {
                // Primeira cidade
                double fronteiraDireita = (distancias[i] + distancias[i + 1]) / 2.0;
                vizinhanca = fronteiraDireita;
            } else if (i == N - 1) {
                // Última cidade
                double fronteiraEsquerda = (distancias[i] + distancias[i - 1]) / 2.0;
                vizinhanca = T - fronteiraEsquerda;
            } else {
                // Cidades intermediárias
                double fronteiraEsquerda = (distancias[i] + distancias[i - 1]) / 2.0;
                double fronteiraDireita = (distancias[i] + distancias[i + 1]) / 2.0;
                vizinhanca = fronteiraDireita - fronteiraEsquerda;
            }

            vizinhancas[i] = vizinhanca;
        }

        // Encontra a menor vizinhança
        double menorVizinhanca = Arrays.stream(vizinhancas).min().orElse(0.0);

        // Exibe o resultado com duas casas decimais
        System.out.printf("%.2f%n", menorVizinhanca);
    }
}