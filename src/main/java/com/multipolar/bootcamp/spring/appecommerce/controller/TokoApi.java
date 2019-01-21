package com.multipolar.bootcamp.spring.appecommerce.controller;


import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/toko")
public class TokoApi {

    @Autowired
    private TokoRepository tokoRepository;


    @GetMapping("/list")
    public Iterable<Toko> findAll() {
        return tokoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Toko> findById(@PathVariable("id") String id) {
        Optional<Toko> tokoOptional = tokoRepository.findById(id);
        if (tokoOptional.isPresent())
            return ResponseEntity.ok(tokoOptional.get());
        else
            return ResponseEntity.noContent().build();
    }






    @RequestMapping(path = "/", method = RequestMethod.POST)
    public ResponseEntity<Toko> save(@RequestBody Toko toko) {
        toko = tokoRepository.save(toko);
        return ResponseEntity.ok(toko);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") String id) {
        Optional<Toko> tokoOptional = tokoRepository.findById(id);
        if (tokoOptional.isPresent()) {
            tokoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }




}
