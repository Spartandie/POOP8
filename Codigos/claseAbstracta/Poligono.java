/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author spart
 */
public abstract class Poligono {
    
    public abstract float area();
    public abstract float perimetro();
    /**
     * tostring poligono
     * @return "Poligono{" + '}'
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
