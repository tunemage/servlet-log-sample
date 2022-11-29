package jp.gr.java_conf.tunemage.resource_dummy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello2")
public class JaxRsResourceDummy {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Resources should not be available due to JerseyConfig settings.";
    }
}