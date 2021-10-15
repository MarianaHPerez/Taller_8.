package Modelo;



public class Ahorro extends Cuenta {

    private String FechaV;
    private int interes;

    public Ahorro(int numCuenta, String nombreCliente, double saldo, int interes, String FechaV) {
        super(numCuenta, nombreCliente, saldo);
        this.interes = interes;
        this.FechaV = FechaV;

    }

    public Ahorro(int numCuenta, String nombreCliente, double saldo) {
        super(numCuenta, nombreCliente, saldo);
    }

    /**
     * @return the interes
     */
    public int getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(int interes) {
        this.interes = interes;
    }

    public boolean ingreso(double n) {
        boolean ingresoCorrecto = true;
        if (n < 0) {
            ingresoCorrecto = false;
        } else {
            Saldo = Saldo + n;
        }
        return ingresoCorrecto;
    }

    public boolean reintegro(double n) {
        boolean reintegroCorrecto = true;
        if (n < 0) {
            reintegroCorrecto = false;
        } else if (Saldo >= n) {
            Saldo -= n;
        } else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
