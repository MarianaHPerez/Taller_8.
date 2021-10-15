
package Test;

import Modelo.Profesor;
import Modelo.ProfesorInterino;

public class TestHerencia1 {
    public static void main(String[] args) {
        
        Profesor P1 = new Profesor(" 11-934-03"," Severus"," Snape");
        ProfesorInterino P2 = new ProfesorInterino(" Aiden"," Cassis"," 11-934-03", "14-Marzo-2004");
        
        
        System.out.println(P1.RetornarDatos());
        System.out.println(P2.RetornarDatos());
        
        
    }
    
}
