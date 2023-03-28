/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

/**
 *
 * @author EDDY
 */
public class MASCOTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TIENDA suc = new TIENDA("M-987","Eddy Argueta","petfamily");
        MASCOTA p1 = new MASCOTA(123456, "Perro", 1, "macho", "beagle", 9);
        MASCOTA p2 = new MASCOTA(123457, "Iguana", 9, "hembra", "Cueva", 1);
        MASCOTA p3 = new MASCOTA(123458, "Gato", 2, "macho", "persa", 5);
        MASCOTA p4 = new MASCOTA(123459, "Ave", 1, "hembra", "Loro", 2);
        MASCOTA p5 = new MASCOTA(1234510, "Serpiente", 6, "macho", "pitón", 2);
        MASCOTA p6 = new MASCOTA(1234511, "Cuyo", 1, "hembra", "Eqipsio", 4);
        MASCOTA p7 = new MASCOTA(1234512, "pez", 2, "macho", "payaso", 4);
        MASCOTA p8 = new MASCOTA(1234513, "Tigre", 7, "macho", "blanco", 1);
        MASCOTA p9 = new MASCOTA(1234514, "pinguino", 7, "hembra", "vaboa", 2);
        MASCOTA p10 = new MASCOTA(1234515, "Tortuga", 80, "macho", "marina", 4);
        
        suc.mascota.add(p1);
        suc.mascota.add(p2);
        suc.mascota.add(p3);
        suc.mascota.add(p4);
        suc.mascota.add(p5);
        suc.mascota.add(p6);
        suc.mascota.add(p7);
        suc.mascota.add(p8);
        suc.mascota.add(p9);
        suc.mascota.add(p10);
        
     
        suc.ListadoAnimal();
        
        
       
        
       
    }
    
}
