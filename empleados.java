

public class empleados {
    private int dni;
    private String name;
    private Integer workedHours;
    private Float valueHours;

    public empleados(int dni, String name, Integer workedHours, Float valueHours) {
        this.dni = dni;
        this.name = name;
        this.workedHours = workedHours;
        this.valueHours = valueHours;
    }
    
    public float getSalary(){
        return (float)(Math.round((this.workedHours * this.valueHours) * 100f) / 100f);
    }

    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return String.format("%s - [%d]", this.name, String.valueOf(this.dni));
    }
}