
package CodigoJava.Covarianza;

import CodigoJava.Clases.*;
import CodigoJava.Interfaces.*;

public class X implements C {
    
    public static ClaseA a = new ClaseA();
    public static ClaseB b = new ClaseB();
    public static ClaseC c = new ClaseC();

    @Override
    public A fooA(A a) {
        
        System.out.println(a);
        return a;

    }

    @Override
    public B fooB(B b) {
        
        System.out.println(b);
        return b;

    }

    @Override
    public C fooC(C c) {
        
        System.out.println(c);
        return c;

    }

    public static void main(String[] args) {
        
    	A myA = new ClaseA();
    	B myB = new ClaseB();
    	C myC = new ClaseC();
    	
    	// Creo que no deberia hacer casteo
    	
    	myA = a.fooA(a);
        myB = b.fooB(b);
        myC = c.fooC(c);

    }

}
