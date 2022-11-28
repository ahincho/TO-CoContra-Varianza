
# include <stdio.h>

class A
{
    public:
        void fooA()
        {
            printf("Objeto de la Clase A.\n");
        }
};

class B : public A
{
    public:
        void fooB()
        {
            printf("Objeto de la Clase B.\n");
        }
};

class C : public B
{
    public:
        void fooC()
        {
            printf("Objeto de la Clase C.\n");
        }
};

class X
{
    public:
        A invarianzaA(A a)
        {
            a.fooA();
            return a;
        }
        B invarianzaB(B b)
        {
            b.fooB();
            return b;
        }
        C invarianzaC(C c)
        {
            c.fooC();
            return c;
        }
};

class Y : public X
{
    public:
        // Covarianza
        A covarianzaAB(B b)
        {
            return X::invarianzaA(b);
        }
        A covarianzaAC(C c)
        {
            return X::invarianzaA(c);
        }
        B covarianzaBC(C c)
        {
            return X::invarianzaB(c);
        }
        // Contravarianza
        B contraVarianzaCB(C c)
        {
            return X::invarianzaC(c);
        }
        A contraVarianzaCA(C c)
        {
            return X:: invarianzaC(c);
        }
        A contraVarianzaBA(B b)
        {
            return X::invarianzaB(b);
        }
};

class Main
{
    A a, myA;
    B b, myB;
    C c, myC;
    X x;
    Y y;
    public:
        void casosNormales()
        {
            printf("Casos Normales\n");
            myA = x.invarianzaA(a);
            myB = x.invarianzaB(b);
            myC = x.invarianzaC(c);
        }
        void casosCovarianza()
        {
            printf("Casos de Covarianza para A\n");
            myA = y.covarianzaAB(b);
            myA = y.covarianzaAC(c);
            printf("Casos de Covarianza para B\n");
            myB = y.covarianzaBC(c);
        }
        void casosContravarianza()
        {
            printf("Casos de Contravarianza para C\n");
            myB = y.contraVarianzaCB(c);
            myA = y.contraVarianzaCA(c);
            printf("Casos de Contravarianza para B\n");
            myA = y.contraVarianzaBA(b);
        }
        void probarVarianza()
        {
            casosNormales();
            casosCovarianza();
            casosContravarianza();
        }
};

int main()
{
    Main prueba;
    prueba.probarVarianza();
}
