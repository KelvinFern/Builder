package subway.org.modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tiposDePao = Arrays.asList("PAO ITALIANO","PAO FRANCÊS","PAO AMERICANO");
        List<String> tiposDeSauce = Arrays.asList("Maionese", "Ketchup", "Mostarda");
        List<String> tiposDeRecheio = Arrays.asList("Frango", "Camarão", "Atum");
        var sanduiche1 = new PaoBuilder("PAO ITALIANO")
                .filling("Frango")
                .sauce(Collections.singletonList("Ketchup"))
                .more("Bacon")
                .createdBread();

        var sanduiche2 = new PaoBuilder("PAO AMERICANO")
                .filling("Frango")
                .sauce(Collections.singletonList("Maionese"))
                .more("Mostarda")
                .createdBread();

        System.out.println(sanduiche1.toString());
        System.out.println(sanduiche2.toString());
    }
}
