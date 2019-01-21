package com.multipolar.bootcamp.spring.appecommerce.controller;


import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("api/pelanggan")
public class PelangganApi {

    @Autowired
    private PelangganRepository pelangganRepository;


    @GetMapping("/list")
    public Iterable<Pelanggan> findAll() {
        return pelangganRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(@PathVariable("id") String id) {
        Optional<Pelanggan> pelangganOptional= pelangganRepository.findById(id);
        if (pelangganOptional.isPresent())
            return ResponseEntity.ok(pelangganOptional.get());
        else
            return ResponseEntity.noContent().build();
    }


    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Pelanggan> save(@RequestBody Pelanggan pelanggan) {
        pelanggan = pelangganRepository.save(pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Pelanggan> pelangganOptional = pelangganRepository.findById(id);
        if (pelangganOptional.isPresent()) {
            pelangganRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }




}
