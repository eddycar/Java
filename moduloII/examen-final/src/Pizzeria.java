import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private  String nombre;
    private List<Pizza> pizzasDisponibles;

    public Pizzeria (String nombre){
        this.nombre=nombre;
        pizzasDisponibles= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pizza> getPizzasDisponibles() {
        return pizzasDisponibles;
    }

    public void setPizzasDisponibles(List<Pizza> pizzasDisponibles) {
        this.pizzasDisponibles = pizzasDisponibles;
    }

    public void agregarOferta(Pizza pizza){
        pizzasDisponibles.add(pizza);
    }
    public void generarInforme(){
        for (Pizza pizza:pizzasDisponibles) {
            System.out.println(pizza.toString());
            //System.out.println("Nombre: "+oferta.getNombre()+" - Precio: "+oferta.calcularPrecio());
        }
    }
}
