public class Main {
    public  static void main(String[] args){

        Empleado empleado1 = new Empleado("EDDY", "2455f5", "ife5w852");
        System.out.println(empleado1.calcularSueldo(100000));
        System.out.println(empleado1.calcularSueldo(150000,100000));

        Vendedor vendedor1 = new Vendedor("Willi", "2252kmd65", "552d52");
        System.out.println(vendedor1.calcularSueldo(200000,100000));
    }
}
