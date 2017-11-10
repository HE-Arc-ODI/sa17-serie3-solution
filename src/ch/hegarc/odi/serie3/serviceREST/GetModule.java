package ch.hegarc.odi.serie3.serviceREST;

import ch.hegarc.odi.serie3.service.MyMap;

import javax.ws.rs.*;


@Path("/getmodule")
public class GetModule {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Path("/{id}")
    @Produces("text/plain; charset=UTF-8")
    public String getClichedMessage(@PathParam("id") String param) {

        MyMap data = new MyMap();
        String value = data.getValue(Integer.parseInt(param));

        if( value != null){
            return value;
        }else{
           return "le module n'existe pas";
        }


    }
}