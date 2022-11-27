
package CodigoJava.Clases;

import CodigoJava.Interfaces.A;

public class ClaseA implements A {

    @Override
    public A fooA(A a) {

        System.out.println(a);
        return a;

    }

    @Override
    public String toString() {

        return "Objeto de Clase A.";

    }

}
