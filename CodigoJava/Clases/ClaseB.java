
package CodigoJava.Clases;

import CodigoJava.Interfaces.A;
import CodigoJava.Interfaces.B;

public class ClaseB implements B {

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
    public String toString() {

        return "Objeto de Clase B.";

    }

}
