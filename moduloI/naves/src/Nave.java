public class Nave extends Objeto {
    private double velocidad;
    private int vida;


    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
    }

    public void girar(char direccion){
        setDireccion(direccion);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    }

}
