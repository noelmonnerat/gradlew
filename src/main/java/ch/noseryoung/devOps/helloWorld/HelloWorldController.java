package ch.noseryoung.devOps.helloWorld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    @GetMapping
    public ResponseEntity<String> helloWorld() {
        String message = "Hello World";

        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
