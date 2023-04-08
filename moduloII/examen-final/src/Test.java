public class Test {
    public static void main(String[] args) {

        Pizza muzzarella= PizzaFactory.getInstance().crearPizza("Simple");
        muzzarella.setNombre("muzzarella");
        muzzarella.setDescripcion("Pizza de muzzarella chica");
        ((Simple)muzzarella).setPrecio(700.0);
        ((Simple)muzzarella).setEsGrande(false);

        Pizza especial= PizzaFactory.getInstance().crearPizza("Simple");
        especial.setNombre("especial");
        especial.setDescripcion("Pizza especial chica");
        ((Simple)especial).setPrecio(850.0);
        ((Simple)especial).setEsGrande(false);

        Pizza anana= PizzaFactory.getInstance().crearPizza("Simple");
        anana.setNombre("ananá");
        anana.setDescripcion("Pizza de ananá chica");
        ((Simple)anana).setPrecio(950.0);
        ((Simple)anana).setEsGrande(false);

        Pizza loca= PizzaFactory.getInstance().crearPizza("Combinada");
        loca.setNombre("loca");
        loca.setDescripcion("Pizza combinada loca");
        ((Combinada)loca).addPizza(especial);
        ((Combinada)loca).addPizza(anana);

        Pizzeria pizzeria= new Pizzeria("Pizza Loca");
        pizzeria.agregarOferta(muzzarella);
        pizzeria.agregarOferta(especial);
        pizzeria.agregarOferta(anana);
        pizzeria.agregarOferta(loca);
        System.out.println("Informe de ofertas disponibles en la pizzeria");
        pizzeria.generarInforme();

    }
}
