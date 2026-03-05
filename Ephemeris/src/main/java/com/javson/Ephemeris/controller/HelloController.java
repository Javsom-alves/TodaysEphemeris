package com.javson.Ephemeris.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javson.Ephemeris.model.Ephemeris;
import com.javson.Ephemeris.service.EphemerisService;
import com.javson.Ephemeris.model.EphemerisQuestion;


@RestController
public class HelloController {

    private final EphemerisService ephemerisService;

    public HelloController(EphemerisService ephemerisService) {
        this.ephemerisService = ephemerisService;
    }


    @GetMapping("/ephemeris")
    public List<Ephemeris> ephemeris() {
        return ephemerisService.getAll();
    }

  
    @PostMapping("/ephemeris")
    public Ephemeris createEphemeris(@RequestBody Ephemeris ephemeris) {
        return ephemerisService.addEphemeris(ephemeris);
    }

    @PostMapping("/ephemeris/ask")
    public String askEphemeris(@RequestBody EphemerisQuestion question) {
        return ephemerisService.ask(question.getQuestion());
    }


}
