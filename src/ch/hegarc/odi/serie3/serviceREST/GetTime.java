package ch.hegarc.odi.serie3.serviceREST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Path("/gettime")
public class GetTime {

    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain; charset=UTF-8")
    public String getClichedMessage() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDate = LocalDateTime.now();
        return dtf.format(localDate);

    }
}
