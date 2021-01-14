package educanet;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("payment-method")
@Produces(MediaType.APPLICATION_JSON)
public class Payment{

    private static int counter = 0;

    @GET
    public Response getAllPayments(){
        String[] paymentMethods = {"visa", "mastercard", "cash"};
        return Response.ok(paymentMethods).build();
    }

    @GET
    @Path("info")
    public Response info(){
        return Response.ok(counter).build();
    }

    @POST
    @Path("increment")
    public Response increment(){
        counter++;
        return Response.ok(counter).build();
    }

    @DELETE
    @Path("decrement")
    public Response decrement(){
        counter--;
        return Response.ok(counter).build();
    }
}