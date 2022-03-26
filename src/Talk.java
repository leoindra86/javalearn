public interface Talk
{
        void sayHello();
}

/*

        Interfaces will just "announce" a method.
        This just tells you (and the compiler) that any Class that implements Talk has to supply a method called sayHello().
        Don't make them static, as this would prevent any class implementing the interface from overriding the method.

*/