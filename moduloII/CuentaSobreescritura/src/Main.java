public class Main {
    public static void main(String[] args){
        CuentaCorriente cuenta1 = new CuentaCorriente("fdg5222421",2000d);
        cuenta1.depositar(1000);
        System.out.println(cuenta1.saldo);
        cuenta1.extraer(500);
        System.out.println(cuenta1.saldo);

    }
}
