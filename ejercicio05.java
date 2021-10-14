/** Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
valor-por-hora(array2) del resumen de carga de horas semanal 
de un empleado. Se debe generar otra lista que contenga los 
totales y luego imprimir el total final a cobrar. 
*/

import java.util.ArrayList;
import java.util.List;

public class ejercicio05 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Float> valorHora = new ArrayList<>();
        int min = 0;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            horasTrabajadas.add((int) (Math.random() * (max - min + 1) + min));
            valorHora.add((float)(Math.random() * (max - min + 1) + min));
        }

        List<Float> subtotals = new ArrayList<>();
        if (horasTrabajadas.size() == valorHora.size()) {
            for (int i = 0; i < horasTrabajadas.size(); i++) {
                subtotals.add((horasTrabajadas.get(i) * valorHora.get(i)));
            }
        }

        Float total = 0f;
        for (Float subtotal : subtotals) total += subtotal;

        System.out.println("El valor a cobrar es: " + total);
    }
}
