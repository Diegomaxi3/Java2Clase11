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
public class Dni {
    char serie;
    int nro;

    public Dni() {
    }

    public Dni(char serie, int nro) {
        this.serie = serie;
        this.nro = nro;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", nro=" + nro + '}';
    }
    
    
}
