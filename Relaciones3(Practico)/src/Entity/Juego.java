/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Juego {
    List <Jugador> jugadores;
    Revolver revolver;
    
    public Juego(){
    }
    
    public void llenarJuego(List <Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
    
    public void ronda(){
        Scanner sc = new Scanner(System.in);
        Iterator <Jugador> it = jugadores.iterator();
        while(true){
            Jugador jugador = it.next();
            System.out.println("Turno del: " + jugador.getNombre());
            System.out.println("Presione Enter..");
            sc.nextLine();
            if (jugador.disparaRevolver(revolver)) {
                System.out.println("Juego terminado!, perdio: " + jugador.getNombre() );
                System.out.println("Presione Enter..");
                sc.nextLine();
                break;
                        }
            System.out.println("Te Salvaste!");        
            if(!it.hasNext()){it = jugadores.iterator();}            
        }        
    }
}
