/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones3.practico;
import Entity.Revolver;
import Entity.Jugador;
import Entity.Juego;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Relaciones3Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Jugador> jugadores = new ArrayList<>();
        Juego juego = new Juego();
        Revolver revolver = new Revolver();
        int cont = 0;
        char op = 's';
        Scanner sc = new Scanner(System.in);
        do{
            if(op == 's' || op == 'S'){
                 cont ++;
                jugadores.add(new Jugador(cont,"Jugador " + String.valueOf(cont),false));
               
                System.out.println("Jugador Agregado");
            } 
            System.out.println("Cantidad de jugadores por el momento: " + cont);
            System.out.println("Desea agregar otro jugador? (s/n)");
            op = sc.next().charAt(0);
            sc.nextLine();
            switch(op){
                case 's':break;
                case 'S':break;
                case 'n':break;
                case 'N':break;
                default: System.out.println("Error!, la opcion ingresada no existe.");
            }
        }while(op != 'n' && op != 'N');
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
    }
    
}
