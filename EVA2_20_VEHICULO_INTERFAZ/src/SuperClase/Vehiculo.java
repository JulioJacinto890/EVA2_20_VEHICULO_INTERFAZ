/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClase;


import eva2_20_vehiculo_interfaz.ControlVelocidad;

/**
 *
 * @author hp
 */
public class Vehiculo implements ControlVelocidad{
  private String marca;
private String color;
private int vel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public int getVel() {
        return vel;
    }

  
    
    public Vehiculo (){
    this.marca = "---";
    this.color = "---";    
    }

    
  @Override  
    
 public void imprimirVel(){
      System.out.println("Velocidad: "+vel);   
 }   

@Override 
 
public void acelerar(){
 vel +=5;   
} 


@Override

public void detener(){
 vel=0;   
}


public void data(){
    System.out.println("Vehículo.");
    System.out.println("Marca: "+marca); 
    System.out.println("Color: "+color);
}

    
}