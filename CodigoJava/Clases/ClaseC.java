
package CodigoJava.Clases;

import CodigoJava.Interfaces.A;
import CodigoJava.Interfaces.B;
import CodigoJava.Interfaces.C;

public class ClaseC implements C {
    
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

    @Override
    public String toString() {

        return "Objeto de Clase C.";

    }

}
