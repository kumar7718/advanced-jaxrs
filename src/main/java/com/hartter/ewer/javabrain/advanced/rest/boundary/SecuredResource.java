/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hartter.ewer.javabrain.advanced.rest.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eertl
 */
@Path("secured")
public class SecuredResource {
    
    @GET
    @Path("message")
    @Produces(MediaType.TEXT_PLAIN)
    public String secured() {
        return "This is secured";
    }
}
