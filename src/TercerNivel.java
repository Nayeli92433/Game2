import java.util.Random;
import java.util.Scanner;

public class TercerNivel {
    Scanner scanner= new Scanner(System.in);
    Random random= new Random();
    CuartoNivel cuartoNivel= new CuartoNivel();
    ImprmirPuntos imprimirPuntos= new ImprmirPuntos();
    public void adivinaNumeroPar(){
        int ganador=0, perdedor=0;
        System.out.println("\n\t----------Tercer Nivel----------");
        System.out.println("\t------ADIVINA EL NUMERO PAR-------");
        System.out.println("Suma 30 puntos para pasar de nivel");
        do {
            System.out.println("Adivina el numero en el que estoy pensando \n->  ");
            int eleccioJugador = scanner.nextInt();
            int numeroAleatorio= random.nextInt(3) * 2;
            System.out.println("Numero Aleatorio: " + numeroAleatorio);
            if (eleccioJugador == numeroAleatorio) {
                System.out.println("Ganaste un punto!");
                ganador++;
                System.out.println("Puntos acumulados: "+ ganador);
                if (ganador==30){
                    System.out.println("\nPASASTE DE NIVEL\n");
                    cuartoNivel.adivinaNumeroImpar();
                }
            }
            else {
                System.out.println("Fallaste");
                perdedor++;
            }
        }while (perdedor!=3);
        System.out.println("---------PERDISTE :c---------");
        imprimirPuntos.imprimirPuntos(ganador+30, perdedor);
    }
}
