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
public class InstrumentoViento extends Object implements InstrumentoMusical{
    /**
     * tocar
     */
    @Override
    public void tocar(){
        System.out.println("Estoy tocando un instrumento de viento");
        
    }
    /**
     * afinar
     */
    @Override
    public void afinar(){
        System.out.println("Estoy afinando un instrumento de viento");
    }
    /**
     * tipo inst
     * @return "Instrumento de viento"
     */
    @Override
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
    /**
     * tostring
     * @return "InstrumentoViento{" + '}'
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
