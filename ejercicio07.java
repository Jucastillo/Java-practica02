/** Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings.
 * Con la secuencia de números enteros de principio a final.
 * Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
 * Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Ingrese numero uno: ");
        start = scanner.nextInt();
        System.out.print("Ingrese numero dos: ");
        end = scanner.nextInt();

        scanner.close();
        System.out.println(FizzBuzz(start, end));
    }

    public static List<String> FizzBuzz(int start, int end) {
        List<String> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (i % 2 == 0 && i % 3 == 0)
                result.add("FizzBuzz");
            else if (i % 2 == 0)
                result.add("Fizz");
            else if (i % 3 == 0)
                result.add("Buzz");
            else
                result.add(String.valueOf(i));
        }
        return result;
    }
}