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
    @Path("dte/{amount}")
    public Response dollarsToEuro(@PathParam("amount") Double dollar ){

        Double euro = dollar * 1.5;

        JSONObject object = new JSONObject();
        object.put("total", euro);

        return Response.status(200).entity(object.toString()).build();

    }

    @GET
    @Produces("application/json")
    @Path("etd")
    public Response euroToDollar(){
        return Response.status(200).build();
    }

}
