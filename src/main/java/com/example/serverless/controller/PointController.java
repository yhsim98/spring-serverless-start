package com.example.serverless.controller;

import com.example.serverless.dto.PointDTO;
import com.example.serverless.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/point")
public class PointController {

    @GetMapping("")
    public ResponseEntity<Map> get() {
        Map<String, HttpStatus> response = new HashMap<>();
        response.put("httpStatus", HttpStatus.OK);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Response<PointDTO>> post(@RequestBody PointDTO request) {
        return new ResponseEntity<>(new Response<>(HttpStatus.CREATED, request), HttpStatus.CREATED);
    }

    @GetMapping("/error")
    public ResponseEntity error() {
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }
}


