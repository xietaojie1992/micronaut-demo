package micronaut.demo.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get(value = "/", produces = MediaType.TEXT_PLAIN)
    public String index() {
        System.out.print("/hello request received.");
        return "Hello World";
    }
}