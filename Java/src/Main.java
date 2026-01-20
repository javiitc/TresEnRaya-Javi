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

        int filas = 3;
        int columnas = 3;
        int [][] tablero = new int[filas][columnas];

        if (jugadorAzar == 0) {
            System.out.println("Empieza " + jugador1);
        } else {
            System.out.println("Empieza " + jugador2);
        }

        
    }
}
