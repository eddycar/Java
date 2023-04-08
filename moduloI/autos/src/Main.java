public class Main {
    public static void  main(String[] args){
        Chofer chofer;
        Auto auto = new Auto("OLG8","BENELLI","2022");
        chofer = new Chofer("Eddy", "Car", new Auto("MNL90T","AKT","2017"));
        Chofer chofer1 = new Chofer("Wilson","penafiel",auto);
        System.out.println("Patente auto asignado: "+chofer.verPatente());
        System.out.println("Patente auto asignado: "+chofer1.verPatente()+" "+chofer1.getNombre());
    }
}
