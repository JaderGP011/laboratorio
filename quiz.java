import java.util.*;

public class quiz {

    public static int acerto = 0, resp, erro = 0;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("HTML é uma liguagem de marcação?\n 1 = Verdadeiro, 2 = Falso");
        resp = ler.nextInt();

        System.out.println("Html é uma Linguagem de Marcação?\n 1 = Verdadeiro, 2 = Falso");
        resp = ler.nextInt();
        vFV();
        System.out.println("O personagem Chaves é se um seriado de mesmo nome?");
        resp = ler.nextInt();
        vFV();
        System.out.println("Você acerotu " + acerto + " e errou " + erro + " perguntas");

        ler.close();
    }

    public static void vFV() {
        if (resp == 1) {
            acerto++;
            System.out.println("Acertou!");
        } else if (resp == 2) {
            erro++;
            System.out.println("Errou!");
        } else {
            System.out.println("Responda apenas com 1 e 2");
        }
    }
}