package Modelo;

public class Cuenta {

    private int NumeroCuenta;
    private String NombreCliente;
    double Saldo = 12500;

    public Cuenta() {
    }

    public Cuenta(int NumeroCuenta, String NombreCliente, ) {
        this.NumeroCuenta = NumeroCuenta;
        this.NombreCliente = NombreCliente;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }



    @Override
    public String toString() {
        return "\nNumero de cuenta: " + this.NumeroCuenta
                + "\nNombre del cliente: " + this.NombreCliente
                + "\nSaldo: " + this.Saldo;
    }

}
