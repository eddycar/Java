public class SonPrimos {



    public static void main(String[] args){
        Cuenta cuenta = new Cuenta(1895, 2000.0);
        cuenta.depositar(500.0);
        System.out.println(cuenta.getSaldo());
        cuenta.retirar(1000.0);
        System.out.println(cuenta.getSaldo());
    }
}
