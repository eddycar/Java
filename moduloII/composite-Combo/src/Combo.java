import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprables;

    public Combo() {
        comprables = new ArrayList<>();
    }

    @Override
    public double calcularPrecio() {
        double precioTotal = 0.0;
        for (Comprable comprable: comprables){
            precioTotal += comprable.calcularPrecio();
        }
        return precioTotal;
    }
}
