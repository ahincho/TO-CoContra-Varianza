
package CodigoJava.Clases;

import CodigoJava.Interfaces.B;

public class ClaseB implements B {

    @Override
    public void fooA() {
        
        fooB();

    }

    @Override
    public void fooB() {

        System.out.println("Objeto de Clase B.");

    }

}
