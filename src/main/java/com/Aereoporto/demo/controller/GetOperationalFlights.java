package com.Aereoporto.demo.controller;

import com.Aereoporto.demo.model.VoloOperativo;
import com.Aereoporto.demo.repository.VoloOperativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class GetOperationalFlights {

    @Autowired
    private VoloOperativoRepository voloOperativoRepository;

    @GetMapping("/operational_flights")
    public ResponseEntity<List<VoloOperativo>> getAllOperationalFlights() {
        List<VoloOperativo> list = voloOperativoRepository.findAll();
        return ResponseEntity.ok(list);
    }
}
