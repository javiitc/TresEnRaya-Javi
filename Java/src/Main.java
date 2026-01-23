import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======== Tres en raya ========");
        System.out.println("Indica el nombre de los jugadores:");
        String figura1 = "O";
        String figura2 = "X";
        String figuraActual = " ";
        String jugadorActual = " ";
        String jugador1 = sc.next();
        String jugador2 = sc.next();
        int jugadorAzar = random.nextInt(0, 2);
        boolean juego = true;
        int casilla;
        boolean empiezaPj1 = false;
        boolean empiezaPj2 = false;
        int turno = 1;

        String [][] tablero = {
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };

        if (jugadorAzar == 0) {
            System.out.println("Empieza " + jugador1);
            empiezaPj1 = true;
        } else {
            System.out.println("Empieza " + jugador2);
            empiezaPj2 = true;
        }

        System.out.println("===== EXPLICACIÓN =====");
        System.out.println("El tablero consta de 9 casillas");
        System.out.println("Tendrás que señalar la casilla que quieres marcar, y el O/X se pondrá automáticamente dependiendo de que jugador tenga el turno.");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");

        if (empiezaPj1) {
            System.out.println(jugador1 + " será " + figura1);
            System.out.println("Elige en que casilla quieres empezar");
        } else if (empiezaPj2) {
            System.out.println(jugador2 + " será " + figura2);
            System.out.println("Elige en que casilla quieres empezar");
        }

        while (juego) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++ ) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            casilla = sc.nextInt();
            int opFila = (casilla - 1) / 3;
            int opColumna = (casilla - 1) % 3;
            tablero [opFila][opColumna] = figuraActual;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++ ) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            turno++;
            int operacion = turno % 2;
            if (operacion == 0) {
                empiezaPj1 = false;
                empiezaPj2 = true;
                System.out.println("Turno " + turno + ": Juega " + jugador2);
                figuraActual = figura2;
            } else {
                empiezaPj2 = false;
                empiezaPj1 = true;
                System.out.println("Turno " + turno + ": Juega " + jugador1);
                figuraActual = figura1;
            }
            break;
        }
    }
}
