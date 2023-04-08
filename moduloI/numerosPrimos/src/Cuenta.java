public class Cuenta {
    private int numeroDeCuenta;
    private Double saldo;

    public Cuenta(int numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double cantDinero){
        Double nuevoSaldo = this.saldo + cantDinero;
        this.setSaldo(nuevoSaldo);
    }

    public void retirar(Double cantDinero){
        Double nuevoSaldo;
        if (cantDinero <= this.getSaldo()){
            nuevoSaldo = this.getSaldo() - cantDinero;
            this.setSaldo(nuevoSaldo);
        }
    }

}
