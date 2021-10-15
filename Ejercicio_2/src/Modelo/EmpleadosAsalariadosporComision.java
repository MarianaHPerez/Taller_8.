
package Modelo;


public class EmpleadosAsalariadosporComision extends Empleado{
    
    
    private double Salario = 12.000;
    private double Porcentaje;
    
    
        public EmpleadosAsalariadosporComision(String Nombre, int Id, double sal, double por){
            super(Nombre,Id);
            this.Salario=sal;
            this.Porcentaje=por;
        }

        public double getSalario() {
            return Salario;
        }

        public double getPorcentaje() {
            return Porcentaje;
        }

        public void setSalario(double Salario) {
            this.Salario = Salario;
        }

        public void setPorcentaje(double Porcentaje) {
            this.Porcentaje = Porcentaje;
        }



        public void Pagar(){
            double sal=Salario*01;
            double Salt=Salario+sal;
            double SalU =getPorcentaje()*0.3;
            double SalarioTotal=Salario+SalU+Salt;
            System.out.println("Su salario es " + SalarioTotal);
        }
    
    
}
