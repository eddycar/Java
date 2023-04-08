import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza{
    private List<Pizza> pizzas= new ArrayList<>();

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public double calcularPrecio() {
        double total=0;
        for (Pizza pizza :pizzas) {
            total+=pizza.calcularPrecio()/ pizzas.size();
        }
        return total;
    }
}
