/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Jugador;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EquipoService {

    public EquipoService() {
    }
    
    public void agregarJugador(List <Jugador> jugadores){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del jugador: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese la posicion: ");
        String pos = sc.nextLine();
        System.out.println("Ingrese el numero de camiseta: ");
        int nro = sc.nextInt();
        sc.nextLine();
        jugadores.add(new Jugador(nombre,apellido,pos,nro));
    }
    
    public void imprimirEquipo(List <Jugador> jugadores){
        for(Jugador jugador:jugadores){
            System.out.println(jugador.toString());
        }
    }
}
