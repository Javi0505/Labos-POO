public class CuentaAhorro extends Cuenta{
    private double porcentajeComision;
    private double cantidadDeComision;
    private double porcentajeIntereses;

    public CuentaAhorro(double balance) {
        super.balance = balance;
        super.contadorTransacciones = 0;
        this.porcentajeComision = 6;
    }
    @Override
    public boolean retirar(double cantidad){
        cantidadDeComision = (porcentajeComision/100);
        System.out.println("Comision por transaccion: " + cantidadDeComision);

        return super.retirar(cantidad + cantidadDeComision);
    }
    @Override
    public boolean generarInteresesMensuales(double porcentaje) {
        this.porcentajeIntereses = porcentaje;
        System.out.println("Ganara este porcentaje de intereses: " + porcentaje + "%");
        return true;
    }
    @Override
    public boolean pagarFactura(int numeroDeFactura, double cantidad) {
        System.out.println("Cuenta de tipo Ahorro, no puede tener este servicio");
        return false;
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta: " + super.numeroDeCuenta);
        System.out.println("Balance: " + super.balance);
        System.out.println("Transacciones: " + super.contadorTransacciones);
        System.out.println("Porcentaje de comision: " + this.porcentajeComision + "%");
        System.out.println("Porcentaje de intereses: " + this.porcentajeIntereses + "%");
    }
}
