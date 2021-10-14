
/** Crear una lista que contenga como elementos la numeración de cartas de 
 una baraja francesa (solo los valores, no figuras). Se deberá cargar el 
 ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), 
 desordenar (mezclar) el arrayList y volver a imprimir.  */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ejercicio03 {
    public static void main(String[] args) {
        List<String> cards = new ArrayList<>(
                Arrays.asList("A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
        
        for (String card : cards) {
            System.out.println(card);
        }
        System.out.println("====================================");

        ListIterator<String> li = cards.listIterator(cards.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println("====================================");

        Collections.shuffle(cards);
        for (String card : cards) {
            System.out.println(card);
        }
    }
}
