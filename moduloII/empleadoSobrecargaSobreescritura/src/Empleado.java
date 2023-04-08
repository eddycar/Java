public class Empleado {
    private String nombre;
    private String dni;
    private String legajo;
    protected double sueldo;


    public Empleado(String nombre, String dni, String legajo){
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
        sueldo = 1000000;
    }

    public double calcularSueldo(double descuentos){
         return sueldo - descuentos;
    }

    public double calcularSueldo(double premio, double descuentos){
       return sueldo - descuentos + premio;
    }
}
