package com.Aereoporto.demo.controller;

import com.Aereoporto.demo.model.VoloOperativo;
import com.Aereoporto.demo.repository.VoloOperativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class GetFlights {

    @Autowired
    private VoloOperativoRepository voloOperativoRepository;

    // GET /flights/{flightId}
    @GetMapping("/{flightId}")
    public ResponseEntity<VoloOperativo> getFlightsById(@PathVariable String flightId){

        Optional<VoloOperativo> op = voloOperativoRepository.findById(flightId);

        return op.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
