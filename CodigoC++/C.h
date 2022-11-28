
# ifndef C_H
# define C_H

# include "B.h"

class C : public B
{
    public:
        virtual void fooA() = 0;
        virtual void fooB() = 0;
        virtual void fooC() = 0;
};

# endif
