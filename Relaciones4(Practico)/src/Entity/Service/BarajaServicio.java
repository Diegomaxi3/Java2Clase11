/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;

import Entity.Baraja;
import Entity.Carta;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Diego
 */
public class BarajaServicio {

    public BarajaServicio() {
    }
    
      public Baraja crearBaraja(){
        List<Carta> cartas = new ArrayList();
        
        for (int i = 1; i <= 4; i++) {
            String tipo = "";
            switch(i){
                case 1: tipo ="Espada";break;
                case 2: tipo ="Basto";break;
                case 3: tipo ="Oro";break;
                case 4: tipo ="Copa";break;
                        }
            for (int j = 1; j <= 10; j++) {
                if (j < 8){cartas.add(new Carta(j,tipo));}
                if (j == 8){cartas.add(new Carta(10,tipo));}
                if (j == 9){cartas.add(new Carta(11,tipo));}
                if (j == 10){cartas.add(new Carta(12,tipo));}
            }
        }
        Baraja baraja = new Baraja(cartas);
        return baraja;
    }
    
    public void barajar(Baraja baraja){
        Collections.shuffle(baraja.getCartas());
    }
    
    public void siguienteCartar(Baraja baraja){       
        if ( cartasDisponibles(baraja) > 0){
            Iterator <Carta> it = baraja.getCartas().iterator();
            Carta carta = it.next();
            System.out.println(carta.toString());
            baraja.addCartaFuera(carta);
            it.remove();
        }else
            System.out.println("No hay mas cartas");
    }
    
    public int cartasDisponibles(Baraja baraja){
        return baraja.getCartas().size();
    }
    
    public ArrayList<Carta> darCartas(int cant,Baraja baraja){
        ArrayList <Carta> cartas = new ArrayList<>();
        if(cartasDisponibles(baraja) > cant){  
          Iterator <Carta> it = baraja.getCartas().iterator();
          for (int i = 0; i < cant; i++) {
             Carta carta = it.next();
             cartas.add(carta);
             it.remove();
          }
        }
        return cartas;
    }

    public void cartasMonton(Baraja baraja){
        System.out.println(baraja.mostrarCartasFuera());
    }
    
    public void mostrarBaraja(Baraja baraja){
        System.out.println(baraja.toString());
    }
}
