package Decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source; // Guardamos el objeto como nuestro wrapee
    }

    // La clase solo delega a que el objeto ejecute sus métodos
    @Override
    public void sendMessage(String data) {
        wrappee.sendMessage(data);
    }
}