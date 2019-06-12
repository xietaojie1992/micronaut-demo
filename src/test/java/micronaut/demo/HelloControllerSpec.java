/*
 * Fabric4cloud.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package micronaut.demo;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

/**
 * @author taojie
 * @version $Id: HelloControllerTest.java, v 0.1 2019-06-10 14:26:50 taojie Exp $
 */
@MicronautTest
public class HelloControllerSpec {

    //@Inject
    //@Client("/")
    //HttpClient client;
    //
    //@Test
    //void testHelloResponse() {
    //    String response = client.toBlocking().retrieve(HttpRequest.GET("/hello"));
    //    System.out.print(response);
    //    Assertions.assertEquals("Hello World", response);
    //}

    @Inject
    HelloWorldClient helloWorldClient;

    @Test
    public void testHelloWorldResponse() {
        Assertions.assertEquals("Hello World", helloWorldClient.hello().blockingGet());
    }
}
