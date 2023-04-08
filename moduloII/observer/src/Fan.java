public class Fan implements Observador{
    private String nombre;
    private String apellido;
    private int nivelFan;

    public Fan(String nombre, String apellido, int nivelFan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelFan = nivelFan;
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

    public int getNivelFan() {
        return nivelFan;
    }

    public void setNivelFan(int nivelFan) {
        this.nivelFan = nivelFan;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(getNombre()+" "+getApellido()+", Mensaje de tu Idol: "+notificacion);
    }
}
