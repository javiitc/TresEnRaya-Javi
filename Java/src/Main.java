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

        System.out.println(jugador1 + " será " + figura1);
        System.out.println(jugador2 + " será " + figura2);

        while (juego) {
            int operacion = turno % 2;
            if (operacion != 0) {
                if (empiezaPj1) {
                    jugadorActual = jugador1;
                    figuraActual = figura1;
                } else {
                    jugadorActual = jugador2;
                    figuraActual = figura2;
                }
            } else {
                if (empiezaPj1) {
                    jugadorActual = jugador2;
                    figuraActual = figura2;
                } else {
                    jugadorActual = jugador1;
                    figuraActual = figura1;
                }
            }

            System.out.println("Turno " + turno + ": Juega " + jugadorActual);
            System.out.println("Selecciona la casilla");
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
            //Comprobaciones
            for (int i = 0; i < tablero.length; i++) {
                if ((tablero[i][0] == tablero[i][1]) && (tablero[i][0] == tablero[i][2]) ){

                }
            }

        }
    }
}
