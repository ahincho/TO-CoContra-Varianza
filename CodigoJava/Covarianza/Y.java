
package CodigoJava.Covarianza;

import CodigoJava.Clases.*;
import CodigoJava.Interfaces.*;

public class Y extends X implements C {
	
	/*
	@Override
	public B fooA(A a) {
		
		System.out.println(a);
		return (B) a;
		
	}
	*/
	
	// Solo puedo tener un metodo sobreescrito a la vez
	
	
	@Override
	public C fooA(A a) {
		
		System.out.println(a);
		return (C) a;
		
	}
	
	
    public static void main(String[] args) {
    	
    	A myA = new ClaseA();
    	B myB = new ClaseB();
    	C myC = new ClaseC();
        
    	myA = a.fooA(a);
        myA = (ClaseA) a.fooA(c);
        b.fooB(b);
        c.fooC(c);

    }

}
