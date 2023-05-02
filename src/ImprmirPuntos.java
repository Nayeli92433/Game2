public class ImprmirPuntos {
    public void imprimirPuntos(int puntos, int perdedor) {
        System.out.println("\n----------------------------------------------");
        System.out.println("             EL JUEGO HA TERMINADO");
        System.out.println("----------------------------------------------");
        System.out.println("Tus puntos acumulados fueron: -> "+puntos);
        System.out.println(" Fallaste -> " + perdedor + " veces");
        System.exit(0);
    }
}
