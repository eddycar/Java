public class Particular extends Paciente {
    private double valorConsulta;
    private String dni;

    public Particular(String nombre, String apellido, String fechaNacimiento, boolean esPrimeraVez, Consulta consulta) {
        super(nombre, apellido, fechaNacimiento, esPrimeraVez, consulta);
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
