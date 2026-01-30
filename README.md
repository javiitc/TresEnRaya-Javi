## TRES EN RAYA
# Cómo funciona?
El funcionamiento es simple, a no ser que vivas debajo de una piedra, sabrás como jugar al tres en raya (además que su propio nombre lo inidca xd)

El programa pedirá insertar el nombre de los dos jugadores, se puede elegir el que quieras

Una vez hecho, se explicará como se marca la casilla en consola, que será con un numero (int), y mediante dos operaciones matemáticas, el programa determina en que posición de fila y columna dónde colocará la X u O.
# Detalles técnicos
El programa usa bucles for para recorrer la matriz, tanto para imprimir el tablero al inicio de partida, como a medida que va avanzando la partida para que se vea el tablero actualizado.

EL bucle principal que es el while, es dónde ocurre todo el juego, dónde cada vez que empieza de nuevo se asigna un nuevo turno y la figura correspondiente al jugador.

El sistema de turnos se hace mediante una pequeña división en el programa, dónde quien empieza tiene asignado los turnos impares (turno 1) y el otro los turnos pares (si el módulo de lam operación que se realiza, es diferente de 0, es turno impar).

Para determinar el ganador, se usan bucles for para recorrer la matriz cada vez que finaliza un turno (tanto filas como columnas), si no hay ganador, el bucle continua hasta que haya uno, o sea empate. 
