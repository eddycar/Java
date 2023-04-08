import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        iniciarJuego();
    }

    public static void iniciarJuego() {

        boolean finalizar = false;
        char continuarJugando;
        Scanner scanner = new Scanner(System.in);
        System.out.println("********  Juego  ********");
        System.out.println("* Piedra Papel o Tijera *");
        System.out.println("*************************\n");

        while (finalizar != true) {
            System.out.println("********  Menu   ********");
            System.out.println("Elija\n\tPiedra:\t1\n\tPapel:\t2\n\tTijera:\t3");
            evaluar();
            System.out.println("Seguir jugando? Y/N");
            continuarJugando = scanner.nextLine().toUpperCase().charAt(0);
            System.out.println(continuarJugando);
            while (continuarJugando != 'Y' && continuarJugando != 'N'){
                System.out.println("Seleccione una opcion valida");
                System.out.println("Seguir jugando? Y/N");
                continuarJugando = scanner.nextLine().toUpperCase().charAt(0);

            }
            if (continuarJugando == 'N') finalizar = true;
        }
    }

    public static int seleccionUsuario() {
        Scanner scanner = new Scanner(System.in);
        int seleccionUsuario = Integer.parseInt(scanner.nextLine());
        switch (seleccionUsuario) {
            case 1:
                System.out.println("Seleccionaste Piedra");
                break;
            case 2:
                System.out.println("Seleccionaste Papel");
                break;
            case 3:
                System.out.println("Seleccionaste Tijera");
                break;
            default:
                seleccionUsuario = 0;
        }
        return seleccionUsuario;
    }

    public static int seleccionMaquina() {
        int seleccionMaquina = (int) Math.round(Math.random() * 2 + 1);
        switch (seleccionMaquina) {
            case 1:
                System.out.println("Seleccion de la maquina: Piedra");
                break;
            case 2:
                System.out.println("Seleccion de la maquina: Papel");
                break;
            case 3:
                System.out.println("Seleccion de la maquina: Tijera");
                break;
        }
        return seleccionMaquina;
    }

    public static void evaluar() {

        int seleccionUsuario = seleccionUsuario();
        int seleccionMaquina = seleccionMaquina();
        if (seleccionUsuario == 0)  System.out.println("Seleccion de usuario no valida");
        else if (seleccionUsuario == seleccionMaquina) System.out.println("Esto es un empate!");
        else if (seleccionUsuario == 1 && seleccionMaquina == 2) System.out.println("La casa gana");
        else if (seleccionUsuario == 1 && seleccionMaquina == 3) System.out.println("Ganaste!");
        else if (seleccionUsuario == 2 && seleccionMaquina == 1) System.out.println("Ganaste!");
        else if (seleccionUsuario == 2 && seleccionMaquina == 3) System.out.println("La casa gana");
        else if (seleccionUsuario == 3 && seleccionMaquina == 1) System.out.println("La casa gana");
        else if (seleccionUsuario == 3 && seleccionMaquina == 2) System.out.println("Ganaste!");
    }
}

