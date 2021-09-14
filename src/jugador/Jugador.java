/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Usuario
 */
public class Jugador {
    
    private byte numeroCamiseta;
    private String nombre;
    private String apellido;
    private String posicion;
    private byte edad;
    private String equipo;

    public Jugador() {
    }

    public byte getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(byte numeroCamiseta) {
        if(numeroCamiseta<0){
            System.out.println("Error el numero de la camiseta debe ser mayor a 1");
        }else{
            this.numeroCamiseta = numeroCamiseta;
        }   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.isEmpty()){
            System.out.println("EL nombre no puedo estar vacio");
        }else{
            this.nombre = nombre;
        }
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido.isEmpty()){
           System.out.println("EL apellido no puedo estar vacio");
        }else{
            this.apellido = apellido;
        }
        
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        if(posicion.isEmpty()){
            
        }else{
            this.posicion = posicion;
        }
        
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        if(edad <=15){
            System.out.println("El jugador debe de tener más de 16 años");
        }else{
           this.edad = edad; 
        }
        
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        if(equipo.isEmpty()){
            this.equipo = "Sin equipo";
        }else{
            this.equipo = equipo;   
        }    
    }
    
    


    
    

    
    
    
}
