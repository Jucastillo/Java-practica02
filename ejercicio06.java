
    /** Se dispone de una lista de Empleados, de cada empleado se conoce:
 * - Nombre y Apellido
 * - DNI
 * - horasTrabajadas
 * - valorPorHora
 * 
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular 
 * el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego 
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el 
 * valor (value) es el sueldo calculado.
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ejercicio06 {
    public static void main(String[] args) {
        Set<empleados> employees = new HashSet<>();
        load(employees);

        Map<Integer, Float> Employees = new HashMap<>();
        for (empleados employee : employees) {
            Employees.put(employee.getDni(), employee.getSalary());
        }
        System.out.println(Employees);
    }

    public static void load(Set<empleados> employees){
        empleados emp1 = new empleados(1234, "Juan Castillo", 7, 57.51f);
        empleados emp2 = new empleados(4567, "Adriana Acosta", 10, 49.73f);
        empleados emp3 = new empleados(8901, "Aaron Catriel", 6, 30.86f);
        empleados emp4 = new empleados(2345, "Carla Micaela", 19, 55.97f);
        
        employees.addAll(Arrays.asList(emp1,emp2,emp3,emp4));
    }

}
