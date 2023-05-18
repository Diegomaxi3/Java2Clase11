/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Service;
import Entity.Persona;
import Entity.Dni;
/**
 *
 * @author Diego
 */
public class PersonaService {

    public PersonaService() {
    }
    
    public Persona crearPersona(){
        Dni dni = new Dni('D',31473365);
        Persona persona = new Persona("Diego","Cuitinio",dni);
        return persona;
    }
    
    public void imprimirPersona(Persona persona){
        System.out.println(persona.toString());
    }  
   
}
