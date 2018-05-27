package com.kripesh.sam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class DefaultController {

    @GetMapping("/")
    public ResponseEntity<?> index(){
        return new ResponseEntity<>(Collections.singletonMap("result","Hello World"), HttpStatus.OK);
    }
}
