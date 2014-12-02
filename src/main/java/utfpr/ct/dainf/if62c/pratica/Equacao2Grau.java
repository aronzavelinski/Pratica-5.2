/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1608355
 */
public class Equacao2Grau<N extends Number> {
    N a, b, c;
    
    public Equacao2Grau(){
    }
    
    public Equacao2Grau(N a, N b, N c) throws IllegalArgumentException {
        if(a.doubleValue()==0){
            throw new IllegalArgumentException("Coeficiente a não pode ser zero");
        }
            
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public N getA() {
        return a;
    }

    public void setA(N a) throws IllegalArgumentException {
        if(a.doubleValue()==0){
            throw new IllegalArgumentException("Coeficiente a não pode ser zero");
        }
        this.a = a;
    }

    public N getB() {
        return b;
    }

    public void setB(N b) {
        this.b = b;
    }

    public N getC() {
        return c;
    }

    public void setC(N c) {
        this.c = c;
    }
    
    public double getRaiz1() throws ArithmeticException{
        double r;
        double a = this.a.doubleValue();
        double b = this.b.doubleValue();
        double c = this.c.doubleValue();
        if((Math.pow(b,2)-4*a*c)<0)
            throw new ArithmeticException("Equação não tem solução real");
        r = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        return r;
    }
    
    public double getRaiz2() throws ArithmeticException{
        double r;
        double a = this.a.doubleValue();
        double b = this.b.doubleValue();
        double c = this.c.doubleValue();
        if((Math.pow(b,2)-4*a*c)<0)
            throw new ArithmeticException("Equação não tem solução real");
        r = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        return r;
    }
            
}
