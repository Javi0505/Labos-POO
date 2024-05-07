package Decorator;// Decorador de compresor

public class Email extends DataSourceDecorator {
    // Atributos específicos de la clase decoradora
    private int compLevel = 6;

    public Email(DataSource source) {
        super(source); // Guardamos el objeto en el atributo de la clase padre
    }

    // Métodos específicos de la clase decoradora
    public int getCompressionLevel() {
        return compLevel;
    }

    public void setCompressionLevel(int value) {
        compLevel = value;
    }

    // Funcionalidades sobre escritas
    @Override
    public void sendMessage(String data) {
        System.out.println("Sending thru E-mail...");
    }

}