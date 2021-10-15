package Test;

import Modelo.*;

import java.util.Scanner;

public class Test {

    public static void main(String args[]) {
        Empleado as = new EmpleadosAsalariados("", 0, 2520000);
        EmpleadoPorHora eh = new EmpleadoPorHora( 0, 0,"", 0);
        EmpleadosporComision ec = new EmpleadosporComision("", 0, 0, 0);
        EmpleadosAsalariadosporComision ac = new EmpleadosAsalariadosporComision("", 0, 0, 0);
        Scanner sc = new Scanner(System.in);
        int numero = 1;

        while (numero <= 5) {
            System.out.println("\n******************************\n");
            System.out.println("**** Escoja una opcion :*****"
                    + "\n1)Asalariados "
                    + "\n2)Empleados por hora"
                    + "\n3)Empleado por comision"
                    + "\n4)Asalariado por comision"
                    + "\n5)Salir");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.println("Ingrese su nombre: ");
                as.setNombre(sc.next());
                System.out.println("Ingrese su identificacion: ");
                as.setId(sc.nextInt());
                System.out.println("Nombre:" + as.getNombre() + "\nid:" + as.getId());

                as.Pagar();

                numero++;
            }

            if (op == 2) {
                System.out.println("Ingrese su nombre: ");
                as.setNombre(sc.next());
                System.out.println("Ingrese su identificacion: ");
                as.setId(sc.nextInt());

                System.out.println("Ingrese el numero de horas trabajadas: ");
                eh.setHora(sc.nextInt());

                System.out.println("Nombre:" + as.getNombre() + "\nid:" + as.getId());

                eh.Pagar();
                numero++;

            }

            if (op == 3) {
                System.out.println("Ingrese su nombre: ");
                as.setNombre(sc.next());
                System.out.println("Ingrese su identificacion: ");
                as.setId(sc.nextInt());

                System.out.println("Ingrese el valor de las ventas hechas: ");
                ec.setPorcentaje(sc.nextDouble());

                System.out.println("Nombre:" + as.getNombre() + "\nid:" + as.getId());
                ec.Pagar();
                numero++;
            }

            if (op == 4) {
                System.out.println("Ingrese su nombre: ");
                as.setNombre(sc.next());
                System.out.println("Ingrese su identificacion: ");
                as.setId(sc.nextInt());

                System.out.println("Ingrese el valor de las ventas hechas: ");
                ac.setPorcentaje(sc.nextDouble());

                System.out.println("Nombre: " + as.getNombre() + "\nid:" + as.getId());
                ac.Pagar();
                numero++;
            }

            if (op == 5) {
                System.out.println("Muchas Gracias por utilizar el programa");
                break;            
            }

        }

    }

}
