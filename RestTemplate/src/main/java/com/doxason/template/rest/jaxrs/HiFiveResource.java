package com.doxason.template.rest.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("resource")
public class HiFiveResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getResource() {
        return "Hi Five from my REST service!";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{name}")
    public String getResource(@PathParam("name") String name) {
    	return "Hi Five dear " + name + "!";
    }
}
