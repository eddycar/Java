
public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(String numero, double saldo) {
        super(numero, saldo);
        this.descubierto = 1000;
    }

    public double getDescubierto() {
        return descubierto;
    }
}
