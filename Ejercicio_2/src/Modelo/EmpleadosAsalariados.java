package Modelo;



public class EmpleadosAsalariados extends Empleado {

    private double Salario = 20.450;

    public EmpleadosAsalariados(String Nombre, int Id, double sal) {
        super(Nombre, Id);
        this.Salario = sal;

    }

    @Override
    public void Pagar() {
        System.out.println("Su salario es : $" + Salario);

    }

}
