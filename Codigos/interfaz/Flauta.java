/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author spart
 */
public class Flauta extends InstrumentoViento {
    /**
     * flauta
     */
    public Flauta() {
    }
    /**
     * tipo inst
     * @return "Flauta"
     */
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
    /**
     * tostring 
     * @return "Flauta{" + '}
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
    
}
