public class CuentaCorriente extends Cuenta {
    @Override
    public boolean generarInteresesMensuales(double porcentaje) {
        System.out.println("Cuenta de tipo Corriente, no puede tener este servicio");
        return false;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Cuenta: " + super.numeroDeCuenta);
        System.out.println("Balance: " + super.balance);
        System.out.println("Transacciones: " + super.contadorTransacciones);
    }

    @Override
    public boolean pagarFactura(int numeroDeFactura, double cantidad) {
        System.out.println("Numero de factura: " + numeroDeFactura + " pagada exitosamente");
        if (retirar(cantidad)) {
            System.out.println("Factura pagada exitosamente");
            return true;
        } else {
            System.out.println("Tiene fondos insuficientes. No se puede pagar la factura");
            return false;
        }
    }
}
