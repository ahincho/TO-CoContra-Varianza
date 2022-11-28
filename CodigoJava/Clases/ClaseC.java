
package CodigoJava.Clases;

import CodigoJava.Interfaces.C;

public class ClaseC implements C {
    
    @Override
    public void fooA() {
        
        fooB();
        
    }

    @Override
    public void fooB() {

        fooC();
        
    }

    @Override
    public void fooC() {

        System.out.println("Objeto de Clase C.");

    }

}
