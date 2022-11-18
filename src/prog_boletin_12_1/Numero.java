package prog_boletin_12_1;

import javax.swing.JOptionPane;

public class Numero {

    int numeroSecreto;
    int cantidadIntentos;
    int intento;
    String insertarNumeroSecreto = "Jugador 1: Teclea el número secreto";
    String insertarCantidadIntentos = "Jugador 1: Asigna el número de intentos que va a tener el Jugador 2";
    String insertayAdivinaNumSecreto = "Juagador 2: Teclea y adivina el número del Jugador 1";
    String acertarNumeroSecreto = "¡Adivinaste!";
    String mensajeNumeroSecretoEsMenor = "El número es menor\nInténtalo otra vez";
    String mensajeNumeroSecretoEsMayor = "El número es mayor\nInténtalo otra vez";
    String gameOver = "Fin del Juego\nSe te acabaron los intentos";

    public void pedirNumero() {
        do {
            numeroSecreto = pedirEntero(insertarNumeroSecreto);
            cantidadIntentos = pedirEntero(insertarCantidadIntentos);
        } while (numeroSecreto <= 0 || numeroSecreto > 50);
        for (int i = 1; i <= cantidadIntentos; i++) {
            intento = pedirEntero(insertayAdivinaNumSecreto);
            if (intento == numeroSecreto) {
                JOptionPane.showMessageDialog(null, acertarNumeroSecreto);
                break;
            } else if (i < cantidadIntentos && intento > numeroSecreto) {
                JOptionPane.showMessageDialog(null, mensajeNumeroSecretoEsMenor);
            } else if (intento < numeroSecreto) {
                JOptionPane.showMessageDialog(null, mensajeNumeroSecretoEsMayor);
            } else {
                JOptionPane.showMessageDialog(null, gameOver);
            }

        }
    }

    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

}
