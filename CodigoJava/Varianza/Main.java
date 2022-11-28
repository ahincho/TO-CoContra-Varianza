
package CodigoJava.Varianza;

import CodigoJava.Clases.*;
import CodigoJava.Interfaces.*;

public class Main {
	
	static public A a = new ClaseA();
	static public B b = new ClaseB();
	static public C c = new ClaseC();
	static public X x = new X();
	static public Y y = new Y();
	static public A myA = new ClaseA();
	static public B myB = new ClaseB();
	static public C myC = new ClaseC();
	
	public static void main(String[] args) {
    	
    	casosNormales();
    	casosVarianza();
    	
    }
	
    public static void casosNormales() {
    	
    	// Creo que no deberia hacer casteo
    	
    	System.out.println("Casos normales ...\n");
    	System.out.println("Para Objeto A.");
    	myA = x.invarianzaA(a);
    	System.out.println();
    	System.out.println("Para Objeto B.");
        myB = x.invarianzaB(b);
        System.out.println();
    	System.out.println("Para Objeto C.");
        myC = x.invarianzaC(c);
        System.out.println();
    	
    }
    
    public static void casosVarianza() {
    	
    	// Creo que no deberia castear ...
    	
    	System.out.println("Casos con varianza ...\n");
    	System.out.println("Casos de Covarianza para A");
    	myA = y.covarianzaAB(b);
    	myA = y.covarianzaAC(c);
    	System.out.println();
    	System.out.println("Casos de Covarianza para B");
        myB = y.covarianzaBC(c);
        System.out.println();
    	
        System.out.println("Casos de Contravarianza para C");
        myB = y.contraVarianzaCB(c);
        myA = y.contraVarianzaCA(c);
        System.out.println();
        System.out.println("Casos de Contravarianza para B");
        myA = y.contraVarianzaBA(b);
        System.out.println();
    	
    }
    
}
