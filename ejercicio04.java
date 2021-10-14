
/** Cargar un arrayList con 12 nombres de estudiantes (String), luego 
 separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos. 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio04 {
    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<>();

        estudiantes.addAll(Arrays.asList("Juan", "Fernando", "Castillo", "Adriana", "Araceli", "Eliana", "Carla",
                "Micaela", "Matias", "Aaron", "Catriel", "Vilma"));

        List<List<String>> cursos = new ArrayList<List<String>>();

        for (int i = 0; i < 3; i++) {
            cursos.add(estudiantes.subList(0 + 4 * i, 4 + 4 * i));
        }

        System.out.println(cursos);

        int count = 1;
        for (List<String> cursosNumero : cursos) {
            System.out.println("El Curso #" + (count++) + " esta formado por: " + cursosNumero);
        }
    }
}
