/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2.teorico;
import Entity.Service.EquipoService;
import Entity.Equipo;
/**
 *
 * @author Diego
 */
public class Relaciones2Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Equipo equipo = new Equipo();
        EquipoService es = new EquipoService();
        es.agregarJugador(equipo.getJugadores());
        es.agregarJugador(equipo.getJugadores());
        es.agregarJugador(equipo.getJugadores());
        es.agregarJugador(equipo.getJugadores());
        es.agregarJugador(equipo.getJugadores());
        es.imprimirEquipo(equipo.getJugadores());
    }
    
}
