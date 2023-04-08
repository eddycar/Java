public class Vendedor extends Empleado{
    public int comision;
    public double importeVentas;

    public Vendedor(String nombre, String dni, String legajo) {
        super(nombre, dni, legajo);
        comision = 10;
        importeVentas = 5000000;
    }

    @Override
    public double calcularSueldo(double descuentos) {
        return sueldo - descuentos + importeVentas/100*comision;
    }

    @Override
    public double calcularSueldo(double premio, double descuentos) {
        return sueldo - descuentos + premio + importeVentas/100*comision;
    }
}
