public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(String numero, double saldo) {
        super(numero, saldo);
        descubierto = 1000;
    }

    @Override
    public void extraer(double importe) {
        if (saldo >= 1000){
            saldo -= 1000;
        }
    }
}
