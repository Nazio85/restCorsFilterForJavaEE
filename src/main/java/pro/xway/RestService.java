package pro.xway;


import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("product")
@ApplicationPath("api")
public class RestService extends Application {


    @GET
    @Path("getKey")
    @Produces(MediaType.TEXT_PLAIN)
    public String key() {
        System.out.println("RestService.key");
        return  "test";
    }



    @POST
    @Path("test")
    @Consumes(MediaType.APPLICATION_JSON)
    public String post(Product product) {
        System.out.println("POST");
        return "test";
    }
}
