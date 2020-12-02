/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author spart
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono = new Poligono();
        System.out.println("A1********************************");
        /* Las clases base pueden comportarse como sus subclases*/
        
        Object objeto = new Object();
        System.out.println("Object "+objeto);
        objeto = poligono;
        System.out.println("Object como Poligono "+poligono);
        
        Object objeto2 = poligono;
        System.out.println("Object2 "+objeto2);
        
        Object objeto3 = new Poligono();
        System.out.println("Objeto3 "+objeto3);
        
        System.out.println("A2*******************************");
        
        poligono = new Triangulo();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Cuadrilatero();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        poligono = new Poligono();
        System.out.println(poligono);
        selectorPoligonos(poligono);
        
        
    }
    
    public static void selectorPoligonos(Poligono poligono){
        if(poligono instanceof Triangulo){
            System.out.println("El objeto es un triangulo");
        }else if(poligono instanceof Cuadrilatero){
            System.out.println("El poligono es un cuadrilatero");
        }
        else
        {
            System.out.println("El objeto es un poligono");
        }
    }
}
