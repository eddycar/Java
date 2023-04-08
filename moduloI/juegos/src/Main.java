public class Main {
    public static void main(String[] args){
        UsuarioJuego usuario1 = new UsuarioJuego("Eddy", "123ee");
        usuario1.aumentarPuntaje();
        usuario1.bonus(150);
        System.out.println(usuario1.toString());
        usuario1.subirNivel();
        usuario1.aumentarPuntaje();
    }
}
