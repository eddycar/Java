import org.apache.log4j.Logger;

public class CalculadoraTest {
    private static final Logger logger = Logger.getLogger(CalculadoraTest.class);

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(1,3);
        int suma = calculadora.sumar();
        System.out.println(suma);

        Calculadora calculadora1 = new Calculadora(1,0);
        calculadora1.dividir();

        Calculadora calculadora2 = new Calculadora(2,3);
        calculadora2.dividir();
    }
}
