/** Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
 luego imprimir por pantalla el ranking */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> cities = new ArrayList<>();
        char answer = 'y';
        do {
            System.out.print("Enter an Argentine city: ");
            cities.add(scanner.nextLine());
            System.out.print("Continue? (Y/n): ");
            answer = scanner.nextLine().charAt(0);
        } while (answer == 'y');
        scanner.close();
        int index = 1;
        for (String city : cities) {
            System.out.println(String.format("#%d - %s", index++, city));
        }

    }
}