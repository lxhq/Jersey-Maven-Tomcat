package com.exercise;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Hello world!
 *
 */
@ApplicationPath("/api")
public class App extends ResourceConfig
{
    public App() {
        //packages("restful");
    }
}
