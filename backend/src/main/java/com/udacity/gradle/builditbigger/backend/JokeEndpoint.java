package com.udacity.gradle.builditbigger.backend;

import com.example.jokelib.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "jokeApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

    /** A simple endpoint method that gets a random joke from the java library */
    @ApiMethod(name = "tellRandomJoke")
    public JokeBean tellRandomJoke() {
        JokeBean response = new JokeBean();
        response.setData(JokeProvider.tellRandomJoke());
        return response;
    }

}
