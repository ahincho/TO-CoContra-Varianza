
package CodigoJava.Varianza;

import CodigoJava.Clases.ClaseA;
import CodigoJava.Clases.ClaseB;
import CodigoJava.Clases.ClaseC;

public class X {
    
    static ClaseA a = new ClaseA();
    static ClaseB b = new ClaseB();
    static ClaseC c = new ClaseC();

    public static void main(String[] args) {

        a.fooA(a);
        b.fooB(b);
        c.fooC(c);
        
    }

}
