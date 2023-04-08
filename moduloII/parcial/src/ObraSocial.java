public class ObraSocial extends Paciente implements Comparable{
    private String nombreObraSocial;
    private int numeroAsociado;

    public ObraSocial(String nombre, String apellido, String fechaNacimiento, boolean esPrimeraVez, Consulta consulta, String nombreObraSocial, int numeroAsociado) {
        super(nombre, apellido, fechaNacimiento, esPrimeraVez, consulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    @Override
    public int compareTo(Object o) {
        ObraSocial comp=(ObraSocial)o;
        int resp=0;
        if (this.numeroAsociado>comp.numeroAsociado){
            resp=1;
        }
        if (this.numeroAsociado<comp.numeroAsociado){
            resp=-1;
        }
        return resp;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public void setNombreObraSocial(String nombreObraSocial) {
        this.nombreObraSocial = nombreObraSocial;
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(int numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }
}
