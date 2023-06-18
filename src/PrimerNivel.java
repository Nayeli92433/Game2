import java.util.Random;
import java.util.Scanner;

public class PrimerNivel {
    Scanner scanner= new Scanner(System.in);
    Random random= new Random();
    int ganador=0, perdedor=0;

    public int getGanador() {
        return ganador;
    }

    public int getPerdedor() {
        return perdedor;
    }

    SegundoNivel segundoNivel= new SegundoNivel();
    ImprmirPuntos imprimirPuntos= new ImprmirPuntos();
    private String letras = "ASP";//Solo le defini tres letras por que estaba muy complicado advinar alguna letra
    public void adivinaCaracter(){

        System.out.println("\n\t----------Primer nivel----------");
        System.out.println("\t-------ADIVINA EL CARACTER-------");
        System.out.println("Suma 10 puntos para pasar de nivel");
        do {
            System.out.println("Adivina el caracter en el que estoy pensando (ASP)\n->  ");
            String eleccioJugador = scanner.next();
            char caracter = generarLetra();
            System.out.println("Caracter aleatorio: " + caracter);
            if (eleccioJugador.charAt(0) == caracter) {
                System.out.println("Ganaste un punto!");
                ganador++;
                System.out.println("Puntos acumulados: "+ ganador);
                if (ganador==10){
                    System.out.println("\nPASASTE DE NIVEL\n");
                    segundoNivel.adivinaNumero();
                }
            }
            else {
                System.out.println("Fallaste");
                perdedor++;
            }
        }while (perdedor!=3);
        System.out.println("\n---------PERDISTE :c---------");
        imprimirPuntos.imprimirPuntos(ganador, perdedor);
    }
    public char generarLetra(){
        return  letras.charAt(random.nextInt(letras.length()));
    }
}
