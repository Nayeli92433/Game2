import java.util.Random;
import java.util.Scanner;

public class CuartoNivel {
    Scanner scanner= new Scanner(System.in);
    Random random= new Random();
    ImprmirPuntos imprimirPuntos= new ImprmirPuntos();
    public void adivinaNumeroImpar(){
        int ganador=0, perdedor=0;
        System.out.println("\n\t------------Cuarto Nivel----------");
        System.out.println("\t-------ADIVINA EL NUMERO IMPAR-------");
        System.out.println("Suma 40 puntos para pasar de nivel");
        do {
            System.out.println("Adivina el numero en el que estoy pensando  \n->  ");
            int eleccioJugador = scanner.nextInt();
            int numeroAleatorio = random.nextInt(4) + 1;
            if (numeroAleatorio % 2 == 0) {
                numeroAleatorio++;
            }
            System.out.println("Numero Aleatorio: " + numeroAleatorio);
            if (eleccioJugador == numeroAleatorio) {
                System.out.println("Ganaste un punto!");
                ganador++;
                System.out.println("Puntos acumulados: "+ ganador);
                if (ganador==40){
                    System.out.println("----------------------------------------");
                    System.out.println("--------------FELICIDADES---------------");
                    System.out.println("----------------------------------------");
                    imprimirPuntos.imprimirPuntos(ganador+60, perdedor);
                }
            }
            else {
                System.out.println("Fallaste");
                perdedor++;
            }
        }while (perdedor!=3);

        System.out.println("---------PERDISTE :c---------");
        imprimirPuntos.imprimirPuntos(ganador+60, perdedor);

    }

}
