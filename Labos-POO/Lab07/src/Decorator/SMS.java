package Decorator;

public class SMS implements DataSource {



    // Implementación 'default' de los métodos de la interfaz
    @Override
    public void sendMessage(String data) {
        System.out.println("Sending thru SMS...");
    }
}