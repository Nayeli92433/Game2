import java.util.Random;
import java.util.Scanner;

public class SegundoNivel {
    Scanner scanner= new Scanner(System.in);
    Random random= new Random();
    TercerNivel tercerNivel = new TercerNivel();
    ImprmirPuntos imprimirPuntos= new ImprmirPuntos();
    int ganador=0, perdedor=0;
    public void adivinaNumero(){

        System.out.println("\n\t----------Segundo Nivel----------");
        System.out.println("\t-------ADIVINA EL NUMERO-------");
        System.out.println("Suma 20 puntos para pasar de nivel");
        do {
            System.out.println("Adivina el numero en el que estoy pensando (1-5) \n->  ");
            int eleccioJugador = scanner.nextInt();
            int numeroAleatorio = generarNumero();
            System.out.println("Numero Aleatorio: " + numeroAleatorio);
            if (eleccioJugador == numeroAleatorio) {
                System.out.println("Ganaste un punto!");
                ganador++;
                System.out.println("Puntos acumulados: "+ ganador);
                if (ganador==20){
                    System.out.println("\nPASASTE DE NIVEL\n");
                    tercerNivel.adivinaNumeroPar();
                }
            }
            else {
                System.out.println("Fallaste");
                perdedor++;
            }
        }while (perdedor!=3 );

        System.out.println("---------PERDISTE :c---------");
        imprimirPuntos.imprimirPuntos(ganador+10, perdedor);
    }
    public int generarNumero(){
        return random.nextInt(5)+1;
    }
}
