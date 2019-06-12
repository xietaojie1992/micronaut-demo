package micronaut.demo;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Single;

@Client("/")
public interface HelloWorldClient {

    @Get("/hello")
    Single<String> hello();

}
