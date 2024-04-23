public abstract class Cuenta{
    //Atributos
    protected static long contadorDeNumeroDeCuenta = 9845668457L;
    protected long numeroDeCuenta;
    protected double balance;
    protected int contadorTransacciones;

    //Metodos abstractos
    public abstract boolean generarInteresesMensuales(double porcentaje);
    public abstract boolean pagarFactura(int numeroDeFactura, double cantidad);
    public abstract void mostrarDatos();

    public Cuenta() {
        this.numeroDeCuenta = nuevaCuenta();
    }

    //Metodos
    public static long nuevaCuenta() {
        contadorDeNumeroDeCuenta++;
        return contadorDeNumeroDeCuenta;
    }


    //Metodos
    public boolean retirar(double cantidad){
        if(cantidad <= balance) {
            balance -= cantidad;
            contadorTransacciones++;
            return true;
        }else {
            return false;
        }

    };
    public boolean depositar(double cantidad){
        if(cantidad > 0){
            balance += cantidad;
            contadorTransacciones++;
            return true;
        } else {
            return false;
        }
    };

    public double getBalance(){
        return balance;
    }

    public long getNumeroDeCuenta()
    {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(long numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getContadorTransacciones() {
        return contadorTransacciones;
    }

    public void setContadorTransacciones(int contadorTransacciones) {
        this.contadorTransacciones = contadorTransacciones;
    }
}