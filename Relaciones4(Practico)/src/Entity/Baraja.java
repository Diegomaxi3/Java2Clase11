/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
import Entity.Carta;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Diego
 */
public class Baraja {
    private List<Carta> cartas;
    private List<Carta> cartasFuera;

    public Baraja() {
        cartasFuera = new ArrayList<>();
    }

    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
        cartasFuera = new ArrayList<>();
    }
    
    public Baraja(List<Carta> cartas, List<Carta> cartasFuera) {
        this.cartas = cartas;
        this.cartasFuera = cartasFuera;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public List<Carta> getCartasFuera() {
        return cartasFuera;
    }

    public void setCartasFuera(List<Carta> cartasFuera) {
        this.cartasFuera = cartasFuera;
    }
    
    public void addCartaFuera(Carta carta){
        cartasFuera.add(carta);
    }

    @Override
    public String toString() {
        return "{" + cartas + "}";
    }
    
    public String mostrarCartasFuera(){
        return cartasFuera.toString();
    }
      
}
