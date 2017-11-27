package ie.cit.restapp.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ie.cit.restapp.entites.Greeting;

@RestController
public class GreetingController {

    private static final String greetingTemplate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(greetingTemplate, name));
        /*
         * Entering      http://localhost:8088/greeting?name=qwert
         * results in Hello, qwert
         */
    }
    
    @RequestMapping(value="/greetingtwo", method = RequestMethod.GET, produces = "application/json")
    public Greeting greetingtwo(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(greetingTemplate, name));
    }
}
