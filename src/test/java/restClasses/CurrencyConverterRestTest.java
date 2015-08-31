package restClasses;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CurrencyConverterRestTest {

    @Test
    public void testDollarsToEuro() throws Exception {

        Client client = Client.create();

        WebResource resource = client.resource("http://localhost:8080/restExample/myRestApp/converter/dte/100");

        ClientResponse response = resource.accept("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200){
            throw  new RuntimeException("Request failed!");
        }


        String output = response.getEntity(String.class);

        JSONObject object = new JSONObject(output);

        Assert.assertEquals(150, object.get("total"));

    }
}