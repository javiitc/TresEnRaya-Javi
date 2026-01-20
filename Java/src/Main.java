import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======== Tres en raya ========");
        System.out.println("Indica el nombre de los jugadores:");
        String jugador1 = sc.next();
        String jugador2 = sc.next();
        int jugadorAzar = random.nextInt(0, 2);
        boolean juego = true;
        int casilla;

        int [][] tablero = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        if (jugadorAzar == 0) {
            System.out.println("Empieza " + jugador1);
        } else {
            System.out.println("Empieza " + jugador2);
        }

        System.out.println("===== EXPLICACIÓN =====");
        System.out.println("El tablero consta de 9 casillas");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");

        while (juego) {
            System.out.println("Elige en que casilla quieres empezar");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++ ) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            casilla = sc.nextInt();
            int opCasilla = 
            break;
        }
    }
}
