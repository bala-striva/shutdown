package com.example.shutdown;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    private final ApplicationProperties applicationProperties;

    public TestController(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @GetMapping("/test")
    public Mono<Integer> test() {
        return Mono
            .delay(applicationProperties.getDelay())
            .thenReturn(42);
    }

}
