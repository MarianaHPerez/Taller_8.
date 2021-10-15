package Test;

import Modelo.Sobremesa;
import Modelo.Portatil;

public class Test {

    public static void main(String[] args) {
        
        System.out.println("***Portatil****");
        Portatil P1 = new Portatil( 61,"La comodidad a tu alcance", "FM123497LI", 6000 );
        System.out.println(P1.RetornarDatos());

        System.out.println("\n****Sobremesa*****");
        Sobremesa S1 = new Sobremesa(" Mid-Tower (ATX) ","Eficiente para tus nesecidades"," FKL1237546YT",12.000);
        System.out.println(S1.RetornarDatos());
    }

}
