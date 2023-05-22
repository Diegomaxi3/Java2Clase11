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
public class Revolver {
    private int posicionTambor;
    private int posicionAgua;

    public Revolver() {
       llenarRevolver();
    }

    public int getPosicionTambor() {
        return posicionTambor;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posicionTambor + ", posicionAgua=" + posicionAgua + '}';
    }
    
    private void llenarRevolver(){
        posicionAgua = (int)(Math.random() * 11 + 1);
        posicionTambor = (int)(Math.random() * 11 + 1);

    }
    
    public boolean mojar(){
        return posicionAgua == posicionTambor; 
    }
    
    public void siguienteChorro(){
        if (posicionTambor == 12)
            posicionTambor=0;
        else 
            posicionTambor+=1;
    }
}
