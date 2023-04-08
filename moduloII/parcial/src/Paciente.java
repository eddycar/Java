public  abstract class Paciente {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private boolean esPrimeraVez;
    private Consulta consulta;

    public Paciente(String nombre, String apellido, String fechaNacimiento, boolean esPrimeraVez, Consulta consulta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.esPrimeraVez = esPrimeraVez;
        this.consulta = consulta;
    }

    public boolean evaluacionInicial(){
        if(esPrimeraVez == true){
            return true;
        }
        else {
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEsPrimeraVez() {
        return esPrimeraVez;
    }

    public void setEsPrimeraVez(boolean esPrimeraVez) {
        this.esPrimeraVez = esPrimeraVez;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
