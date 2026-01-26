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
        boolean juego = true;
        int casilla;
        boolean empiezaPj1 = false;
        boolean empiezaPj2 = false;
        int turno = 1;
        int contadorPartidasJugador1 = 0;
        int contadorPartidasJugador2 = 0;

        System.out.println("===== EXPLICACIÓN =====");
        System.out.println("El tablero consta de 9 casillas");
        System.out.println("Tendrás que señalar la casilla que quieres marcar, y el O/X se pondrá automáticamente dependiendo de que jugador tenga el turno.");
        System.out.println("1 | 2 | 3");
        System.out.println("4 | 5 | 6");
        System.out.println("7 | 8 | 9");

        System.out.println(jugador1 + " será " + figura1);
        System.out.println(jugador2 + " será " + figura2);

        while (juego) {

            int jugadorAzar = random.nextInt(0, 2);
            if (jugadorAzar == 0) {
                System.out.println("Empieza " + jugador1);
                empiezaPj1 = true;
                empiezaPj2 = false;
            } else {
                System.out.println("Empieza " + jugador2);
                empiezaPj2 = true;
                empiezaPj1 = false; 
            }

            turno = 1;
            boolean partidaEnCurso = true;
            String [][] tablero = {
                    {"-", "-", "-"},
                    {"-", "-", "-"},
                    {"-", "-", "-"}
            };

            while (partidaEnCurso) {

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

                while(!tablero[opFila][opColumna].equals("-")) {
                    System.out.println("Casilla ocupada, por favor elige otra!");
                    casilla = sc.nextInt();
                    opFila = (casilla - 1) / 3;
                    opColumna = (casilla - 1) % 3;
                }

                tablero [opFila][opColumna] = figuraActual;
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++ ) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println();
                }

                turno++;
                //Comprobaciones
                int contadorEmpate = 0;

                for (int i = 0; i < tablero.length; i++) {
                        if (tablero [i][0].equals(figura1) || tablero [i][0].equals(figura2)) {
                            if ((tablero[i][0].equals(tablero[i][1])) && (tablero[i][1].equals(tablero[i][2]))){
                                System.out.println("====== TRES EN RAYA ======");
                                System.out.println("Ganador " + jugadorActual);
                                if (jugadorActual.equals(jugador1)) {
                                    contadorPartidasJugador1++;
                                    partidaEnCurso = false;
                                    break;
                                } else  {
                                    contadorPartidasJugador2++;
                                    partidaEnCurso = false;
                                    break;
                                }
                            }
                        }
                    }

                for (int j = 0; j < tablero.length; j++) {
                    if (tablero [0][j].equals(figura1) || tablero [0][j].equals(figura2)) {
                        if ((tablero[0][j].equals(tablero[1][j])) && (tablero[1][j].equals(tablero[2][j]))){
                            System.out.println("====== TRES EN RAYA ======");
                            System.out.println("Ganador " + jugadorActual);
                            if (jugadorActual.equals(jugador1)) {
                                contadorPartidasJugador1++;
                                partidaEnCurso = false;
                                break;
                            } else  {
                                contadorPartidasJugador2++;
                                partidaEnCurso = false;
                                break;
                            }
                        }
                    }
                }

                if ((tablero[0][0].equals(figuraActual) && tablero[1][1].equals(figuraActual) && tablero[2][2].equals(figuraActual)) || (tablero[0][2].equals(figuraActual) && tablero [1][1].equals(figuraActual) && tablero[2][0].equals(figuraActual))) {
                    System.out.println("====== TRES EN RAYA ======");
                    System.out.println("Ganador " + jugadorActual);
                    if (jugadorActual.equals(jugador1)) {
                        contadorPartidasJugador1++;
                        partidaEnCurso = false;
                        break;
                    } else  {
                        contadorPartidasJugador2++;
                        partidaEnCurso = false;
                        break;
                    }
                }

                if (partidaEnCurso) {
                    for  (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            if (tablero[i][j].equals("-")) {
                                contadorEmpate++;
                            }
                        }
                    }
                    if (contadorEmpate == 0) {
                        System.out.println("========== EMPATE ==========");
                        System.out.println("No hay ganador en esta ronda");
                        partidaEnCurso = false;
                    }
                }
            }

            if (contadorPartidasJugador1 == 3 || contadorPartidasJugador2 == 3){
                System.out.println("======== GANADOR DE TRES EN RAYA ========");
                System.out.println("           " + jugadorActual);
                juego = false;
            }

        }
    }
}
