package restClasses;

import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/converter")
public class CurrencyConverterRest {

    @GET
    @Produces("application/json")
    @Path("{amount}")
    public Response dToE(@PathParam("amount") Integer amount) {

        JSONObject object = new JSONObject();

        object.put("result", amount * 5);

        return Response.status(200).entity(object.toString()).build();
    }

}
