public class Main {

    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(5.0,4.0);
        Circulo circulo1 = new Circulo(1.0);
        Circulo circulo2 = new Circulo(1.0);
        Circulo circulo3 = new Circulo(1.0);

        FiguraCompuesta vagon = new FiguraCompuesta();

        vagon.agregarCalculable(circulo1);
        vagon.agregarCalculable(circulo2);
        vagon.agregarCalculable(circulo3);
        vagon.agregarCalculable(rectangulo1);

        System.out.println("\nEl area total del vagon es: " + vagon.calcularArea());

        FiguraCompuesta locomotora = new FiguraCompuesta();
        Rectangulo rectangulo2 = new Rectangulo(6.0, 4.0);
        Circulo circulo4 = new Circulo(1.0);
        Circulo circulo5 = new Circulo(1.0);
        Triangulo triangulo = new Triangulo(2.0, 2.0);

        locomotora.agregarCalculable(circulo4);
        locomotora.agregarCalculable(circulo5);
        locomotora.agregarCalculable(rectangulo2);
        locomotora.agregarCalculable(triangulo);

        System.out.println("\nEl area total de la locomotora  es: " + locomotora.calcularArea());

        Trencito trencito = new Trencito();
        trencito.agregarCalculable(vagon);
        trencito.agregarCalculable(locomotora);

        System.out.println("\nEl area total de la locomotora y el vagon   es: " + trencito.calcularAreaTotal());




    }
}
