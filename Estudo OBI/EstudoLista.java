
//Bibliotecas necessárias
import java.util.ArrayList;
import java.util.List;

public class EstudoLista {
    public static void main(String[] args) {
        // instanciação
        List<String> list = new ArrayList<>();
        list.add("jader");
        list.add("jonas");
        list.add("pedro");
        list.add("maria");

        // Forma de acesso
        for (String String : list) {
            System.out.println(list);
        }

        // remoção
        list.removeIf(item -> item.startsWith("N")); //No curso fala pra usar o charAt() mas não está rodando e o GPT recomendou o startsWith
        for (String String : list) {
            System.out.println(list);
        }
        System.out.println("index of bob " + list.indexOf("bob"));

        List<String> result = list.stream().filter(list -> charAt(0) == "A");
    }
}
