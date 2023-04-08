public class Main {
    public static void main(String[] args){
        CuentaCorriente cuenta;
        cuenta = new CuentaCorriente("67890987jfuf", 78.845d);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getDescubierto());
    }
}
