
package seleccioncolombiaapp;

import java.util.Scanner;
import jugador.Jugador;
import java.util.ArrayList;

public class SeleccionColombiaApp {


    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Jugador jugador = new Jugador();
        int cont=0;
        int opcion;
        int cantidad=0;

            byte numeroCamiseta;
            String nombre;
            String apellido;
            String posicion;
            byte edad;
            String equipo;
            
            Jugador auxiliar = new Jugador();
        
        do{  
            System.out.println("-------------Bienvenido Señor Reinaldo -------------");
            System.out.println("--*-- --*-- --*-- --*-- --*-- --*-- --*-- --*-- --*-- --*-- --*-- --*--* ");
            System.out.println("1.  Agregar un Jugador");
            System.out.println("2.  Buscar un Jugador");
            System.out.println("3.  Editar un Jugador");
            System.out.println("4.  Mostrar la convocatoria");
            System.out.println("5.  Salir");
            System.out.print("- Digite una opción: ");
            opcion=entrada.nextInt();
           
            switch(opcion){
                
                
               case 1:
                                     
                   System.out.println(" ");
                   System.out.println("--- Agregar un Jugador ---");
                   System.out.println(" ");
                   
                  System.out.print("Digite el número de la camiseta: ");
                   numeroCamiseta=(entrada.nextByte());
                   
                   System.out.print("Digite el nombre del jugador: ");
                   nombre=(entrada.next());
                   
                   System.out.print("Digite el apellido del jugador: ");
                   apellido=(entrada.next());
                   
                   System.out.print("Digite la posición del jugador: ");
                   posicion=(entrada.next());
                   
                   System.out.print("Digite la edad del jugador: ");                   edad = entrada.nextByte();
                   if(edad<=15){
                       System.out.print("Edad mínima 16 años, digite la edad del jugador de nuevo: ");
                       edad=(entrada.nextByte());
                   }else{
                        jugador.setEdad(edad);
                   }
                   System.out.print("Digite el equipo del jugador: ");
                   equipo=(entrada.next());
                   
                   auxiliar = new Jugador();
                   
                   auxiliar.setNumeroCamiseta(numeroCamiseta);
                   auxiliar.setNombre(nombre);
                   auxiliar.setApellido(apellido);
                   auxiliar.setEdad(edad);
                   auxiliar.setEquipo(equipo);
                   auxiliar.setPosicion(posicion);

                   
                   jugadores.add(auxiliar);
                   //cont++;
                   
                       break;
                   
               case 2:
                   System.out.println(" ");
                   System.out.println("--- Buscar un Jugador ---");
                   System.out.print("Introduce el numero de la camiseta: ");
                   for (int i=0;i<jugadores.size();i++) {
                       if(jugadores.get(i).getNumeroCamiseta()==entrada.nextByte()){
                           System.out.println("Efectivamente lo convocaste");
                        System.out.println(" ");    
                       System.out.print(" Número de Camiseta: "+ jugadores.get(i).getNumeroCamiseta()+" ,"); ;
                       System.out.print(" Nombre: "+jugadores.get(i).getNombre()+" ,"); ;
                       System.out.print(" Apellido:  "+jugadores.get(i).getApellido()+" ,"); 
                       System.out.print(" Posición:  "+jugadores.get(i).getPosicion()+" ,"); 
                       System.out.print(" Edad:  "+jugadores.get(i).getEdad()+" ,"); 
                       System.out.print(" Equipo:  "+jugadores.get(i).getEquipo()+" ."); 
                       System.out.println(" ");
                        break;
                       }else{
                           System.out.println("Dele la oportunidad al muchacho");
                       }  
                   }
                   System.out.println(" ");
                   
                       break;  
               case 3:
                   System.out.println(" ");
                   System.out.println("--- Editar un Jugador ---");
                   System.out.println(" ");
                   System.out.print("Digite el número de la camiseta del jugador que desea editar: ");
                   System.out.println(" ");
                  
                   
                   for (int i=0;i<jugadores.size();i++) {
                       
                       
                       if(jugadores.get(i).getNumeroCamiseta()==entrada.nextByte()){
                           System.out.println("Ingresa los nuevos datos");
                           System.out.print("Digite el número de la camiseta: ");
                           jugadores.get(i).setNumeroCamiseta(entrada.nextByte());

                            System.out.print("Digite el nombre del jugador: ");
                            jugadores.get(i).setNombre(entrada.next());

                            System.out.print("Digite el apellido del jugador: ");
                            jugadores.get(i).setApellido(entrada.next());

                            System.out.print("Digite la posición del jugador: ");
                            jugadores.get(i).setPosicion(entrada.next());

                            System.out.print("Digite la edad del jugador: ");
                            jugadores.get(i).setEdad(entrada.nextByte());

                            System.out.print("Digite el equipo del jugador: ");
                            jugadores.get(i).setEquipo(entrada.next());
                            break;
                       }else{
                           System.out.println("Dele la oportunidad al muchacho");
                       }  
                   }
                       
                       
               case 4:
                   System.out.println(" ");
                   System.out.println("--- Lista Completa de Jugadores ---");
                   
                   
                   System.out.println(" ");
                   
                   
                 for (int i=0; i < jugadores.size(); i++){          
                       System.out.print("Número de Camiseta:  "+ jugadores.get(i).getNumeroCamiseta()+" ,"); ;
                       System.out.print(" Nombre: "+jugadores.get(i).getNombre()+" ,"); ;
                       System.out.print(" Apellido:  "+jugadores.get(i).getApellido()+" ,"); 
                       System.out.print(" Posición:  "+jugadores.get(i).getPosicion()+" ,"); 
                       System.out.print(" Edad:  "+jugadores.get(i).getEdad()+" ,"); 
                       System.out.print(" Equipo:  "+jugadores.get(i).getEquipo()+" ."); 
                        System.out.println(" ");    
                   }
                       break;
                       
               case 5:
                   System.exit(0);
                       break;
           }
            //System.out.println(jugadores.get(cont).getNombre());
            
        }while(opcion!=5);
       
        
    }
    
}
