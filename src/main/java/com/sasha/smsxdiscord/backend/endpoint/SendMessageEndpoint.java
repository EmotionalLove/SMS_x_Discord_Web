package com.sasha.smsxdiscord.backend.endpoint;

import com.sasha.smsxdiscord.backend.SystemApplication;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("send")
public class SendMessageEndpoint {

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response getProperties(@FormParam("text") String obj, @FormParam("html") String html) {
        System.out.println("txt: " + obj);
        System.out.println("html: " + html);
        SystemApplication.discord.send(html == null ? obj : html);
        return Response.ok().build(); // if you don't return OK to sendgrid, it'll get mad and keep trying to push the message
    }
}
