public class Main {
    public static void main(String[] args) {
        Idol korean = new Idol();
        Fan fan1 = new Fan("Pedro", "Garcia",2);
        Fan fan2 = new Fan("Juan", "Perez",1);

        korean.agregar(fan1);
        korean.agregar(fan2);

        korean.transmitir();
        korean.finalizarTransmision();
    }
}
