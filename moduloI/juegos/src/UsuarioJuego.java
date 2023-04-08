public class UsuarioJuego {
    private String nombre;
    private String clave;
    private double puntaje;
    private int nivel;

    public UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
    }
    public void aumentarPuntaje(){
        puntaje++;
    }
    public void subirNivel(){
        nivel++;
    }
    public void bonus(int valor){
        this.puntaje += valor;
    }

    @Override
    public String toString() {
        return "UsuarioJuego{" +
                "nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                ", puntaje=" + puntaje +
                ", nivel=" + nivel +
                '}';
    }
}
