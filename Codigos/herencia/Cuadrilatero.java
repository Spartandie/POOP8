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
public class Cuadrilatero extends Poligono{
    private int alpha, beta;
    private float a, b, base, altura;
    
    /**
     * Constructor vacio
     */
    public Cuadrilatero() {
    }
    /**
     * Constructor con parametros
     * @param alpha alpha
     * @param beta beta
     * @param a a
     * @param b b
     * @param base base
     * @param altura altura
     */
    public Cuadrilatero(int alpha, int beta, float a, float b, float base, float altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return aplha 
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * 
     * @return beta
     */
    public int getBeta() {
        return beta;
    }
    /**
     * 
     * @return a
     */
    public float getA() {
        return a;
    }
    /**
     * 
     * @return b
     */
    public float getB() {
        return b;
    }
    /**
     * 
     * @return base 
     */
    public float getBase() {
        return base;
    }
    /**
     * 
     * @return altura
     */
    public float getAltura() {
        return altura;
    }
    /**
     * 
     * @param alpha alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * 
     * @param beta beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * 
     * @param a a
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * 
     * @param b b
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * 
     * @param base base
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * 
     * @param altura altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Funcion to string
     * @return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}'
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
