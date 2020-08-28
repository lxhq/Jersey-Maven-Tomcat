package domain;


public class SayHelloImpl implements SayHello{

    public SayHelloImpl() {}

    @Override
    public String sayHello() {
        return "Hello World!";
    }
}
