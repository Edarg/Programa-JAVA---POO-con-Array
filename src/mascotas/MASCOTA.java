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
public class MASCOTA {
    
    
    //ATRIBUTOS
    private int ID_Mascota;
    private String T_Animal;
    private int Edad;
    private String Sexo;
    private String Raza;
    private int Stock;
  
    
    //CONSTRUCTOR
    public MASCOTA(int ID_Mascota, String T_Animal, int Edad, 
                   String Sexo, String Raza, int Stock) 
    {
        this.ID_Mascota = ID_Mascota;
        this.T_Animal = T_Animal;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Raza = Raza;
        this.Stock = Stock;   
    }
    
    //METODO GET
    public int getID_Mascota() {
        return ID_Mascota;
    }

    public String getT_Animal() {
        return T_Animal;
    }

    public int getEdad() {
        return Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getRaza() {
        return Raza;
    }

    public int getStock() {
        return Stock;
    }

    //METODO GET
    public void setID_Mascota(int ID_Mascota) {
        this.ID_Mascota = ID_Mascota;
    }

    public void setT_Animal(String T_Animal) {
        this.T_Animal = T_Animal;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
       
}
