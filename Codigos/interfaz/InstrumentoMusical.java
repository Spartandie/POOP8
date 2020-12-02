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
public interface InstrumentoMusical {
    //Por defecto todos los metodos son public y abstract
    /**
     * tocar
     */
    void tocar();
    /**
     * afinar
     */
    void afinar();
    /**
     * tipo inst
     *  @return tipo isntrumento
     */
    String tipoInstrumento();
    
}
