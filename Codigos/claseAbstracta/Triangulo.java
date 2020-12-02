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
public class Triangulo extends Poligono{
    private float a, b, c, base, altura;
    private int alpha, beta, gamma;
    
     /**
     * Constructor vacio
     */
    public Triangulo()
    {
    }
    /**
     * Constructor con parametros
     * @param a a
     * @param b b
     * @param c c
     * @param base base
     * @param altura altura
     * @param alpha aplha
     * @param beta beta
     * @param gamma  gamma
     */
    public Triangulo(float a, float b, float c, float base, float altura, int alpha, int beta, int gamma) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
    }
    /**
     * 
     * @return  a
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
     * @return c
     */
    public float getC() {
        return c;
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
     * @return alpha
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
     * @return gamma
     */
    public int getGamma() {
        return gamma;
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
     * @param c c
     */
    public void setC(float c) {
        this.c = c;
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
     * @param gamma gamma
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }
    /**
     * 
     * @return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}'
     */
    @Override
    public String toString() {
        return "Triangulo{" + "a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + ", alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + '}';
    }
    
    /**
     * area triangulo
     * @return base*altura)/2
     */
    @Override
    public float area(){
        return (base*altura)/2;
    }
    /**
     * perimetro triangulo
     * @return a+b+c
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
}