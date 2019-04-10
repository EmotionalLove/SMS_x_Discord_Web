package com.sasha.smsxdiscord.backend.endpoint;

import com.sasha.smsxdiscord.backend.SystemApplication;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("about")
public class ServerInformationEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getProperties(@Context HttpServletRequest context) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("name", SystemApplication.SOFTWARE_NAME);
        builder.add("version", SystemApplication.SOFTWARE_VERSION);
        return builder.build();
    }
}
