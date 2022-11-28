
package CodigoJava.Varianza;

import CodigoJava.Interfaces.*;

public class Y extends X {
	
	/* 
	 * Posibles casos vistos para argumentos
	 * A.foo(B)
	 * A.foo(C)
	 * B.foo(C)
	 * 
	 * Posibles casos vistos para retornos
	 * B.foo(A)
	 * C.foo(A)
	 * C.foo(B)
	 * 
	 */
	
	// Varianza en el argumento recibido <? extends S>
	
	public A covarianzaAB(B b) {
		
		return super.invarianzaA(b);
		
	}
	
	public A covarianzaAC(C c) {
		
		return super.invarianzaA(c);
		
	}
	
	public B covarianzaBC(C c) {
		
		return super.invarianzaB(c);
		
	}
	
	// Varianza en el argumento retornado <? super S>
	
	public B contraVarianzaCB(C c) {
		
		return super.invarianzaC(c);
		
	}
	
	public A contraVarianzaCA(C c) {
		
		return super.invarianzaC(c);
		
	}
	
	public A contraVarianzaBA(B b) {
		
		return super.invarianzaB(b);
		
	}

}
