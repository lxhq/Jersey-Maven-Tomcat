package rest;

import domain.SayHelloImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/resource")
public class GetRestful {

    @Inject
    private SayHelloImpl sh;

    @GET
    public Response getResponse() {
        return Response.ok(sh.sayHello()).build();
    }
}
