import com.google.inject.Guice;
import com.google.inject.Injector;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;
import org.jvnet.hk2.guice.bridge.api.GuiceBridge;
import org.jvnet.hk2.guice.bridge.api.GuiceIntoHK2Bridge;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;

/**
 * Hello world!
 *
 */
@ApplicationPath("/")
public class App extends ResourceConfig
{
    @Inject
    public App(ServiceLocator locator) {
        //packages("rest");
        Injector injector = Guice.createInjector(new SayHelloModule());
        initGuiceIntoHK2Bridge(locator, injector);
    }

    private void initGuiceIntoHK2Bridge(ServiceLocator serviceLocator, Injector injector) {
        GuiceBridge.getGuiceBridge().initializeGuiceBridge(serviceLocator);
        GuiceIntoHK2Bridge guiceBridge = serviceLocator.getService(GuiceIntoHK2Bridge.class);
        guiceBridge.bridgeGuiceInjector(injector);
    }
}
