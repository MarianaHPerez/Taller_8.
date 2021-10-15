package Modelo;



public class Cheques extends Cuenta {

    private int ComisionUso;
    private int CMSaldoI;

    public Cheques(int numCuenta, String nombreCliente, double Saldo, int comisionUso, int CMSaldoI) {
        super(NumeroCuenta, NombreCliente, Saldo );
        this.ComisionUso = comisionUso;
        this.CMSaldoI = CMSaldoI;

    }

    public Cheques(int ComisionUso, int CMSaldoI) {
        this.ComisionUso = ComisionUso;
        this.CMSaldoI = CMSaldoI;
    }

    public Cheques(int ComisionUso, int CMSaldoI, int NumeroCuenta, String NombreCliente) {
        super(NumeroCuenta, NombreCliente, Saldo);
        this.ComisionUso = ComisionUso;
        this.CMSaldoI = CMSaldoI;
    }
    
    

    public Cheques(int numCuenta, String nombreCliente, double saldo) {
        super(numCuenta, nombreCliente, saldo);
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
}
