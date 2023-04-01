/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClase;

/**
 *
 * @author hp
 */
public class Bicicleta extends Vehiculo{
    
private String tipo; //Montaña, triciclo, etc.    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String tipo, String marca, String color) {
        super(marca, color);
        this.tipo = tipo;
    }

    
    public Bicicleta(String tipo) {
        super();
        this.tipo = "---";
    }


    
    
    
}
