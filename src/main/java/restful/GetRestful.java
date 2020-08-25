package restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/asd")
public class GetRestful {

    @GET
    public Response getResponse() {
        return Response.ok("Hello World").build();
    }
}
