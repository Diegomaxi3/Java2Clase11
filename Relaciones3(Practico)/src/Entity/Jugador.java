/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;
/**
 *
 * @author Diego
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public String getNombre() {
        return nombre;
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    public boolean disparaRevolver(Revolver r){
        mojado = r.mojar();
        if(!mojado) r.siguienteChorro();
        return mojado;
    }
}
