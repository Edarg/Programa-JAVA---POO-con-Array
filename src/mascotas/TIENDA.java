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

//LLBRERIA
import java.util.ArrayList;

public class TIENDA {
         
    //ATRIBUTOS
    private String ID_Tienda;
    private String Propietario;
    private String Nombre_Tienda;
    public ArrayList<MASCOTA> mascota = new ArrayList();
    
    //COSTRUCTOR
    public TIENDA(String ID_Tienda, String Propietario, String Nombre_Tienda) {
        this.ID_Tienda = ID_Tienda;
        this.Propietario = Propietario;
        this.Nombre_Tienda = Nombre_Tienda;
    }
    
    //METODOS GET
    public String getID_Tienda() {
        return ID_Tienda;
    }

    public String getPropietario() {
        return Propietario;
    }

    public String getNombre_Tienda() {
        return Nombre_Tienda;
    }
    
    //METODOS SET
    public void setID_Tienda(String ID_Tienda) {
        this.ID_Tienda = ID_Tienda;
    }

    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    public void setNombre_Tienda(String Nombre_Tienda) {
        this.Nombre_Tienda = Nombre_Tienda;
    }
    
    
  
    //METODO PARA IMPRIMIR TODOS LOS ANIMALES DE QUE POSEE LA TIENDA
     public void ListadoAnimal()
    {
     System.out.println("Listado de todos animales que tiene la sucursal "
                        + this.Nombre_Tienda+" :");
     
     
     int contador = mascota.size();
     for(int i = 0; i<contador; i++)
     {
       System.out.println((i+1)+". Tipo: "+mascota.get(i).getT_Animal()
                          +"; Raza:"+mascota.get(i).getRaza()+"; Stock:"
                          +mascota.get(i).getStock());
     }
    }
    
}

