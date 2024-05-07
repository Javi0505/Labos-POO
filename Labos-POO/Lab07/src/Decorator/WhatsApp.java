package Decorator;// Decorador de encriptación

public class WhatsApp extends DataSourceDecorator {

    public WhatsApp(DataSource source) {
        super(source); // Guardamos el objeto en el atributo de la clase padre
    }

    @Override
    public void sendMessage(String data) {
        System.out.println("Sending thru WhatsApp...");
    }

}