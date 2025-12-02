package com.Aereoporto.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.Aereoporto.demo.repository.VoloOperativoRepository;
import com.Aereoporto.demo.model.VoloOperativo;

import java.util.List;

@Component
public class TestMongoConnection implements CommandLineRunner {

    @Autowired
    private VoloOperativoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<VoloOperativo> voli = repository.findAll();
        voli.forEach(v -> System.out.println(v.getId() + " - " + v.getStato()));

    }


}
