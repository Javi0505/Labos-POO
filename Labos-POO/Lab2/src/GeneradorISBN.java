public class GeneradorISBN {
    private static int contador = 0;

    public static int generadorISBN(){

        contador++;
        return contador;
    }
}
