import com.google.inject.AbstractModule;
import domain.SayHello;
import domain.SayHelloImpl;

public class SayHelloModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SayHello.class).to(SayHelloImpl.class);
    }
}
