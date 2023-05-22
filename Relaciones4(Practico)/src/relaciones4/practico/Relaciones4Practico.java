/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones4.practico;
import Entity.Carta;
import Entity.Baraja;
import Entity.Service.BarajaServicio;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Relaciones4Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarajaServicio bs = new BarajaServicio();
        Baraja baraja = bs.crearBaraja();
        bs.mostrarBaraja(baraja);
        bs.barajar(baraja);
        bs.mostrarBaraja(baraja);
        for (int i = 0; i < 32; i++) {
            bs.siguienteCartar(baraja);
        }
        bs.mostrarBaraja(baraja);
        bs.cartasMonton(baraja);
        System.out.println(bs.cartasDisponibles(baraja));
        ArrayList <Carta> cartas = bs.darCartas(3, baraja);
        System.out.println(cartas.toString());
        bs.mostrarBaraja(baraja);
    }
    
}
