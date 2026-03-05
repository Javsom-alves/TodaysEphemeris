package com.javson.Ephemeris.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javson.Ephemeris.model.Ephemeris;

@Service
public class EphemerisService {

    private final EphemerisOllamaService ollamaService;

    public EphemerisService(EphemerisOllamaService ollamaService) {
        this.ollamaService = ollamaService;
    }

    private List<Ephemeris> ephemerisList = new ArrayList<>();

    public Ephemeris addEphemeris(Ephemeris ephemeris) {
        ephemerisList.add(ephemeris);
        return ephemeris;
    }

    public List<Ephemeris> getAll() {
        return ephemerisList;
    }

    public String ask(String question) {
        return ollamaService.askOllama(question);
    }
}